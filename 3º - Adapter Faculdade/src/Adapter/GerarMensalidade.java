package Adapter;

public class GerarMensalidade {
    float   qtd=5, calcula=0;
    String Faculdade;
    
    public void mensalidade(float valor, String faculdade){
           calcula = qtd * valor;
           this.Faculdade = faculdade;
      }
    
    public void mostra(){
        System.out.println("Mensalidade: "+ calcula + "  Faculdade: " + Faculdade);
     }  
}