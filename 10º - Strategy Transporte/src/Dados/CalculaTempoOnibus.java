package Dados;
import Interface.CalculaVelocidadePercurso;

public class CalculaTempoOnibus implements CalculaVelocidadePercurso{
    public float calcularTempo(Percurso obj) {
        float tempo;
        float velocidade = 50;
        tempo = ( obj.getDistancia() / velocidade *60);
        return tempo;
    } 
}