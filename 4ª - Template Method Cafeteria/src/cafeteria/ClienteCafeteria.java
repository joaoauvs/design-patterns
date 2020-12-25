package cafeteria;

public class ClienteCafeteria {
    public static void main( String args[] ){
        Cafe cafe = new Cafe();
        Cha cha = new Cha();

        cafe.preparar();
        cha.preparar(); /* SEM CONDIMENTOS */
    }
}