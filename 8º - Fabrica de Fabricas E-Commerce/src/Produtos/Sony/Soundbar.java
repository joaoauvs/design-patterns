package Produtos.Sony;
import Interface.Produtos;

public class Soundbar implements Produtos{
    //Atributos
    String nome = " - SOUNDBAR";
    String descricao = " - MUITO CARO ...";
    String preco = " - R$ 7.500,00";
    //Metodos
    public String getNome(){return nome;}
    public String getDescricao(){return descricao;}
    public String getPreco(){return preco;}
}