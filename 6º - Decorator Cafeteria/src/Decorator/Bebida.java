package Decorator;
import java.util.ArrayList;

abstract public class Bebida {
    protected String descricao;

    protected Bebida(){descricao = "";}

    public String getDescricao(){return descricao;}
    abstract public double getPreco();
}