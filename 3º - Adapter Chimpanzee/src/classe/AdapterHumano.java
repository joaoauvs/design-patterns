package classe;

public class AdapterHumano implements Macaco {
    private final Humano humano;
    
    public AdapterHumano(Humano humano){
        this.humano = humano;
    }
    public void comer() {
        humano.beber();
    }
    public void dormir() {
        humano.comer();
    }
    public void pular() {
        humano.cansar();
    } 
}