package StrategyComissao;
 
public class CalculaComissaoAluguel implements ICalculaComissao {
    // COLOCA AS INFORMAÇOES DA CLASSE ALUGUEL AQUI --- MODELO  PDF
    @Override
    public double calculaTaxaComissao(Vendedor objeto)  {
        double valor = 0;
        valor =  (objeto.getValorSalario() * 0.3);
        return valor;
    }
}