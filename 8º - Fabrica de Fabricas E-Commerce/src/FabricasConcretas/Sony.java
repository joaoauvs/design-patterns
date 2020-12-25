package FabricasConcretas;
import Produtos.Sony.Soundbar;
import Produtos.Sony.SmartTVSony;
import Fabricas.FabricaAbstrata;
import Interface.Produtos;

public class Sony extends FabricaAbstrata {
    public Sony(){marca = "SONY";}
    public Object[] getListaDeProdutos(){
        Object[] lista = {"SMARTTV","SOUNDBAR"};
        return lista;
    }
    public Produtos getProduto( String modelo ) { 
        if( null == modelo ) {return null;}
        else switch (modelo) {
            case "SOUNDBAR":return new Soundbar(); 
            case "SMARTTV":return new SmartTVSony();
            default:return null;
        } 
    }
}