package OpcoesExtras;
import Decorator.Bebida;
import Decorator.DecoratorBebida;

public class Moca extends DecoratorBebida {
    public Moca( Bebida bebida ){super( bebida );}
    public String getDescricao() {descricao = "Moca";return descricao;}
    public double getPreco() {return bebida.getPreco() + 0.25;}
}