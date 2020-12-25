package ObserverPolicia;
import java.util.Observable;
import java.util.Observer;

public class CarroPolicia implements Observer, Carro {
    public void frente(){System.out.println("VIATURA SEGUE EM FRENTE.");}
    public void direita(){System.out.println("VIATURA VIRA A DIREITA.");}
    public void esquerda(){System.out.println("VIATURA VIRA A ESQUERDA.");}
    public void para(){System.out.println("VIATURA PARA.");}
    
    public void update(Observable arg0, Object arg1){
        String acao = String.valueOf(arg1);
        if(acao.equals("Frente")){this.frente();}
        else if(acao.equals("Direita")){this.direita();}
        else if(acao.equals("Esquerda")){this.esquerda();}
        else if(acao.equals("Para")){this.para();}
    }
}