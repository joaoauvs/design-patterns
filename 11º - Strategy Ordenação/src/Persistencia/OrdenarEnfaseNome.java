package Persistencia;
import ClasseDeDados.Aluno;
import InterfaceGrafica.Strategy;

public class OrdenarEnfaseNome implements Strategy{
    //public OrdenarEnfaseNome(String enfase){super(enfase);}
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2)
    {
        if(aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) <= 0)
        {
            if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0)return true;
        }
        return false;
    }
}