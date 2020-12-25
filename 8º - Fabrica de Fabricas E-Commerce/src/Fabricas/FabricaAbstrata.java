package Fabricas;
import FabricasConcretas.Lg;
import FabricasConcretas.Samsung;
import FabricasConcretas.Sony;
import Interface.Produtos;

public abstract class FabricaAbstrata {
    //Atributos
    protected String marca;
    public static Object[] getListaDeFabricas(){
        Object[] lista = {"LG","SAMSUNG","SONY"};
        return lista;
    }
    public String getMarca(){return marca;}
    public abstract Object[] getListaDeProdutos();
    public abstract Produtos getProduto(String produto);
    public static FabricaAbstrata getInstance( String marca ) { 
        if( null == marca ) {return null;}
        else switch (marca) {
            case "LG":return new Lg();
            case "SAMSUNG":return new Samsung();
            case "SONY":return new Sony();
            default:return null;
        }
    }
}