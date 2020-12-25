package cafeteria;

public abstract class BebidaCafeinada {
    public final void preparar(){
        esquentarAgua();
        mistura();
        colocarEmCopo();
        
        if(temCondimentos())
        {
            addCondimentos();
        }
    }
    public void esquentarAgua(){
        System.out.println("Esquentando agua");
    }
    public abstract void mistura();

    public void colocarEmCopo(){
        System.out.println("Colocando no copo");
    }
    public boolean temCondimentos(){ /* MÉTODO GANCHO */
        return true;
    }
    public void addCondimentos(){
        System.out.println("Adicionando algumas gotas de limao");
    }    
}