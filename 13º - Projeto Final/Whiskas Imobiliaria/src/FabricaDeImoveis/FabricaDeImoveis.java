package FabricaDeImoveis;

public class FabricaDeImoveis {
    public static Imovel getImovel(String tipoDoImovel){
        Imovel obj = null;
        if(tipoDoImovel.equalsIgnoreCase("APARTAMENTO")){obj= new Apartamento();}
        else if(tipoDoImovel.equalsIgnoreCase("CASA")){obj= new Casa();}
        return obj;
    }   
}