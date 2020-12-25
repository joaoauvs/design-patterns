package Persistencia;
import ClasseDeDados.Aluno;

public class OrdenarNome extends AlunoPersistenciaTemplateMethod{

    public OrdenarNome(String nome){
        super(nome);
    }
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2)
    {
        if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0) return true;
        else return false;
    }
}