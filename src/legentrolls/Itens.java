package legentrolls;

import interfaces.gui.InterfaceUI;
import static java.sql.DriverManager.println;
import java.util.Random;

public class Itens {
    
    private int qtdeOuro;
    private int qtdeDiam;
    private int machado;
    private int qtdeItens;
    private int qtdePocao;
    private int qtdeChave;
    
    // Métodos getters padrões.
    
    public int getQtdeOuro() {
        return this.qtdeOuro;
    }

    public int getQtdeDiam() {
        return this.qtdeDiam;
    }

    public int getMachado() {
        return this.machado;
    }

    public int getQtdeItens() {
        return this.qtdeItens;
    }

    public int getQtdePocao() {
        return this.qtdePocao;
    }
    
    public void setQtdeOuro(int qtdeOuro) {
        this.qtdeOuro = qtdeOuro;
    }

    public void setQtdeDiam(int qtdeDiam) {
        this.qtdeDiam = qtdeDiam;
    }

    public void setMachado(int machado) {
        this.machado = machado;
    }

    public void setQtdeItens(int qtdeItens) {
        this.qtdeItens = qtdeItens;
    }

    public void setQtdePocao(int qtdePocao) {
        this.qtdePocao = qtdePocao;
    }

    public int getQtdeChave() {
        return this.qtdeChave;
    }

    public void setQtdeChave(int qtdeChave) {
        this.qtdeChave = qtdeChave;
    }
    
    // Fim métodos padrões.
    
    // Inicio métodos de alteração de itens.
    
    public void insereDiam(int qtdeDiam){
        
        if (qtdeDiam > 1) {
            InterfaceUI.getInstance().escreverSaida("Você adiquiriu " + qtdeDiam + " unidades de diamante.");
        } else {
            InterfaceUI.getInstance().escreverSaida("Você adiquiriu uma unidade de diamante.");
        }
        setQtdeDiam(getQtdeDiam() + qtdeDiam);        
    }
    
    public int insereMachado(int qtdeMachado){
        
        if(getQtdeItens() < 5){
            
            if(getQtdeItens() + qtdeMachado <= 5){

                setMachado(getMachado() + qtdeMachado);
                setQtdeItens(getQtdeItens() + qtdeMachado);
                if (qtdeMachado > 1) {
                    InterfaceUI.getInstance().escreverSaida("Você pegou " + qtdeMachado + " machados.");
                } else {
                    InterfaceUI.getInstance().escreverSaida("Você pegou um machado.");
                }
                return qtdeMachado;
            }else{
                
                int ret = (5 - getQtdeItens());
                setMachado(getMachado() + (5 - getQtdeItens()));
                setQtdeItens(5);
                if (ret > 1) {
                    InterfaceUI.getInstance().escreverSaida("Você pegou " + qtdeMachado + " machados.");
                } else {
                    InterfaceUI.getInstance().escreverSaida("Você pegou um machado.");
                }
                return ret;
            }
        }
        println("Limite de itens atingido.");
        return 0;
    }
    
    public void removeMachado(int qtdeMachado){
        
        if(getMachado() > 0){
            
            if(getMachado() - qtdeMachado >= 0){
                
                setMachado(getMachado() - qtdeMachado);
                setQtdeItens(getQtdeItens() - qtdeMachado);
            }else{
                
                setMachado(0);
                setQtdeItens(getQtdeItens() - getMachado());
            }
        }else{
            
            println("Você não possui machados para remover.");
        }
    }
    
    public void insereOuro(int qtdeOuro){
        
        if (qtdeOuro > 1) {
            InterfaceUI.getInstance().escreverSaida("Você adiquiriu " + qtdePocao + " unidades de ouro.");
        } else {
            InterfaceUI.getInstance().escreverSaida("Você adiquiriu uma unidade de ouro.");
        }
        setQtdeOuro(getQtdeOuro() + qtdeOuro);
    }
    
    public int inserePocao(int qtdePocao){
        
        if(getQtdeItens() < 5){
            
            if(getQtdeItens() + qtdePocao <= 5){
                
                setQtdePocao(getQtdePocao() + qtdePocao); 
                setQtdeItens(getQtdeItens() + qtdePocao);
                if (qtdePocao > 1) {
                    InterfaceUI.getInstance().escreverSaida("Você pegou " + qtdePocao + " poções.");
                } else {
                    InterfaceUI.getInstance().escreverSaida("Você pegou uma poção.");
                }
                return qtdePocao;
            }else{
                
                int ret = (5 - getQtdeItens());
                setQtdePocao(getQtdePocao() + (5 - getQtdeItens()));
                setQtdeItens(5);
                if (ret > 1) {
                    InterfaceUI.getInstance().escreverSaida("Você pegou " + ret + " poções.");
                } else {
                    InterfaceUI.getInstance().escreverSaida("Você pegou uma poção.");
                }
                return ret;
            }
        }
        println("Limite de itens atingido.");   
        return 0;
    }
    
    public void removePocao(int qtdePocao){
        
        if(getQtdePocao() > 0){
            
            if(getQtdePocao() - qtdePocao >= 0){
                
                setQtdePocao(getQtdePocao() - qtdePocao);
                setQtdeItens(getQtdeItens() - qtdePocao);
            }else{
                
                setQtdePocao(0);
                setQtdeItens(getQtdeItens() - qtdePocao);
            }
                
        }else{
            
            println("Você não possui nenhuma poção para remover.");
        }
    }
    
    public int insereChave(int qtdeChave){
        
        if(getQtdeItens() < 5){
            
            if(getQtdeItens() + qtdeChave <= 5){
                
                setQtdeChave(getQtdeChave() + qtdeChave); 
                setQtdeItens(getQtdeItens() + qtdeChave);
                if (qtdeChave > 1) {
                    InterfaceUI.getInstance().escreverSaida("Você pegou " + qtdeChave + " chaves.");
                } else {
                    InterfaceUI.getInstance().escreverSaida("Você pegou uma chave.");
                }
                return qtdeChave;
            }else{
                
                int ret = (5 - getQtdeItens());
                setQtdeChave(getQtdeChave() + (5 - getQtdeItens()));
                setQtdeItens(5);
                if (ret > 1) {
                    InterfaceUI.getInstance().escreverSaida("Você pegou " + ret + " chaves.");
                } else {
                    InterfaceUI.getInstance().escreverSaida("Você pegou uma chave.");
                }
                return ret;
            }
        }            
        println("Limite de itens atingido.");
        return 0;
    }
    
    public void removeChave(int qtdeChave){
        
        if(getQtdeChave() > 0){
            
            if(getQtdeChave() - qtdeChave >= 0){
                
                setQtdeChave(getQtdeChave() - qtdeChave);
                setQtdeItens(getQtdeItens() - qtdeChave);
            }else{
                
                setQtdeChave(0);
                setQtdeItens(getQtdeItens() - qtdeChave);
            }
                
        }else{
            
            println("Você não possui nenhuma chave para remover.");
        }
    }
    
    public void criarItens() {
        
        Random gerador = new Random();
        
        // Gerando jóias da sala.
        int numero = (1 + gerador.nextInt(2));
        setQtdeDiam(numero);
        numero = (1 + gerador.nextInt(3));
        setQtdeOuro(numero);
        
        // Gerando poção.
        numero = (gerador.nextInt(2));
        setQtdePocao(numero);
        
        // Gerando Machado
        numero = (1 + gerador.nextInt(2));
        setMachado(numero);
        
        // Gerando chaves.
        numero = gerador.nextInt(2) + 1;
        setQtdeChave(numero);
    }   
}
