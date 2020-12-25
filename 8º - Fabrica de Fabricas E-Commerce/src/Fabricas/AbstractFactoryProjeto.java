package Fabricas;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import Interface.Produtos;

public class AbstractFactoryProjeto {
    public static void imprimir(Produtos obj, String marca){
        String saida = "Marca:  " + marca + "\n";
        saida += "\nProduto:\n" + obj.getNome() + "\n";
        saida += "\nDescrição:\n" + obj.getDescricao() + "\n";
        saida += "\nPreco:\n " + obj.getPreco();
        JOptionPane.showMessageDialog(null, saida);
    }
    public static void main(String[] args) {
        boolean controle1 = true;
        Object tipoDaFabrica;
        ImageIcon icon = new ImageIcon("newImage.png");
        Object[] opcoesDeFabricas = FabricaAbstrata.getListaDeFabricas();
        do{
            tipoDaFabrica = JOptionPane.showInputDialog(null,"ESCOLHA A MARCA","E-COMMERCE ELETRO",JOptionPane.PLAIN_MESSAGE,null,opcoesDeFabricas,opcoesDeFabricas[2]);
            FabricaAbstrata objFabricaAbstrata = FabricaAbstrata.getInstance(tipoDaFabrica.toString());
            String fabrica = objFabricaAbstrata.getMarca();
            boolean controle2 = true;
            Object objetoDoProduto;
            Object[] opcoesDeProdutos = objFabricaAbstrata.getListaDeProdutos();
            do{
                objetoDoProduto = JOptionPane.showInputDialog(null,"ESCOLHA O SEU PRODUTO","PRODUTO",JOptionPane.PLAIN_MESSAGE,null,opcoesDeProdutos,opcoesDeProdutos[0]);
            if(objetoDoProduto==null) controle2=false;
            else{
                Produtos objetoProduto = objFabricaAbstrata.getProduto(objetoDoProduto.toString());
                imprimir(objetoProduto, fabrica);
            }
           }while(controle2); 
        }while(controle1);   
    }
}