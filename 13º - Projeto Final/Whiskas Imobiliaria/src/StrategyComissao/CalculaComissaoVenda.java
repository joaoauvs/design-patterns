package StrategyComissao;

public class CalculaComissaoVenda implements ICalculaComissao {
    // COLOCA AS INFORMAÇOES DA CLASSE ALUGUEL AQUI --- MODELO  PDF
    @Override
    public double calculaTaxaComissao(Vendedor objeto){
        double valor = 0;
        valor =  (objeto.getValorSalario() * 0.5);
        return valor;
    }
}