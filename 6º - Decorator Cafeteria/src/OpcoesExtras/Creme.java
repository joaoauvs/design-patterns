package OpcoesExtras;
import Decorator.Bebida;
import Decorator.DecoratorBebida;

public class Creme extends DecoratorBebida {
    public Creme(Bebida bebida ){super( bebida );}
    public String getDescricao() {descricao = "Creme";return descricao;}
    public double getPreco() {return bebida.getPreco() + 0.50;}
}