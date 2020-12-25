package StrategyPadrao;
import Dados.Percurso;

public class StrategyMain {
    public static void main(String[] args) {
        // BICICLETA
        Percurso bicicleta = new Percurso(10,"BICICLETA");
        String meiodeTransporte1 = "CHEGARÁ DE BICICLETA AO SEU DESTINO EM: " + bicicleta.calcularTempo() + " MINUTOS.";
        System.out.println(meiodeTransporte1);
        // CARRO
        Percurso carro = new Percurso(10,"CARRO");
        String meiodeTransporte2 = "CHEGARÁ DE CARRO AO SEU DESTINO EM: " + carro.calcularTempo() + " MINUTOS.";
        System.out.println(meiodeTransporte2);
        // ONIBUS
        Percurso onibus = new Percurso(10,"ONIBUS");
        String meiodeTransporte3 = "CHEGARÁ DE ONIBUS AO SEU DESTINO EM: " + onibus.calcularTempo() + " MINUTOS.";
        System.out.println(meiodeTransporte3);    
    }
}