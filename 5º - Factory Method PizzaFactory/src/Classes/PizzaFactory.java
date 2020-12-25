package Classes;

public class PizzaFactory {       
    public static Pizza getPizza( String tamanhoPizza ) {
        if( tamanhoPizza == null ) return null;
        else if( tamanhoPizza.equals("Pequena") ) return new Pequena();
        else if( tamanhoPizza.equals("Media") ) return new Media();
        else if( tamanhoPizza.equals("Grande") ) return new Grande();

        else return null;
    }   
}  