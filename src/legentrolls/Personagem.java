package legentrolls;

import interfaces.gui.InterfaceUI;
import javax.swing.JOptionPane;

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
            InterfaceUI.getInstance().escreverSaida("");
            InterfaceUI.getInstance().escreverSaida("Ataque de troll bloqueado!");
            InterfaceUI.getInstance().escreverSaida("");

        } else if (bag.getQtdeItens() > 0) {

            InterfaceUI.getInstance().escreverSaida("");
            InterfaceUI.getInstance().escreverSaida("Você foi ferido!");
            InterfaceUI.getInstance().escreverSaida("Todos seus itens foram perdidos!");
            InterfaceUI.getInstance().escreverSaida("");
            bag.setMachado(0);
            bag.setQtdeDiam(0);
            bag.setQtdeOuro(0);
            bag.setQtdePocao(0);
            bag.setQtdeItens(0);
        }else{
            
            InterfaceUI.getInstance().escreverSaida("Você morreu.");
            InterfaceUI.getInstance().escreverSaida("FIM DE JOGO - DERROTA");
            JOptionPane.showMessageDialog(InterfaceUI.getInstance(),"FIM DE JOGO - DERROTA");
            System.exit(0);           
        }
        InterfaceUI.getInstance().setTravaThread(false);
        InterfaceUI.getInstance().atualizarStatus();
    }

    public void lsMe() {

        InterfaceUI.getInstance().escreverSaida("");
        InterfaceUI.getInstance().escreverSaida("Itens no inventário: " + getBag().getQtdeItens());
        InterfaceUI.getInstance().escreverSaida("Machados: " + bag.getMachado());
        InterfaceUI.getInstance().escreverSaida("Diamante: " + bag.getQtdeDiam());
        InterfaceUI.getInstance().escreverSaida("Ouro: " + bag.getQtdeOuro());
        InterfaceUI.getInstance().escreverSaida("Poção: " + bag.getQtdePocao());
        InterfaceUI.getInstance().escreverSaida("Chaves: " + bag.getQtdeChave());
        InterfaceUI.getInstance().escreverSaida("");
        InterfaceUI.getInstance().escreverSaida("Sala atual: " + getPosicao());
        InterfaceUI.getInstance().escreverSaida("");
    }
}
