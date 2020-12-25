package Produtos.Lg;
import Interface.Produtos;

public class SmartphoneLg implements Produtos{
    //Atributos
    String nome = " SMARTPHONE - LG G8S THINQ 128GB ";
    String descricao = " - PRETO; LMG810EAW.ABRAMW\n" +
                       " - BRANCO - PROCESSADOR: 1X 2.84 GHZ KRYO 485\n" +
                       " - CHIPSET: SNAPDRAGON 855\n" +
                       " - SISTEMA OPERACIONAL: ANDROID 9 PIE\n" +
                       " - MEMÓRIA RAM: 6GB\n" +
                       " - MEMÓRIA INTERNA: 64GB\n" +
                       " - MEMÓRIA EXPANSÍVEL: ATÉ 128GB MICROSD\n" +
                       " - TELA: 6,2 OLED";
    String preco = " - R$ 2.999,99";
    //Metodos
    public String getNome(){return nome;}
    public String getDescricao(){return descricao;}
    public String getPreco(){return preco;}
}