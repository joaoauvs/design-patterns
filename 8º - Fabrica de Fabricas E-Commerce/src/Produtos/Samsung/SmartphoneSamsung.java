package Produtos.Samsung;
import Interface.Produtos;

public class SmartphoneSamsung implements Produtos {
    //Atributos
    String nome = " SMARTPHONE - SMARTPHONE";
    String descricao = " - Z9G MASTER "
                     + " - Series LED"
                     + " - 8K";
    String preco = " - RS 3.599,99";
    //Metodos
    public String getNome(){return nome;}
    public String getDescricao(){return descricao;}
    public String getPreco(){return preco;}
}