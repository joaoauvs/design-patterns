package Produtos.Lg;
import Interface.Produtos;

public class SmartTVLg implements Produtos{
    //Atributos
    String nome = " SMART TV - LG 65, 4K HDR";
    String descricao = "- Código:   134449946\n" +
                       "- Recursos de Áudio:    Sistema de som Dolby Atmos\n" +
                       "- Tecnologia da Tela:   LED\n" +
                       "- Polegadas:    65\n" +
                       "- Monitor:  Ultra HD 4k\n" +
                       "- Taxa de Atualização:  240Hz\n" +
                       "- USB:  3\n" +
                       "- Local das entradas USB:   3 entradas laterais\n" +
                       "- HDMI: 4\n" +
                       "- Local das entradas HDMI:  4 entradas traseiras\n" +
                       "- Conversor Digital Integrado:  Sim\n" +
                       "- Consumo (KW/h):   205\n" +
                       "- Wi-Fi:    Wi-Fi integrado\n" +
                       "- Cor - ficha técnica	Preto\n";
    String preco = "- R$ 1.999,99";
    //Metodos
    public String getNome(){return nome;}
    public String getDescricao(){return descricao;}
    public String getPreco(){return preco;}
}