package Dados;
import Interface.CalculaVelocidadePercurso;

public class CalculaTempoCarro implements CalculaVelocidadePercurso{
    public float calcularTempo(Percurso obj){
        float tempo;
        float velocidade = 80;
        tempo = ( obj.getDistancia() / velocidade *60);
        return tempo;
    }   
}