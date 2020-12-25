package Bebida;
import Decorator.Bebida;

/**
 *
 * @author matheus.camargos
 */
public class Expresso extends Bebida {
    public Expresso(){ descricao = "Café Expresso";}
    public double getPreco() {return 1.50;}
}