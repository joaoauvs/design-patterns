package FabricasConcretas;
import Produtos.Lg.SmartTVLg;
import Produtos.Lg.SmartphoneLg;
import Fabricas.FabricaAbstrata;
import Interface.Produtos;

public class Lg extends FabricaAbstrata{
    public Lg(){marca = "LG";}
    public Object[] getListaDeProdutos(){
        Object[] lista = {"SMARTPHONE","SMARTV"};
        return lista;
    }
    public Produtos getProduto( String modelo ) { 
        if( null == modelo ) {return null;}
        else switch (modelo) {
            case "SMARTPHONE":return new SmartphoneLg(); 
            case "SMARTV":return new SmartTVLg();
            default:return null;
        } 
    }
}