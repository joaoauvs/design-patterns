package classes;

import java.util.HashSet;
import java.util.Set;

public class BanheiroSingleton {
    private static BanheiroSingleton INSTANCE = null;
    private Set<String> BanheiroDisponivel;
    public static BanheiroSingleton getINSTANCE()
    {
        if(INSTANCE == null)
        {
            synchronized (BanheiroSingleton.class) //IMPEDE QUE 2 PROCESSOS PEGUEM A MESMA CADEIRA
            {
                INSTANCE = new BanheiroSingleton();
            }
        }
        return INSTANCE;
    }
    private BanheiroSingleton()
    {
        this.BanheiroDisponivel = new HashSet<>();
        BanheiroDisponivel.add("Porta Aberta");
        BanheiroDisponivel.add("Porta Fechada");
    }
    public boolean lugarBanheiro(String banheiro){
        return BanheiroDisponivel.remove(banheiro);
    }
}