package legentrolls;

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
        System.out.println("Finalizando construção das salas...");
    }

    public void buildMapa() {

        player.buildPlayer();
        mapaSalas[15].setVisitado(1);
        mapaSalas[15].setJogadorEsta(1);
        /* Iniciando portas */
        /* (qual porta do vetor, qual porta para sala, estado) */
        System.out.println("Criando salas...");

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

        System.out.println("Criando Itens e Trolls...");

        try {
            constroiSalas();
        } catch (IOException ex) {
            Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void lsMap(){
        
        System.out.println("");
        System.out.println("");
        for(int i = 0; i < 4; ++i){
            for(int j = 0; j < 5;++j){
                if(mapaSalas[(i * 5) + j].getVisitado() == 1){
                    if(((i * 5) + j) > 9){
                        System.out.print("  | " + ((i * 5) + j) +"   |  "); 
                    }else{
                        System.out.print("  |  " + ((i * 5) + j) +"   |  ");
                    }
                }
            }
            System.out.println("");
            System.out.println("");
        }
    }
    
    public void view() {
        
        System.out.println("");
        System.out.println("Sala: " + player.getPosicao() + " Itens: ");
        System.out.println("");
        System.out.println("Machados: " + mapaSalas[player.getPosicao()].getBau().getMachado());
        System.out.println("Diamante: " + mapaSalas[player.getPosicao()].getBau().getQtdeDiam());
        System.out.println("Ouro: " + mapaSalas[player.getPosicao()].getBau().getQtdeOuro());
        System.out.println("Poção: " + mapaSalas[player.getPosicao()].getBau().getQtdePocao());
        System.out.println("Chaves: " + mapaSalas[player.getPosicao()].getBau().getQtdeChave());
        System.out.println("Trolls");
        mapaSalas[player.getPosicao()].getTroll().listaTrolls();
        System.out.println("Portas:");
        mapaSalas[player.getPosicao()].getPortas().showDoors();
        System.out.println("");
    }

    public void help(String parametro) {
        
        switch (parametro) {

            case "cd":
                System.out.println("\nFunção: sair de uma sala.");
                System.out.println("Requisitos:\n\t1. é necessário que o player esteja próximo de uma porta.");
                System.out.println("\t2. Se a porta estiver fechada, é necessário possuir ao menos uma chave\n" + 
                        "\tna mochila para abrir a porta.");
                System.out.println("Exemplo: cd");
                break;
            case "close":
                System.out.println("\nFunção: fechar uma porta.");
                System.out.println("Requisitos: é necessário que o player esteja próximo a uma porta e\n" + 
                        "possuir ao menos uma chave em sua mochila.");
                System.out.println("Exemplo: close");
                break;
            case "rm":
                System.out.println("\nFunção: remover um item da mochila.");
                System.out.println("Parâmetros: axe, diam, gold, key e potion.");
                System.out.println("Requisitos: para os intens axe, key e potion é necessário informar\n" + 
                        "a quantidade desejada.");
				System.out.println("Exemplo: rm gold");
                System.out.println("Exemplo: rm axe 2");
                break;
            case "ls":
                System.out.println("\nFunção: exibir as configurações da sala.");
                System.out.println("Requisitos: não possui requisitos.");
                System.out.println("Exemplo: ls");
                break;
            case "lsdoors":
                System.out.println("\nFunção: exibe as portas existentes na sala e seus respectivos\n" +
                        "estados (Aberta ou Fechada).");
                System.out.println("Requisitos: não possui requisitos.");
                System.out.println("Exemplo: lsdoors");
                break;
            case "lsmap":
                System.out.println("\nFunção: exibe o mapa geral das salas.");
                System.out.println("Requisitos: não possui requisitos.");
                System.out.println("Exemplo: lsmap");
                break;
            case "lsme":
                System.out.println("\nFunção: exibe os itens do player e em qual sala ele está.");
                System.out.println("Requisitos: não possui requisitos.");
                System.out.println("Exemplo: lsme");
                break;
            case "moveto":
                System.out.println("\nFunção: move o player para um iten ou porta.");
                System.out.println("Parâmetros: axe, diam, door, gold, key e potion");
                System.out.println("Requisitos:\n\t1. Não possui requisitos para mover em direção a um item.");
                System.out.println("\tExemplo: moveto axe");
                System.out.println("\t2. É necessário indicar para qual porta deseja se " +
                        "\tmover.");
                System.out.println("\tExemplo: moveto door 8");
                break;
            case "quit":
                System.out.println("\nFunção: encerra o jogo (perde).");
                System.out.println("Requisitos: não possui requisitos.");
                System.out.println("Exemplo: cd");
                break;
            case "kill":
                System.out.println("\nFunção: mata um troll.");
                System.out.println("Parâmetros: Nomes");
                System.out.println("Requisitos:\n\t1. O player deve possuir pelo menos um machados em sua mochila.");
                System.out.println("\t2. Deve-se indicar o nome do troll alvo.");
                System.out.println("\tExemplo: kill Mallandro");
                break;
            case "take":
                System.out.println("\nFunção: pega um item presente na sala e coloca na mochila.");
                System.out.println("Parâmetros: axe, diam, gold, key e potion.");
                System.out.println("Requisitos:\n\t1. É necessário mover o player em direção\n" + 
                        "\tao item desejado.");
                System.out.println("\t2. Para os itens OURO e DIAMANTE não é" + 
                        "\tnecessário indicar a quantidade\n\tdesejada (Todo ouro ou diamante na sala é" + 
                        "adquirido para o player).");
                System.out.println("\tExemplo: take gold");
                System.out.println("\t3. Para os itens CHAVE, MACHADO e POÇÃO, deve-se" + 
                        " informar a quantidade desejada.");
                System.out.println("\tExemplo: take key 2");
                break;
            default:
                System.out.println("\nDocumentação Legentrolls, versão 0.1.");
                System.out.println("");
                System.out.println("Comandos Básicos:");
                System.out.println("");
                System.out.println("cd");
                System.out.println("close");
                System.out.println("help");
                System.out.println("kill");
                System.out.println("ls");
                System.out.println("lsdoors");
                System.out.println("lsmap");
                System.out.println("lsme");
                System.out.println("moveto");
                System.out.println("quit");                
                System.out.println("rm");
                System.out.println("take\n");
                System.out.println("Todos os comandos possuem manuais com maiores detalhes. Para consultar\n" +
                        "o manual de cada comando, deve se utilizar a combinação: \"help + parametro\"");
                System.out.println("Exemplo: help moveto\n");
                break;
        }
    }
    
    public void exit(int novaSala, int salaAntiga){
        
        if(player.getQualItem() == 10){
            
            player.setPosicao(novaSala);
            mapaSalas[salaAntiga].setJogadorEsta(0);
            System.out.println("Saindo da sala...");
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
                System.out.println("Abrindo Porta...");
                mapaSalas[salaAntiga].getPortas().alteraEstado(novaSala, 1);
                mapaSalas[novaSala].getPortas().alteraEstado(salaAntiga, 1);
                System.out.println("Saindo...");
                mapaSalas[novaSala].setJogadorEsta(1);
                mapaSalas[novaSala].setVisitado(1);
                player.setTempo();
                mapaSalas[salaAntiga].setAtivarAtaque(1);
                
            }else{
                
                System.out.println("Você está sem chaves.");
            }
        }
	if (novaSala == 18) {
            System.out.println("Parabéns! Você encontrou a saída!");
            System.out.println("FIM DE JOGO - VITÓRIA");
            System.exit(0);
        }
    }
    
    public void closeDoor(int porta){
        
        if(player.getBag().getQtdeChave() > 0){
            
            switch (mapaSalas[player.getPosicao()].getPortas().existePorta(porta)) {
                case 1:
                    System.out.println("Fechando porta "+ porta +" ...");
                    mapaSalas[player.getPosicao()].getPortas().alteraEstado(porta, 2);
                    mapaSalas[porta].getPortas().alteraEstado(player.getPosicao(), 2);
                    player.getBag().removeChave(1);
                    break;
                case 2:
                    System.out.println("Esta porta já está fechada.");                    
                    break;
            }
            return;
        }
        System.out.println("Suas poções acabaram.");    
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
                    System.out.println("Porta fechada.");
                    break;
                default:    
                    // porta inexistente.
                    System.err.println("Esta porta não existe.");
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
                    System.out.println("Parâmetro não identificado.");
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
                        
                        System.out.println("Quantidade de itens inválida.");
                    }
                } else {

                    System.err.println("Não há chaves perto de você.");
                }
                break;
            // pegar diamante.
            case "diam":

                if (player.tookConfirm(2) == 1) {

                    player.getBag().setQtdeDiam(mapaSalas[player.getPosicao()].getBau().getQtdeDiam() + player.getBag().getQtdeDiam());
                    player.setQualItem(0);
                    mapaSalas[player.getPosicao()].getBau().setQtdeDiam(0);
                } else {

                    System.err.println("Não há diamante perto de você.");
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
                        
                        System.out.println("Quantidade de itens inválida.");
                    }
                } else {

                    System.err.println("Não há machados perto de você.");
                }
                break;
            // pegar ouro.
            case "gold":

                if (player.tookConfirm(4) == 1) {

                    player.getBag().setQtdeOuro(mapaSalas[player.getPosicao()].getBau().getQtdeOuro() + player.getBag().getQtdeOuro());
                    player.setQualItem(0);
                    mapaSalas[player.getPosicao()].getBau().setQtdeOuro(0);
                } else {

                    System.err.println("Não há ouro perto de você.");
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
                        
                        System.out.println("Quantidade de itens inválida.");
                    }
                } else {

                    System.err.println("Não há poções perto de você.");
                }
                break;
            default:
                // opção inválida para comando moveto.
                System.out.println("Parâmetro não identificado.");
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
                System.out.println("Parâmetro não identificado.");
                break;
        }
    }
    
    public void entrarSala(int tempoID){
        
        new Thread() {
            @Override
            public void run() {

                Random gerador = new Random();
                int tempoDeResposta = ((10 + gerador.nextInt(5)) * 1000);
                int numSala = player.getPosicao();
				
                try {

                    System.err.println("Sala " + player.getPosicao() + ".");
                    System.err.println("Você será ATACADO em " + tempoDeResposta / 1000 + " segundos!");
                    Thread.sleep(tempoDeResposta);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Mapa.class.getName()).log(Level.SEVERE, null, ex);
                }
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
	
    public void idCmd() {
        
        // Construindo arena.
        buildMapa();
        String comando = null, parametro = "help", limpaBuffer = null;
        int complemento = -1;
        Scanner input;
        input = new Scanner(System.in);
        help("help");
        System.out.println("Finalizando configurações extras...");
        System.out.println("Pressione ENTER para iniciar o jogo.");
        limpaBuffer = input.nextLine();
        while (true) {
            
            if(mapaSalas[player.getPosicao()].getTroll().getQtdeTrolls() > 0 
                    && mapaSalas[player.getPosicao()].getAtivarAtaque() == 1){
                entrarSala(player.getTempo());
                mapaSalas[player.getPosicao()].setAtivarAtaque(0);
            }
            System.out.print("> ");
            String t = input.nextLine();            
            String args[] = t.split(" ");
            int numberArgs = args.length;
            if (numberArgs >= 1){    
                comando = args[0];
            }else {
                comando = "null";
            }
            if (numberArgs == 2){
                parametro = args[1];
            }else if (numberArgs == 3){
                parametro = args[1];
                try {
                    complemento = Integer.parseInt(args[2]);
                } catch (Exception e) {
                    System.out.println("Parâmetro inválido.");
                    comando = "help";
                    parametro = args[0];
                }
            }
            switch (comando) {
                // vai de uma sala para outra.
                case "cd":
                    exit(complemento, player.getPosicao());
                    break;
                // fechar porta.
                case "close":
                    closeDoor(complemento);
                    break;
                // Mostra Mapa;
                case "lsmap":
                    lsMap();
                    break;
                // removendo intens da bag.
                case "rm":
                    drop(parametro, complemento);
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
                    System.out.println("Portas...");
                    mapaSalas[player.getPosicao()].getPortas().showDoors();
                    break;
                // mostra itens na bag e sala atual.
                case "lsme":
                    player.lsMe();
                    break;
                // movendo para item.
                case "moveto":                    
                    moveTo(parametro, complemento);
                    break;
                case "quit":                    
                    System.err.println("Jogo ENCERRADO pelo usuário.");
					System.err.println("FIM DE JOGO - DERROTA");
                    System.exit(0);
                    break;
                // Arremessa machado
                case "kill":
                    if(player.getBag().getMachado() > 0){
                        mapaSalas[player.getPosicao()].getTroll().removeTrolls(parametro);
                        player.getBag().removeMachado(1);
                    }else{
                        
                        System.out.println("Você está sem machados.");
                    }
                    break;
                // Inserindo Itens na bag do player.
                case "take":                  
                    take(parametro, complemento);
                    break;
                case "null":
                    break;
                default:
                    System.out.println("Comando não encontrado.");
                    break;
            }            
            moveTrolls();
        }
    }
}