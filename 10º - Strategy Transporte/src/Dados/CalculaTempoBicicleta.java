package Dados;
import Interface.CalculaVelocidadePercurso;

public class CalculaTempoBicicleta implements CalculaVelocidadePercurso{
    public float calcularTempo(Percurso obj) {
        float tempo;
        float velocidade = 10;
        tempo = ( obj.getDistancia() / velocidade *60);
        return tempo;
    } 
}