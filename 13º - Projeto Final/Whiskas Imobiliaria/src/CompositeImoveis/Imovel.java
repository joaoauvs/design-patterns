package CompositeImoveis;

public interface Imovel {
    public String getTipo();
    public void setTipo(String string);
    
    public String getNome();
    public void setNome(String string);
    
    public String getTamanho();
    public void setTamanho(String string);
    
    public String getValorDoAluguel();
    public void setValorDoAluguel(String string);
    
    public void setValorDeVenda(String string);
    public String getValorDeVenda();
}