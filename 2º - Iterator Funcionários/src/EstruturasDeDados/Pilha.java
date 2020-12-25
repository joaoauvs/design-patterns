package EstruturasDeDados;
import Iterator.Funcionarios;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.Iterator;

public class Pilha {
    private String linha;
    Stack<Funcionarios> DadosFuncionarios = new Stack();
    
     public Iterator LerPilha(){
         try{
             BufferedReader br = new BufferedReader(new FileReader("Funcionarios.txt"));
             int pos = 0;
            while((linha=br.readLine())!=null){
                Funcionarios aux = new Funcionarios(linha);
                DadosFuncionarios.add(aux);
                pos++;
            }
            br.close();
         }catch(IOException e){
            System.out.println("ERRO . . . " + e);
        }
        return DadosFuncionarios.iterator();
     }
}