package legentrolls;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Trolls {
    
    String[] nome = new String[5];
    int qtdeTrolls;

    public String getNome(int pos) {
        return this.nome[pos];
    }

    public void setNome(String nome, int pos) {
        
        this.nome[pos] = nome;
    }

    public int getQtdeTrolls() {
        return qtdeTrolls;
    }
    
    public void setQtdeTrolls(int qtdeTrolls){
        
        this.qtdeTrolls = qtdeTrolls;
    }
    
    public void increQtdeTrolls(){
        
        this.qtdeTrolls++;
    }
    public void decreQtdeTrolls(){
        
        this.qtdeTrolls--;
    }
    public void removeTrolls(String nome){
        
        if(getQtdeTrolls() > 0){
        
            for(int i = 0; i < 3; ++i){
                
                if(nome.equalsIgnoreCase(getNome(i))){
              
                    System.out.println("Você matou o troll "+getNome(i)+"!");
                    setNome("-", i);
                    this.qtdeTrolls--;
                    return;               
                }
            }
            System.out.println("Não existe troll '"+nome+"' nessa sala.");
        }else{
            
            System.out.println("Não há trolls no local.");
        }
    }
     
    public void listaTrolls() {
        
        System.out.println("Número de trolls: " + getQtdeTrolls() + ".");
        for(int i = 0; i < 5; i++){
            
            if(!"-".equals(getNome(i))){
                
                System.out.println(getNome(i));
            }
        }
    }
    
    public void criaTrolls() throws FileNotFoundException, IOException{
        
        /* Capturando nomes do arquivo de texto. */
        
        String[] vetorNomes;
        vetorNomes = new String[20];
        int i = 0;
        String endereco = System.getProperty("user.dir");
        endereco = endereco + "/nomes/Nomes.txt";
        Scanner leitor = new Scanner(new FileReader(endereco));
        while(leitor.hasNext() && i < 20){
            
            vetorNomes[i] = leitor.next();
        ++i;
        }
        // Atribuindo nomes aos trolls.
        Random gerador = new Random();
        int qtde = gerador.nextInt(3);
        for(i = 0; i < qtde; ++i){
            
            int rd = gerador.nextInt(20);
            setNome(vetorNomes[rd], i);
        }
        setQtdeTrolls(qtde);
    }   

    public Trolls() {
        
        for(int i = 0; i < 5; ++i){
            
            this.nome[i] = "-";
        }
    }
}
