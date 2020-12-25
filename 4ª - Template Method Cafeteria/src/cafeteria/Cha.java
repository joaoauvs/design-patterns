package cafeteria;

public class Cha extends BebidaCafeinada {
    public void mistura(){
        System.out.println("Preparando o saquinho de cha");
    }       
    public boolean temCondimentos() {
        return false;
    }
}