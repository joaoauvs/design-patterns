package Persistencia;
import ClasseDeDados.Aluno;
import InterfaceGrafica.Strategy;

public class OrdenarSituacaoCursoNome implements Strategy{
    //public OrdenarSituacaoCursoNome(String situacao){super(situacao);}
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2)
    {
        if(aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) > 0)return false;
        if(aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) < 0)return true;
        if(aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) == 0)
        {   
            if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) > 0)return false;
            if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) < 0)return true;
            if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) == 0)
            {
                if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) > 0)return false;
                if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) < 0)return true;
            }
            return false;
        }
        return false;
    }
}