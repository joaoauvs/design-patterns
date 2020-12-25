package ConcreteDecorator;
import Component.Acai;
import Decorator.Complemento;
 
public class Nutella extends Complemento{
    public Nutella(Acai acai){this.acai = acai;}
    public double preco() {return acai.preco() + 1.00;}
    public String getDescricao() {return acai.getDescricao() + " com nutella";}    
}