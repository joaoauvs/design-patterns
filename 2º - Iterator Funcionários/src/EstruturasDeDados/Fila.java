package EstruturasDeDados;
import Iterator.Funcionarios;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class Fila {
           private String linha;
           Queue<Funcionarios> DadosFuncionarios = new LinkedList<>();
         
     public Iterator LerFila(){
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