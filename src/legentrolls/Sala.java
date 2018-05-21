package legentrolls;

public class Sala {
    
    private Trolls troll;
    private Itens bau;
    private Porta portas;
    private int visitado;
    private int jogadorEsta;
    private int ativarAtaque;
    
    public Sala() {
        
        this.ativarAtaque = 1;
        bau = new Itens();
        troll = new Trolls();
        portas = new Porta();
        this.visitado = 0;
        this.jogadorEsta = 0;
    }

    public Trolls getTroll() {
        return troll;
    }

    public void setTroll(Trolls troll) {
        this.troll = troll;
    }

    public Itens getBau() {
        return bau;
    }

    public void setBau(Itens bau) {
        this.bau = bau;
    }

    public Porta getPortas() {
        return portas;
    }

    public void setPortas(Porta portas) {
        this.portas = portas;
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
