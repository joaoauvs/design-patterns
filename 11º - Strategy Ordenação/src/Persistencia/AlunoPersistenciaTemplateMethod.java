package Persistencia;
import ClasseDeDados.Aluno;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import InterfaceGrafica.Strategy;

public class AlunoPersistenciaTemplateMethod {
    private String nomeDoArquivo;
    private Strategy ordenar;
    //Metodos
    public AlunoPersistenciaTemplateMethod(String nome, Strategy ordenar){
        nomeDoArquivo = nome;
        this.ordenar = ordenar;
    }
    //Metodo abstrato que ira compor o algoritmo de ordenacao da listagem
    //public abstract boolean ePrimeiro(Aluno aluno1, Aluno aluno2);
    public ArrayList<Aluno> listagem()throws Exception{
        try{
            ArrayList<Aluno> array = new ArrayList<Aluno>();
            FileReader fr = new FileReader(nomeDoArquivo);
            try (BufferedReader br = new BufferedReader(fr)) {
                String linha = "";
                int pos = 0;
                while((linha=br.readLine())!=null){
                    Aluno aux = new Aluno(linha);
                    array.add(aux);
                    pos++;
                }
            }
            //algoritmo de Ordenação
            for (int i = 0; i < array.size(); i++) {
                for (int j = i; j < array.size(); j++) {
                    if (!ordenar.ePrimeiro(array.get(i),array.get(j))) {    
                        Aluno temp = array.get(j);
                        array.set(j, array.get(i));
                        array.set(i, temp);
                    }
                }
            }
            return array;
        }catch(IOException erro){
            throw erro;
        } 
    }
}