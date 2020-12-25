package ConcreteDecorator;
import Component.Acai;
import Decorator.Complemento;
 
public class Morango extends Complemento{
    public Morango(Acai acai){this.acai = acai;}
    public double preco() {return acai.preco() + 0.50;}
    public String getDescricao() {return acai.getDescricao() + " com morango";}   
}