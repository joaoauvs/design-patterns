package OpcoesExtras;
import Decorator.Bebida;
import Decorator.DecoratorBebida;

public class Caramelo extends DecoratorBebida {
    public Caramelo(Bebida bebida ){super( bebida );}
    public String getDescricao() {descricao = "Caramelo";return descricao;}
    public double getPreco() {return bebida.getPreco() + 0.85;}
}