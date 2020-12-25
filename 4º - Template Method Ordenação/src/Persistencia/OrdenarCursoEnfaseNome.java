package Persistencia;
import ClasseDeDados.Aluno;

public class OrdenarCursoEnfaseNome extends AlunoPersistenciaTemplateMethod{
    public OrdenarCursoEnfaseNome(String curso){
        super(curso);
    }
   
public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2)
    {
        if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) > 0)return false;
        if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) < 0)return true;
        if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) == 0)
        {   
            if(aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) > 0)return false;
            if(aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) < 0)return true;
            if(aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) == 0)
            {
                if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) > 0)return false;
                if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) < 0)return true;
            }
            return false;
        }
        return false;
    }
}