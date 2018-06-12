package legentrolls;

import interfaces.gui.InterfaceUI;

public class Personagem {

    private String nome;
    private int qualItem;
    private Itens bag = new Itens();
    private int posicao;
    private int tempo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Itens getBag() {
        return bag;
    }

    public void setBag(Itens bag) {
        this.bag = bag;
    }

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

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getQualItem() {
        return qualItem;
    }

    public void setQualItem(int qualItem) {
        this.qualItem = qualItem;
    }

    public int tookConfirm(int codigoItem) {

        if (codigoItem == getQualItem()) {

            return 1;
        }
        return 0;
    }

    public void buildPlayer() {

        /* Iniciando coordenadas do player para entrada */
        setPosicao(15);

        /* Iniciando Intens do player */
        bag.setMachado(2);
        bag.insereDiam(0);
        bag.setQtdeOuro(0);
        bag.setQtdePocao(2);
        bag.setQtdeChave(1);
        bag.setQtdeItens(5);

    }

    public void lostItens() {

        if (bag.getQtdePocao() > 0) {

            bag.removePocao(1);
            InterfaceUI.escreverSaida("");
            InterfaceUI.escreverSaida("Ataque de troll bloqueado!");
            InterfaceUI.escreverSaida("");

        } else if (bag.getQtdeItens() > 0) {

            InterfaceUI.escreverSaida("");
            InterfaceUI.escreverSaida("Você foi ferido!");
            InterfaceUI.escreverSaida("Todos seus itens foram perdidos!");
            InterfaceUI.escreverSaida("");
            bag.setMachado(0);
            bag.setQtdeDiam(0);
            bag.setQtdeOuro(0);
            bag.setQtdePocao(0);
            bag.setQtdeItens(0);
        }else{
            
            InterfaceUI.escreverSaida("Você morreu.");
            InterfaceUI.escreverSaida("FIM DE JOGO - DERROTA");
            System.exit(0);           
        }
    }

    public void lsMe() {

        InterfaceUI.escreverSaida("");
        InterfaceUI.escreverSaida("Itens no inventário: " + getBag().getQtdeItens());
        InterfaceUI.escreverSaida("Machados: " + bag.getMachado());
        InterfaceUI.escreverSaida("Diamante: " + bag.getQtdeDiam());
        InterfaceUI.escreverSaida("Ouro: " + bag.getQtdeOuro());
        InterfaceUI.escreverSaida("Poção: " + bag.getQtdePocao());
        InterfaceUI.escreverSaida("Chaves: " + bag.getQtdeChave());
        InterfaceUI.escreverSaida("");
        InterfaceUI.escreverSaida("Sala atual: " + getPosicao());
        InterfaceUI.escreverSaida("");
    }
}
