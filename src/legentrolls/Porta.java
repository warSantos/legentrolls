package legentrolls;

import interfaces.gui.InterfaceUI;

public class Porta {
    
    private int portas[];
    private int estado[];

    public int[] getPortas() {
        return portas;
    }

    public void setPortas(int[] portas) {
        this.portas = portas;
    }

    public int[] getEstado() {
        return estado;
    }

    public void setEstado(int[] estado) {
        this.estado = estado;
    }

    public Porta() {
        
        this.portas = new int[3];
        for(int i = 0; i < 3; ++i){
               
            this.portas[i] = -1;
        
        }
        this.estado = new int[3];
    }
    
    void setPortas(int numPorta, int numSala, int estado) {
        
        this.portas[numPorta] = numSala;
        this.estado[numPorta] = estado;
    }
    
    public int getPorta(int numPorta){
        
        return this.portas[numPorta];
    }
    
    public void alteraEstado(int porta, int estado){
        
        for(int i  = 0; i < 3; ++i){
            
            if(getPorta(i) == porta){
                
                this.estado[i] = estado;
                return;
            }
        }
        InterfaceUI.escreverSaida("Porta não encontrada.");
    }
    
    public int getEstado(int numPorta){
        
        return this.estado[numPorta];
    }
    
    public void showDoors(){
        
        for(int i = 0; i < 3; ++i){
            
            if(getEstado(i) == 1){
                
                InterfaceUI.escreverSaida(" Porta para a sala " + getPorta(i) + " foi aberta.");
            }else if(getEstado(i) == 2){
                
                InterfaceUI.escreverSaida(" Porta para a sala " + getPorta(i) + " foi fechada.");
            }
        }
    }

    public int existePorta(int numPorta){
        
        for(int i = 0; i < 3; ++i){
            
            if(numPorta == getPorta(i)){
                
                return getEstado(i);
            }
        }
        return -1;
    }
    
    public int portaAberta(){
        
        for(int i = 0; i < 3; ++i){
            
            if(getEstado(i) == 1){
                
                return getPorta(i);
            }
        }
        return -1;
    }
}
