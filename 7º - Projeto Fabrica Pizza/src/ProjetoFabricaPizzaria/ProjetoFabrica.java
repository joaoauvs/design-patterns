package ProjetoFabricaPizzaria;
import javax.swing.JOptionPane;

public class ProjetoFabrica {
    public static void imprimir(Pizza obj){
        String saida = "Pizza de: " + obj.getPizzaDe() + "\n";
        saida += "Ingredientes: " + obj.getIngredientes() + "\n";
        saida += "Preco: R$ " + obj.getPreco();
        JOptionPane.showMessageDialog(null, saida);
    }
    public static void main(String[] args) {
        boolean controle = true;
        Object[] opcoes = { "Calabresa","Portuguesa","QuatroQueijos"};
        Object tipoDePizza;
        do{
            tipoDePizza = JOptionPane.showInputDialog(null,
                                "Escolha sua Pizza?",
                                "Cardápio Digital",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoes,"Calabresa");
            Pizza obj = FabricaDePizzas.getPizza(tipoDePizza.toString());
            imprimir(obj); 
        }while(controle);
    }
}