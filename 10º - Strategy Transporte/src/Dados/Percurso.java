 package Dados;
import Interface.CalculaVelocidadePercurso;

public class Percurso {
    private int distancia;
    private String meiodeTransporte;
    protected CalculaVelocidadePercurso calcula = null;
    
    public Percurso(int distancia, String tipo){
        this.distancia = distancia;
        this.meiodeTransporte = tipo;
        
        switch(meiodeTransporte){
            case ("BICICLETA"):
                calcula = new CalculaTempoBicicleta();
                meiodeTransporte = "BICICLETA";  
                break;
            case ("CARRO"):
                calcula =  new CalculaTempoCarro();
                meiodeTransporte = "CARRO";
                break;
            case ("ONIBUS")    :
                calcula = new CalculaTempoOnibus();
                meiodeTransporte = "ONIBUS";
                break;       
        default: throw new RuntimeException("MEIO DE TRANSPORTE NÃO ENCONTRADO:");
        }   
    }
    
    // CALCULAR OS VALORES
    public float calcularTempo(){return this.calcula.calcularTempo(this);}
    public int getDistancia(){return distancia;}
}