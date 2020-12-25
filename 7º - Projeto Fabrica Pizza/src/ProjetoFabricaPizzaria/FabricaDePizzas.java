package ProjetoFabricaPizzaria;
import Sabores.Calabresa;
import Sabores.Portuguesa;
import Sabores.QuatroQueijos;

public class FabricaDePizzas {
    public static Pizza getPizza(String tipoDePizza){
        Pizza obj = null;
        if(tipoDePizza.equalsIgnoreCase("Calabresa")){obj = new Calabresa();}
        else if(tipoDePizza.equalsIgnoreCase("Portuguesa")){obj = new Portuguesa();}
        else if(tipoDePizza.equalsIgnoreCase("QuatroQueijos")){obj = new QuatroQueijos();}
        return obj;
    }
}