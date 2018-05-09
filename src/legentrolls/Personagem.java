package legentrolls;

public class Personagem {
   
    String nome;
    int qualItem;
    Itens bag = new Itens();
    int posicao;
    int tempo;
    
    public Personagem() {
        
        this.tempo = 0;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo() {
        
        this.tempo++;
    }
    
    public int getPosicao() {
        return posicao;
    }

    public void setposicao(int posicao) {
        this.posicao = posicao;
    }

    public int getQualItem() {
        return qualItem;
    }

    public void setQualItem(int qualItem) {
        this.qualItem = qualItem;
    }
    
    public int confirmaPickup(int codigoItem){
        
        if(codigoItem == getQualItem()){
            
            return 1;
        }
        return 0;
    }
    
    public void coistroiPlayer(){
        
        /* Iniciando coordenadas do player para entrada */
        
        setposicao(15);
        
        /* Iniciando Intens do player */
        
        bag.setMachado(2);
        bag.insereDiam(0);
        bag.setQtdeOuro(0);
        bag.setQtdePocao(2);
        bag.setQtdeChave(1);
        bag.setQtdeItens(5);
        
    }

    public Personagem(String nome, int posicao, int coodY, int save) {
        
        this.nome = nome;
        this.posicao = posicao;
    }
    
    public void perdeItens(){
        
        if(bag.getQtdePocao() > 0){
            
            bag.removePocao(1);
            System.out.println("");
            System.err.println("Ataque troll Bloqueado...");
            System.out.println("");
            
        }else if(bag.getQtdeItens() > 0){
            
            System.out.println("");
            System.err.println("Dano sofrido...");
            System.err.println("Todos os itens foram perdidos...");
            System.out.println("");
            bag.setMachado(0);
            bag.setQtdeDiam(0);
            bag.setQtdeOuro(0);
            bag.setQtdePocao(0);
            bag.setQtdeItens(0);
        
        }else{
            
            System.out.println("This Game is over... hahahahahahah");
            System.exit(0);           
        }
    }
    
    public void showMe(){
        
        System.out.println("");
        System.out.println("Itens na bag " + bag.qtdeItens);
        System.out.println("Machados: " + bag.getMachado());
        System.out.println("Diamante: " + bag.getQtdeDiam());
        System.out.println("Ouro: " + bag.getQtdeOuro());
        System.out.println("Poção: "+ bag.getQtdePocao());
        System.out.println("Chaves: " + bag.getQtdeChave());
        System.out.println("");
        System.out.println("Sala atual: " + getPosicao());
        System.out.println("");
    }
}
