package FabricasConcretas;
import Fabricas.FabricaAbstrata;
import Produtos.Samsung.SmartphoneSamsung;
import Produtos.Samsung.SmartTVSamsung;
import Interface.Produtos;

public class Samsung extends FabricaAbstrata {
    public Samsung(){marca = "SAMSUNG";}
    public Object[] getListaDeProdutos(){
        Object[] lista = {"SMARTPHONE","SMARTTV"};
        return lista;
    }
    public Produtos getProduto( String modelo ) { 
        if( null == modelo ) {return null;}
        else switch (modelo) {
            case "SMARTPHONE":return new SmartphoneSamsung(); 
            case "SMARTTV":return new SmartTVSamsung();
            default:return null;
        } 
    }
}