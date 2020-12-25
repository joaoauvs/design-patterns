package Produtos.Sony;
import Interface.Produtos;

public class SmartTVSony implements Produtos {
    //Atributos
    String nome = " SMART TV - Z9G MASTER Series ";
    String descricao = " - Z9G MASTER "
                     + " - Series LED"
                     + " - 8K";
    String preco = " - R$ 3.5000,00";
    //Metodos
    public String getNome(){return nome;}
    public String getDescricao(){return descricao;}
    public String getPreco(){return preco;}   
}