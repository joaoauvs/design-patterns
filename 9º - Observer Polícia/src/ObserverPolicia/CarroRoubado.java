package ObserverPolicia;
import java.util.Observable;

public class CarroRoubado extends Observable implements Carro {
    private String acao = "";
    
    public void frente(){
        acao = "Frente";
        System.out.println("CARRO ROUBADO SEGUIU EM FRENTE!");
        this.mudaEstado();
    }
    public void direita(){
        acao = "Direita";
        System.out.println("CARRO ROUBADO VIROU A DIREITA!");
        this.mudaEstado(); 
    }
    public void esquerda(){
        acao = "Esquerda";
        System.out.println("CARRO ROUBADO VIROU A ESQUERDA!");
        this.mudaEstado();
    }
    public void para(){
        acao = "Para";
        System.out.println("O CARRO ROUBADO PAROU!");
        this.mudaEstado();
    }
    public void mudaEstado(){
        setChanged(); //MUDOU O ESTADO
        notifyObservers(acao); // NOTIFICA OS OBSERVADORES
    }
}