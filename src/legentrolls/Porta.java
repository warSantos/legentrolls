package legentrolls;

public class Porta {
    
    int portas[];
    int estado[];

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
        System.out.println("Porta não encontrada.");
    }
    
    public int getEstado(int numPorta){
        
        return this.estado[numPorta];
    }
    
    public void showDoors(){
        
        for(int i = 0; i < 3; ++i){
            
            if(getEstado(i) == 1){
                
                System.out.println(" Porta para sala: " + getPorta(i) + " Aberta.");
            }else if(getEstado(i) == 2){
                
                System.out.println(" Porta para sala: " + getPorta(i) + " Fechada.");
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