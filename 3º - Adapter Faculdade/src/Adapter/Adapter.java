package Adapter;

public class Adapter extends Interface{
     GerarMensalidade x = new GerarMensalidade();
     
     @Override
     void mensalidade(float valor){
           x.mensalidade(valor, "PUC");
     }
     @Override
     void mostrando(){
          x.mostra(); 
     }
}