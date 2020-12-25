package Classes;

import javax.swing.JOptionPane;

public class FactoryExemplo {   
    public static void main( String args[] ) {   
       String tamanho = JOptionPane.showInputDialog("Tamanho da pizza:");
       Pizza pizza = PizzaFactory.getPizza(tamanho); 
        if( pizza != null ){ System.out.println( "Preço: " + pizza.getPreco() ); }   
    }
} 