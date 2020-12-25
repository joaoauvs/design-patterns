package Persistencia;
import ClasseDeDados.Aluno;
import InterfaceGrafica.Strategy;

public class OrdenarCursoNome implements Strategy{
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2)
    {
        if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) <= 0)
        {
            if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0)return true;
        }
        return false;
    }
}