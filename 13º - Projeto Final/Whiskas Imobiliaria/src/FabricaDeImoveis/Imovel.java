package FabricaDeImoveis;

public abstract class Imovel {
//ATRIBUIÇÕES
    protected String tipo;
    protected String nome;
    protected String tamanho;
    protected String valordoaluguel;
    protected String valordevenda;
    
    public String getTipo(){return tipo;}
    public void setTipo(String tipo){this.tipo = tipo;}
    
    public String getNome() {return nome;}
    public void setNome(String nome){this.nome = nome;}
    
    public String getTamanho() {return tamanho;}
    public void setTamanho(String tamanho){this.tamanho = tamanho;}
    
    public String getValorDoAluguel() {return valordoaluguel;}
    public void setValorDoAluguel(String valordoaluguel){this.valordoaluguel = valordoaluguel;}
    
    public String getValorDeVenda() {return valordevenda;}
    public void setValorDeVenda(String valordevenda){this.valordevenda = valordevenda;}
}