package classe;

public class Adapter {
    public static void main( String[] args ){
        Homem humano = new Homem();
        AdapterChimpanzee macaco = new AdapterChimpanzee();
        AdapterHumano humanoAdapter = new AdapterHumano(humano);
        Macaco[] macacos = {macaco, humanoAdapter};
        for(Macaco m : macacos){
            m.comer();
            System.out.println();
            m.dormir();
            System.out.println();
            m.pular();
            System.out.println();
        }
    }
}
