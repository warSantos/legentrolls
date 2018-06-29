package legentrolls;

import interfaces.gui.InterfaceUI;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mapa extends Thread {
    
    private Sala[] mapaSalas;
    private Personagem player;

    public Sala[] getMapaSalas() {
        return mapaSalas;
    }

    public void setMapaSalas(Sala[] mapaSalas) {
        this.mapaSalas = mapaSalas;
    }

    public Personagem getPlayer() {
        return player;
    }

    public void setPlayer(Personagem player) {
        this.player = player;
    }

    public Mapa() {
        
        this.mapaSalas = new Sala[20];
        for (int i = 0; i < 20; ++i) {
            this.mapaSalas[i] = new Sala();
        }
        this.player = new Personagem();
    }

    public void constroiSalas() throws IOException {

        /* Capturando arquivo com nomes de trolls */
        for (int j = 0; j < 20; j++) {
            mapaSalas[j].getTroll().criaTrolls();
            mapaSalas[j].getBau().criarItens();
        }
        InterfaceUI.getInstance().escreverSaida("Finalizando construção das salas...");
    }

    public void buildMapa() {

        player.buildPlayer();
        mapaSalas[15].setVisitado(1);
        mapaSalas[15].setJogadorEsta(1);
        /* Iniciando portas */
        /* (qual porta do vetor, qual porta para sala, estado) */
        InterfaceUI.getInstance().escreverSaida("Criando salas...");

        mapaSalas[0].getPortas().setPortas(0, 1, 2); // 0,1
        mapaSalas[0].getPortas().setPortas(1, 5, 2); // 0,5

        mapaSalas[1].getPortas().setPortas(0, 0, 2); // 1,0
        mapaSalas[1].getPortas().setPortas(1, 2, 1);

        mapaSalas[2].getPortas().setPortas(0, 1, 1);
        mapaSalas[2].getPortas().setPortas(1, 3, 2); // 2,3

        mapaSalas[3].getPortas().setPortas(0, 2, 2); // 3,2
        mapaSalas[3].getPortas().setPortas(1, 8, 1);

        mapaSalas[4].getPortas().setPortas(0, 9, 1);

        mapaSalas[5].getPortas().setPortas(0, 0, 2); // 5,0
        mapaSalas[5].getPortas().setPortas(1, 6, 1);

        mapaSalas[6].getPortas().setPortas(0, 5, 1);
        mapaSalas[6].getPortas().setPortas(1, 7, 1);
        mapaSalas[6].getPortas().setPortas(2, 11, 1);

        mapaSalas[7].getPortas().setPortas(0, 6, 1);
        mapaSalas[7].getPortas().setPortas(1, 12, 2); // 7,12

        mapaSalas[8].getPortas().setPortas(0, 3, 1);
        mapaSalas[8].getPortas().setPortas(1, 9, 1);

        mapaSalas[9].getPortas().setPortas(0, 4, 1);
        mapaSalas[9].getPortas().setPortas(1, 8, 1);
        mapaSalas[9].getPortas().setPortas(2, 14, 2); // 9,14

        mapaSalas[10].getPortas().setPortas(0, 11, 2); // 10,11
        mapaSalas[10].getPortas().setPortas(1, 15, 1);

        mapaSalas[11].getPortas().setPortas(0, 6, 1);
        mapaSalas[11].getPortas().setPortas(1, 10, 2); // 11,10

        mapaSalas[12].getPortas().setPortas(0, 7, 2); // 12,7
        mapaSalas[12].getPortas().setPortas(1, 17, 1);

        mapaSalas[13].getPortas().setPortas(0, 14, 1);

        mapaSalas[14].getPortas().setPortas(0, 9, 2); // 14,9
        mapaSalas[14].getPortas().setPortas(1, 13, 1);
        mapaSalas[14].getPortas().setPortas(2, 19, 1);

        mapaSalas[15].getPortas().setPortas(0, 10, 1);
        mapaSalas[15].getPortas().setPortas(1, 16, 1);

        mapaSalas[16].getPortas().setPortas(0, 15, 1);
        mapaSalas[16].getPortas().setPortas(1, 17, 1);

        mapaSalas[17].getPortas().setPortas(0, 12, 1);
        mapaSalas[17].getPortas().setPortas(1, 16, 1);

        mapaSalas[18].getPortas().setPortas(0, 19, 2); // 18,19

        mapaSalas[19].getPortas().setPortas(1, 14, 1);
        mapaSalas[19].getPortas().setPortas(1, 18, 2); // 19,18
        
        /* Configurando Sala (intens e trolls).*/

        InterfaceUI.getInstance().escreverSaida("Criando Itens e Trolls...");

        try {
            constroiSalas();
        } catch (IOException ex) {
            Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void lsMap(){
        
        InterfaceUI.getInstance().escreverSaida("");
        InterfaceUI.getInstance().escreverSaida("");
        for(int i = 0; i < 4; ++i){
            for(int j = 0; j < 5;++j){
                if(mapaSalas[(i * 5) + j].getVisitado() == 1){
                    if(((i * 5) + j) > 9){
                        InterfaceUI.getInstance().escreverSaida("  | " + ((i * 5) + j) +"   |  "); 
                    }else{
                        InterfaceUI.getInstance().escreverSaida("  |  " + ((i * 5) + j) +"   |  ");
                    }
                }
            }
            InterfaceUI.getInstance().escreverSaida("");
            InterfaceUI.getInstance().escreverSaida("");
        }
    }
    
    public void view() {
        
        InterfaceUI.getInstance().escreverSaida("");
        InterfaceUI.getInstance().escreverSaida("Sala: " + player.getPosicao() + " Itens: ");
        InterfaceUI.getInstance().escreverSaida("");
        InterfaceUI.getInstance().escreverSaida("Machados: " + mapaSalas[player.getPosicao()].getBau().getMachado());
        InterfaceUI.getInstance().escreverSaida("Diamante: " + mapaSalas[player.getPosicao()].getBau().getQtdeDiam());
        InterfaceUI.getInstance().escreverSaida("Ouro: " + mapaSalas[player.getPosicao()].getBau().getQtdeOuro());
        InterfaceUI.getInstance().escreverSaida("Poção: " + mapaSalas[player.getPosicao()].getBau().getQtdePocao());
        InterfaceUI.getInstance().escreverSaida("Chaves: " + mapaSalas[player.getPosicao()].getBau().getQtdeChave());
        InterfaceUI.getInstance().escreverSaida("Trolls");
        mapaSalas[player.getPosicao()].getTroll().listaTrolls();
        InterfaceUI.getInstance().escreverSaida("Portas:");
        mapaSalas[player.getPosicao()].getPortas().showDoors();
        InterfaceUI.getInstance().escreverSaida("");
    }

    public void help(String parametro) {
        
        switch (parametro) {

            case "cd":
                InterfaceUI.getInstance().escreverSaida("\nFunção: sair de uma sala.");
                InterfaceUI.getInstance().escreverSaida("Requisitos:\n\t1. é necessário que o player esteja próximo de uma porta.");
                InterfaceUI.getInstance().escreverSaida("\t2. Se a porta estiver fechada, é necessário possuir ao menos uma chave\n" + 
                        "\tna mochila para abrir a porta.");
                InterfaceUI.getInstance().escreverSaida("Exemplo: cd");
                break;
            case "close":
                InterfaceUI.getInstance().escreverSaida("\nFunção: fechar uma porta.");
                InterfaceUI.getInstance().escreverSaida("Requisitos: é necessário que o player esteja próximo a uma porta e\n" + 
                        "possuir ao menos uma chave em sua mochila.");
                InterfaceUI.getInstance().escreverSaida("Exemplo: close");
                break;
            case "rm":
                InterfaceUI.getInstance().escreverSaida("\nFunção: remover um item da mochila.");
                InterfaceUI.getInstance().escreverSaida("Parâmetros: axe, diam, gold, key e potion.");
                InterfaceUI.getInstance().escreverSaida("Requisitos: para os intens axe, key e potion é necessário informar\n" + 
                        "a quantidade desejada.");
				InterfaceUI.getInstance().escreverSaida("Exemplo: rm gold");
                InterfaceUI.getInstance().escreverSaida("Exemplo: rm axe 2");
                break;
            case "ls":
                InterfaceUI.getInstance().escreverSaida("\nFunção: exibir as configurações da sala.");
                InterfaceUI.getInstance().escreverSaida("Requisitos: não possui requisitos.");
                InterfaceUI.getInstance().escreverSaida("Exemplo: ls");
                break;
            case "lsdoors":
                InterfaceUI.getInstance().escreverSaida("\nFunção: exibe as portas existentes na sala e seus respectivos\n" +
                        "estados (Aberta ou Fechada).");
                InterfaceUI.getInstance().escreverSaida("Requisitos: não possui requisitos.");
                InterfaceUI.getInstance().escreverSaida("Exemplo: lsdoors");
                break;
            case "lsmap":
                InterfaceUI.getInstance().escreverSaida("\nFunção: exibe o mapa geral das salas.");
                InterfaceUI.getInstance().escreverSaida("Requisitos: não possui requisitos.");
                InterfaceUI.getInstance().escreverSaida("Exemplo: lsmap");
                break;
            case "lsme":
                InterfaceUI.getInstance().escreverSaida("\nFunção: exibe os itens do player e em qual sala ele está.");
                InterfaceUI.getInstance().escreverSaida("Requisitos: não possui requisitos.");
                InterfaceUI.getInstance().escreverSaida("Exemplo: lsme");
                break;
            case "moveto":
                InterfaceUI.getInstance().escreverSaida("\nFunção: move o player para um iten ou porta.");
                InterfaceUI.getInstance().escreverSaida("Parâmetros: axe, diam, door, gold, key e potion");
                InterfaceUI.getInstance().escreverSaida("Requisitos:\n\t1. Não possui requisitos para mover em direção a um item.");
                InterfaceUI.getInstance().escreverSaida("\tExemplo: moveto axe");
                InterfaceUI.getInstance().escreverSaida("\t2. É necessário indicar para qual porta deseja se " +
                        "\tmover.");
                InterfaceUI.getInstance().escreverSaida("\tExemplo: moveto door 8");
                break;
            case "quit":
                InterfaceUI.getInstance().escreverSaida("\nFunção: encerra o jogo (perde).");
                InterfaceUI.getInstance().escreverSaida("Requisitos: não possui requisitos.");
                InterfaceUI.getInstance().escreverSaida("Exemplo: cd");
                break;
            case "kill":
                InterfaceUI.getInstance().escreverSaida("\nFunção: mata um troll.");
                InterfaceUI.getInstance().escreverSaida("Parâmetros: Nomes");
                InterfaceUI.getInstance().escreverSaida("Requisitos:\n\t1. O player deve possuir pelo menos um machados em sua mochila.");
                InterfaceUI.getInstance().escreverSaida("\t2. Deve-se indicar o nome do troll alvo.");
                InterfaceUI.getInstance().escreverSaida("\tExemplo: kill Mallandro");
                break;
            case "take":
                InterfaceUI.getInstance().escreverSaida("\nFunção: pega um item presente na sala e coloca na mochila.");
                InterfaceUI.getInstance().escreverSaida("Parâmetros: axe, diam, gold, key e potion.");
                InterfaceUI.getInstance().escreverSaida("Requisitos:\n\t1. É necessário mover o player em direção\n" + 
                        "\tao item desejado.");
                InterfaceUI.getInstance().escreverSaida("\t2. Para os itens OURO e DIAMANTE não é" + 
                        "\tnecessário indicar a quantidade\n\tdesejada (Todo ouro ou diamante na sala é" + 
                        "adquirido para o player).");
                InterfaceUI.getInstance().escreverSaida("\tExemplo: take gold");
                InterfaceUI.getInstance().escreverSaida("\t3. Para os itens CHAVE, MACHADO e POÇÃO, deve-se" + 
                        " informar a quantidade desejada.");
                InterfaceUI.getInstance().escreverSaida("\tExemplo: take key 2");
                break;
            default:
                InterfaceUI.getInstance().escreverSaida("\nDocumentação Legentrolls, versão 0.1.");
                InterfaceUI.getInstance().escreverSaida("");
                InterfaceUI.getInstance().escreverSaida("Comandos Básicos:");
                InterfaceUI.getInstance().escreverSaida("");
                InterfaceUI.getInstance().escreverSaida("cd");
                InterfaceUI.getInstance().escreverSaida("close");
                InterfaceUI.getInstance().escreverSaida("help");
                InterfaceUI.getInstance().escreverSaida("kill");
                InterfaceUI.getInstance().escreverSaida("ls");
                InterfaceUI.getInstance().escreverSaida("lsdoors");
                InterfaceUI.getInstance().escreverSaida("lsmap");
                InterfaceUI.getInstance().escreverSaida("lsme");
                InterfaceUI.getInstance().escreverSaida("moveto");
                InterfaceUI.getInstance().escreverSaida("quit");                
                InterfaceUI.getInstance().escreverSaida("rm");
                InterfaceUI.getInstance().escreverSaida("take\n");
                InterfaceUI.getInstance().escreverSaida("Todos os comandos possuem manuais com maiores detalhes. Para consultar\n" +
                        "o manual de cada comando, deve se utilizar a combinação: \"help + parametro\"");
                InterfaceUI.getInstance().escreverSaida("Exemplo: help moveto\n");
                break;
        }
    }
    
    public void exit(int novaSala, int salaAntiga){
        
        if(player.getQualItem() == 10){
            
            player.setPosicao(novaSala);
            mapaSalas[salaAntiga].setJogadorEsta(0);
            InterfaceUI.getInstance().escreverSaida("Saindo da sala...");
             //Matar thread aqui xdddd
             InterfaceUI.getInstance().zerarContador();
            mapaSalas[novaSala].setVisitado(1);
            mapaSalas[salaAntiga].setJogadorEsta(0);
            mapaSalas[novaSala].setJogadorEsta(1);
            player.setTempo();
            mapaSalas[salaAntiga].setAtivarAtaque(1);
            
        }else if(player.getQualItem() == 11){
            
            if(player.getBag().getQtdeChave() > 0){
                
                player.getBag().removeChave(1);
                player.setPosicao(novaSala);
                mapaSalas[salaAntiga].setJogadorEsta(0);
                InterfaceUI.getInstance().escreverSaida("Abrindo Porta...");
                mapaSalas[salaAntiga].getPortas().alteraEstado(novaSala, 1);
                mapaSalas[novaSala].getPortas().alteraEstado(salaAntiga, 1);
                InterfaceUI.getInstance().escreverSaida("Saindo...");
               
                mapaSalas[novaSala].setJogadorEsta(1);
                mapaSalas[novaSala].setVisitado(1);
                player.setTempo();
                mapaSalas[salaAntiga].setAtivarAtaque(1);
                
            }else{
                
                InterfaceUI.getInstance().escreverSaida("Você está sem chaves.");
            }
        }
	if (novaSala == 18) {
            InterfaceUI.getInstance().escreverSaida("Parabéns! Você encontrou a saída!");
            InterfaceUI.getInstance().escreverSaida("FIM DE JOGO - VITÓRIA");
            System.exit(0);
        }
    }
    
    public void closeDoor(int porta){
        
        if(player.getBag().getQtdeChave() > 0){
            
            switch (mapaSalas[player.getPosicao()].getPortas().existePorta(porta)) {
                case 1:
                    InterfaceUI.getInstance().escreverSaida("Fechando porta "+ porta +" ...");
                    mapaSalas[player.getPosicao()].getPortas().alteraEstado(porta, 2);
                    mapaSalas[porta].getPortas().alteraEstado(player.getPosicao(), 2);
                    player.getBag().removeChave(1);
                    break;
                case 2:
                    InterfaceUI.getInstance().escreverSaida("Esta porta já está fechada.");                    
                    break;
            }
            return;
        }
        InterfaceUI.getInstance().escreverSaida("Suas poções acabaram.");    
    }
    
    public void moveTo(String parametro, int complemento){
        
        if ("door".equals(parametro)) {
            
            switch (mapaSalas[player.getPosicao()].getPortas().existePorta(complemento)) {
                case 1:
                    // porta aberta.
                    player.setQualItem(10);
                    break;
                case 2:
                    // porta fechada.
                    player.setQualItem(11);
                    InterfaceUI.getInstance().escreverSaida("Porta fechada.");
                    break;
                default:    
                    // porta inexistente.
                    InterfaceUI.getInstance().escreverSaida("Esta porta não existe.");
                    break;
            }
        } else {

            switch (parametro) {
                // pegar chave.
                case "key":
                    player.setQualItem(1);
                    break;
                // pegar diamante.
                case "diam":
                    player.setQualItem(2);
                    break;
                // pegar machado.
                case "axe":
                    player.setQualItem(3);
                    break;
                // pegar ouro.
                case "gold":
                    player.setQualItem(4);
                    break;
                case "potion":
                    player.setQualItem(5);
                    break;
                default:
                    // opção inválida para comando moveto.
                    InterfaceUI.getInstance().escreverSaida("Parâmetro não identificado.");
                    break;
            }
        }
    }
    // retorna verdade ou caos quantidade de item requirida seja verdadeira ou falsa.
    public int verificaQtde(int itemSala, int qtdeRequirida){
        
        if(itemSala >= qtdeRequirida && qtdeRequirida > 0){
            
            return 1;
        }else{
            
            return 0;
        }
    }
    
    public void take(String parametro, int complemento){
        
        int qtdeItemPegos = 0;
        switch (parametro) {
            // pegar chave.
            case "key":

                if (player.tookConfirm(1) == 1){
                
                    if(verificaQtde(mapaSalas[player.getPosicao()].getBau().getQtdeChave(), complemento) == 1) {

                        qtdeItemPegos = player.getBag().insereChave(complemento);
                        mapaSalas[player.getPosicao()].getBau().removeChave(qtdeItemPegos);
                        player.setQualItem(0);
                    }else{
                        
                        InterfaceUI.getInstance().escreverSaida("Quantidade de itens inválida.");
                    }
                } else {

                    InterfaceUI.getInstance().escreverSaida("Não há chaves perto de você.");
                }
                break;
            // pegar diamante.
            case "diam":

                if (player.tookConfirm(2) == 1) {

                    player.getBag().setQtdeDiam(mapaSalas[player.getPosicao()].getBau().getQtdeDiam() + player.getBag().getQtdeDiam());
                    player.setQualItem(0);
                    mapaSalas[player.getPosicao()].getBau().setQtdeDiam(0);
                } else {

                    InterfaceUI.getInstance().escreverSaida("Não há diamante perto de você.");
                }
                break;
            // pegar machado.
            case "axe":
                
                if (player.tookConfirm(3) == 1) {
                        
                    if(verificaQtde(mapaSalas[player.getPosicao()].getBau().getMachado(), complemento) == 1) {

                        qtdeItemPegos = player.getBag().insereMachado(complemento);
                        mapaSalas[player.getPosicao()].getBau().removeMachado(qtdeItemPegos);
                        player.setQualItem(0);
                    }else{
                        
                        InterfaceUI.getInstance().escreverSaida("Quantidade de itens inválida.");
                    }
                } else {

                    InterfaceUI.getInstance().escreverSaida("Não há machados perto de você.");
                }
                break;
            // pegar ouro.
            case "gold":

                if (player.tookConfirm(4) == 1) {

                    player.getBag().setQtdeOuro(mapaSalas[player.getPosicao()].getBau().getQtdeOuro() + player.getBag().getQtdeOuro());
                    player.setQualItem(0);
                    mapaSalas[player.getPosicao()].getBau().setQtdeOuro(0);
                } else {

                    InterfaceUI.getInstance().escreverSaida("Não há ouro perto de você.");
                }
                break;
            // pegar uma pocao.
            case "potion":
                
                if (player.tookConfirm(5) == 1) {
                        
                    if(verificaQtde(mapaSalas[player.getPosicao()].getBau().getQtdePocao(), complemento) == 1) {

                        qtdeItemPegos = player.getBag().inserePocao(complemento);
                        mapaSalas[player.getPosicao()].getBau().removePocao(qtdeItemPegos);
                        player.setQualItem(0);
                    }else{
                        
                        InterfaceUI.getInstance().escreverSaida("Quantidade de itens inválida.");
                    }
                } else {

                    InterfaceUI.getInstance().escreverSaida("Não há poções perto de você.");
                }
                break;
            default:
                // opção inválida para comando moveto.
                InterfaceUI.getInstance().escreverSaida("Parâmetro não identificado.");
                break;
        }
    }
    
    public void drop(String parametro, int complemento){
        
        switch (parametro) {
            // jogar fora chave.
            case "key":
                player.getBag().removeChave(complemento);
                break;
            // jogar fora diamante.
            case "diam":
                player.getBag().setQtdeDiam(0);
                break;
            // jogar fora machado.
            case "axe":
                player.getBag().removeMachado(complemento);
                break;
            // jogar fora ouro.
            case "gold":
                player.getBag().setQtdeOuro(0);
                break;
            // jogar fora potion
            case "potion":
                player.getBag().removePocao(complemento);
                break;
            default:
                // opção inválida para comando moveto.
                InterfaceUI.getInstance().escreverSaida("Parâmetro não identificado.");
                break;
        }
    }
    
    public void entrarSala(int tempoID){
        
        new Thread() {
            @Override
            public void run() {

                Random gerador = new Random();
                //int tempoDeResposta = ((10 + gerador.nextInt(5)) * 1000);
                int tempoDeResposta = (30 * 1000);
                int numSala = player.getPosicao();
				

                    InterfaceUI.getInstance().escreverSaida("Sala " + player.getPosicao() + ".");
                    InterfaceUI.getInstance().escreverSaida("Você será ATACADO em " + tempoDeResposta / 1000 + " segundos!");
                    InterfaceUI.alterarContador(tempoDeResposta);   
                    //Thread.sleep(tempoDeResposta);
                
                // se ainda exixtir trolls na sala
                if (tempoID == player.getTempo() && mapaSalas[numSala].getJogadorEsta() == 1
                      && mapaSalas[numSala].getTroll().getQtdeTrolls() > 0) {

                    player.lostItens();
                    entrarSala(tempoID);
                }
            }
        }.start();
    }
    
    public void moveTrolls(){
        
        Random geraRandom = new Random();
        int qtdeMovimentos, salaRandom, i;
        qtdeMovimentos = (2 + geraRandom.nextInt(3));
        for(i = 0; i < qtdeMovimentos; ++i){
            
            salaRandom = geraRandom.nextInt(19); // Sala a ter trolls retirados...
            if(mapaSalas[salaRandom].getTroll().getQtdeTrolls() > 0 && salaRandom != player.getPosicao()){
                
                int salaIda = mapaSalas[salaRandom].getPortas().portaAberta();
                if(salaIda >= 0 && mapaSalas[salaRandom].getTroll().getQtdeTrolls() + 
                        mapaSalas[salaIda].getTroll().getQtdeTrolls() < 5){
                    
                    for(int j = 0; j < 5; ++j){
                        
                        if("-".equals(mapaSalas[salaIda].getTroll().getNome(j))){
                            
                            for(int k = 0; k < 5; ++k){
                                
                                if(!"-".equals(mapaSalas[salaRandom].getTroll().getNome(k))){
                                    
                                    mapaSalas[salaIda].getTroll().setNome(mapaSalas[salaRandom].getTroll().getNome(k), j);
                                    mapaSalas[salaRandom].getTroll().setNome("-", k);
                                    mapaSalas[salaIda].getTroll().increQtdeTrolls();
                                    mapaSalas[salaRandom].getTroll().decreQtdeTrolls();
                                    k = 5;
                                }
                            }
                            
                        }
                    }
                }
            }
        }
    }
	
    public void mensagemInicial() {
        InterfaceUI.getInstance().contador.setText("00:00");
        InterfaceUI.getInstance().validate();
        // Construindo arena.
        buildMapa();
        InterfaceUI.getInstance().escreverSaida("Finalizando configurações extras...");
        help("");
        InterfaceUI.getInstance().escreverSaida("PRESSIONE qualquer tecla para INICIAR o jogo...");
    }

    public void idCmd(String t) {

        String comando = null, parametro = "help", limpaBuffer = null;
        //int complemento = -1;
        
        if (mapaSalas[player.getPosicao()].getTroll().getQtdeTrolls() > 0
                && mapaSalas[player.getPosicao()].getAtivarAtaque() == 1) {
            entrarSala(player.getTempo());
            mapaSalas[player.getPosicao()].setAtivarAtaque(0);
        }
        //InterfaceUI.getInstance().escreverSaida("> ");         
        String args[] = t.split(" ");
        int numberArgs = args.length;
        if (numberArgs >= 1) {
            comando = args[0];
        } else {
            comando = "null";
        }
        if (numberArgs == 2) {
            parametro = args[1];
        } else if (numberArgs == 3) {
            parametro = args[1];
            try {
                InterfaceUI.getInstance().setComplemento(Integer.parseInt(args[2]));
                
            } catch (Exception e) {
                InterfaceUI.getInstance().escreverSaida("Parâmetro inválido.");
                comando = "help";
                parametro = args[0];
            }
        }

        switch (comando) {
            // vai de uma sala para outra.
            case "cd":
                //InterfaceUI.getInstance().escreverSaida("Complemento informa a hora certa: são "+InterfaceUI.getInstance().getComplemento()+"horas.");
                exit(InterfaceUI.getInstance().getComplemento(), player.getPosicao());
                break;
            // fechar porta.
            case "close":
                closeDoor(InterfaceUI.getInstance().getComplemento());
                break;
            // Mostra Mapa;
            case "lsmap":
                lsMap();
                break;
            // removendo intens da bag.
            case "rm":
                drop(parametro, InterfaceUI.getInstance().getComplemento());
                break;
            case "help":
                help(parametro);
                break;
            // mostra itens da sala.
            case "ls":
                view();
                break;
            // mostra portas em uma sala.
            case "lsdoors":
                InterfaceUI.getInstance().escreverSaida("Portas...");
                mapaSalas[player.getPosicao()].getPortas().showDoors();
                break;
            // mostra itens na bag e sala atual.
            case "lsme":
                player.lsMe();
                break;
            // movendo para item.
            case "moveto":
                moveTo(parametro, InterfaceUI.getInstance().getComplemento());
                break;
            case "quit":
                InterfaceUI.getInstance().escreverSaida("Jogo ENCERRADO pelo usuário.");
                InterfaceUI.getInstance().escreverSaida("FIM DE JOGO - DERROTA");
                System.exit(0);
                break;
            // Arremessa machado
            case "kill":
                if (player.getBag().getMachado() > 0) {
                    mapaSalas[player.getPosicao()].getTroll().removeTrolls(parametro);
                    player.getBag().removeMachado(1);
                } else {

                    InterfaceUI.getInstance().escreverSaida("Você está sem machados.");
                }
                break;
            // Inserindo Itens na bag do player.
            case "take":
                take(parametro, InterfaceUI.getInstance().getComplemento());
                break;
            case "null":
                break;
            default:
                InterfaceUI.getInstance().escreverSaida("Comando não encontrado.");
                break;
        }
        
        InterfaceUI.getInstance().atualizarStatus();
        moveTrolls();
    }

}
