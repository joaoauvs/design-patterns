package Persistencia;
import ClasseDeDados.Aluno;
import InterfaceGrafica.Strategy;

public class OrdenarSobrenome implements Strategy{
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2)
    {
        if(aluno1.getNomeInvertido().compareToIgnoreCase(aluno2.getNomeInvertido()) <= 0)return true;
        else{
            return false;
        }
    }
}