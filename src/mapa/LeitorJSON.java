package mapa;

import entidades.Jogador;
import itens.Inventario;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeitorJSON {
    
	public LeitorJSON(Map mapa, Jogador user){
		JSONObject jsonObject;
        JSONParser parser = new JSONParser();
        JSONArray vetorSalas;
        JSONArray vetorCorredores;

        try {
            jsonObject = (JSONObject) parser.parse(new FileReader("mapa/mapa2.json"));
            mapa.setNumeroSalas((int) (long) jsonObject.get("numeroSalas"));
            mapa.setSaida((int) (long) jsonObject.get("saida"));
            user.setCurrentRoom((int) (long) jsonObject.get("entrada"));
            mapa.setNumeroCorredores((int) (long) jsonObject.get("numeroCorredores"));                        
            vetorSalas = (JSONArray) jsonObject.get("vetorSalas");
            Iterator iterator = vetorSalas.iterator();
            int i = 0;
            while (iterator.hasNext()) {
                
                JSONObject objetoInterior = (JSONObject) iterator.next();
                int metros = (int) (long) objetoInterior.get("metros");                
                JSONArray vetorInternoNomesPortas = (JSONArray) objetoInterior.get("portas");
                char[] nomesPortas = new char[vetorInternoNomesPortas.size()];       
                
                for (int j = 0; j < vetorInternoNomesPortas.size(); j++) {
                    String letra = (String) vetorInternoNomesPortas.get(j);
                    nomesPortas[j] = letra.charAt(0);                    
                }
                JSONArray vetorInternoConexoesPortas = (JSONArray) objetoInterior.get("setores");
                int[] conexaoSetor = new int[vetorInternoConexoesPortas.size()];                
                
                for (int j = 0; j < vetorInternoConexoesPortas.size(); j++) {
                    
                    conexaoSetor[j] = (int) (long) vetorInternoConexoesPortas.get(j);                    
                }
                JSONArray vetorInternoConexoesCorredores = (JSONArray) objetoInterior.get("corredores");
                int[] conexaoCorredores = new int[vetorInternoConexoesCorredores.size()];
                
                for (int j = 0; j < vetorInternoConexoesCorredores.size(); j++) {
                    conexaoCorredores[j] = (int) (long) vetorInternoConexoesCorredores.get(j);                
                }
                
                Sala novaSala = new Sala();
                Sala salaTemp = novaSala.novaSala(metros, nomesPortas, mapa.getNomesTrolls());
                salaTemp.configurarPorta(nomesPortas, conexaoCorredores, conexaoSetor); 
                salaTemp.setItens(new Inventario().geraMPC(salaTemp.getPortas(), true)); 
                mapa.getSalas().put(i, salaTemp);
                i++;
            }            
            //Ler os corredores.
            vetorCorredores = (JSONArray) jsonObject.get("vetorCorredores");
            iterator = vetorCorredores.iterator();
            i = 0;
            while (iterator.hasNext()) {
                
                JSONObject objetoInterior = (JSONObject) iterator.next();
                int metros = (int) (long) objetoInterior.get("metros");
              
                JSONArray vetorInternoNomesPortas = (JSONArray) objetoInterior.get("portas");
                char[] nomesPortas = new char[vetorInternoNomesPortas.size()];              
                for (int j = 0; j < vetorInternoNomesPortas.size(); j++) {
                    String letra = (String) vetorInternoNomesPortas.get(j);
                    nomesPortas[j] = letra.charAt(0);                    
                }                
                JSONArray vetorInternoConexoesPortas = (JSONArray) objetoInterior.get("conexoes");
                int[] conexaoPortas = new int[vetorInternoConexoesPortas.size()];
                for (int j = 0; j < vetorInternoConexoesPortas.size(); j++) {
                    
                    conexaoPortas[j] = (int) (long) vetorInternoConexoesPortas.get(j);                 
                }                
                JSONArray vetorInternoPosicoesCorredor = (JSONArray) objetoInterior.get("posicoes");
                int[] posicoesCorredor = new int[vetorInternoPosicoesCorredor.size()];
                for (int j = 0; j < vetorInternoPosicoesCorredor.size(); j++) {
                    
                    posicoesCorredor[j] = (int) (long) vetorInternoPosicoesCorredor.get(j);                    
                }                
                int tempMetros = metros, qtdeSetor;
                if(tempMetros % 500 == 0){
                    
                    qtdeSetor = tempMetros / 500;
                }else{
                    
                    qtdeSetor = (tempMetros / 500) + 1;
                }
                Corredor tempCorredor = new Corredor();
                
                int x = 0;
                while(x < qtdeSetor){
                                     
                    Setor setor = new Setor(metros, nomesPortas, mapa.getNomesTrolls());
                    setor.setIdCorredor(i);                     
                    tempCorredor.getSetores().put(x, setor);
                    ++x;
                }                
                
                for(int nSet = 0; nSet < qtdeSetor; ++nSet){                                        
                                        
                    if (nSet > 0 && nSet < qtdeSetor - 1) {
                    
                        // Porta a ser adicoinada...
                        Porta novaPorta = new Porta().novaPorta('+', true, nSet + 1);
                        Porta novaPorta1 = new Porta().novaPorta('-', true, nSet - 1);                        
                        tempCorredor.getSetores().get(nSet).getPortasCorredor().getListaPortas().add(novaPorta);
                        tempCorredor.getSetores().get(nSet).getPortasCorredor().getListaPortas().add(novaPorta1);
                    } else if (nSet == 0 && qtdeSetor > 1) {

                        Porta novaPorta = new Porta().novaPorta('+', true, nSet + 1);
                        tempCorredor.getSetores().get(nSet).getPortasCorredor().getListaPortas().add(novaPorta);
                    }else if (nSet == qtdeSetor - 1 && qtdeSetor > 1) {

                        Porta novaPorta = new Porta().novaPorta('-', true, nSet - 1);
                        tempCorredor.getSetores().get(nSet).getPortasCorredor().getListaPortas().add(novaPorta);
                    }                                                         
                    // Criação de portas que apontam para sala...                                                                                                  
                }
                Random geraRandom = new Random();
                boolean trueOrfalse;              
                for(int z = 0; z < conexaoPortas.length;++z){
                                        
                    trueOrfalse = geraRandom.nextBoolean();
                    Porta novaPorta = new Porta().novaPorta(nomesPortas[z], true/*trueOrfalse*/, conexaoPortas[z]);
                    tempCorredor.getSetores().get(posicoesCorredor[z]).getPortasSalas().getListaPortas().add(novaPorta);                    
                }
                // Gerando chaves nos corredores...
                for(int z = 0; z < conexaoPortas.length;++z){
                                        
                    tempCorredor.getSetores().get(posicoesCorredor[z]).setItens(new Inventario().geraMPC(tempCorredor.getSetores().get(posicoesCorredor[z]).getPortasSalas(), false));
                }
                mapa.getCorredores().put(i, tempCorredor);
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
