package Persistencia;
import ClasseDeDados.Aluno;

public class OrdenarSobrenome extends AlunoPersistenciaTemplateMethod{
    public OrdenarSobrenome(String nome){
        super(nome);
    }
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2)
    {
        if(aluno1.getNomeInvertido().compareToIgnoreCase(aluno2.getNomeInvertido()) <= 0)return true;
        else{
            return false;
        }
    }
}