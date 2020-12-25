package ObserverPolicia;

public class main {
    public static void main(String[] args){
        //OBSERVADOR
        CarroPolicia carroPolicia = new CarroPolicia();
        
        //OBSERVADO
        CarroRoubado carroRoubado =new CarroRoubado();
        
        //ADICIONAR OBSERVADOR AO OBSERVADO
        carroRoubado.addObserver(carroPolicia);
        
        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.esquerda();
        carroRoubado.para();
    }
}