package StrategyComissao;

public class Vendedor {
    public double valorSalario = 1200;
    public String tipoVenda;
    protected ICalculaComissao calcula = null;
    // PENSAR EM COMO PEGAR O VALOR DO IMÓVEL ESCOLHIDO //
    
    public Vendedor(double valorSalario, String tipoVenda){
        switch(tipoVenda){
            case ("VENDA"):
                calcula =  new CalculaComissaoAluguel();
                tipoVenda = "ALUGUEL";
                break;
            case ("ALUGUEL")    :
                calcula = new CalculaComissaoVenda();
                tipoVenda = "VENDA";
                break; 
        default:throw new RuntimeException("Tipo de servico nao encontrado :/");
        }
    }
        
    public double getValorSalario() {return valorSalario;}
    public void setValorSalario(double valorSalario) {this.valorSalario = valorSalario;}

    public String getTipoVenda() {return tipoVenda;}
    public void setTipoVenda(String tipoVenda) {this.tipoVenda = tipoVenda;}
    
    public double calculaTaxaComissao(){return this.calcula.calculaTaxaComissao(this);}
}