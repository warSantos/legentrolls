package legentrolls;

public class Sala {
    
    Trolls troll;
    Itens bau;
    Porta portas;
    int visitado;
    int jogadorEsta;
    int ativarAtaque;
    
    public Sala() {
        
        this.ativarAtaque = 1;
        bau = new Itens();
        troll = new Trolls();
        portas = new Porta();
        this.visitado = 0;
        this.jogadorEsta = 0;
    }

    public int getAtivarAtaque() {
        return ativarAtaque;
    }

    public void setAtivarAtaque(int ativarAtaque) {
        this.ativarAtaque = ativarAtaque;
    }

    public int getVisitado() {
        return visitado;
    }

    public void setVisitado(int visitado) {
        this.visitado = visitado;
    }

    public int getJogadorEsta() {
        return jogadorEsta;
    }

    public void setJogadorEsta(int jogadorEsta) {
        this.jogadorEsta = jogadorEsta;
    }
}
