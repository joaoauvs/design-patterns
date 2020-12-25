package Produtos.Samsung;
import Interface.Produtos;

public class SmartTVSamsung implements Produtos{
    //Atributos
    String nome = " SMART TV - QLED 8K 2019";
    String descricao = " - RESOLUÇÃO 8K\n" 
                     + " - IA UPSCALING\n" +
                       " - MODO AMBIENTE 2.0";
    String preco = "- R$ 6.5000,00";
    //Metodos
    public String getNome(){return nome;}
    public String getDescricao(){return descricao;}
    public String getPreco(){return preco;}
}