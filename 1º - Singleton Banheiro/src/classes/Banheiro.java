package classes;

import classes.BanheiroSingleton;

public class Banheiro {
    public static void main(String[] args){
        entrarBanheiro("Porta Aberta");
        entrarBanheiro("Porta Fechada");
        entrarBanheiro("Porta Aberta");
    }
    private static void entrarBanheiro(String banheiro){
        BanheiroSingleton a = BanheiroSingleton.getINSTANCE();
        System.out.println(a.lugarBanheiro(banheiro));
    }
}