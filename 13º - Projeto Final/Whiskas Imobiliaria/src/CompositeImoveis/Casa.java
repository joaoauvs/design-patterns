package CompositeImoveis;

public class Casa implements Imovel{
    protected String tipo;
    protected String nome;
    protected String tamanho;
    protected String valordoaluguel;
    protected String valordevenda;
    
    public Casa(String tipo, String nome, String tamanho, String valordoaluguel, String valordevenda){
        this.tipo = tipo;
        this.nome = nome;
        this.tamanho = tamanho;
        this.valordoaluguel = valordoaluguel;
        this.valordevenda = valordevenda;
    }

    @Override
    public String getTipo(){return tipo;}
    public void setTipo(String tipo){this.tipo = tipo;}
    
    @Override
    public String getNome() {return nome;}
    public void setNome(String nome){this.nome = nome;}
    
    @Override
    public String getTamanho() {return tamanho;}
    public void setTamanho(String tamanho){this.tamanho = tamanho;}
    
    @Override
    public String getValorDoAluguel() {return valordoaluguel;}
    public void setValorDoAluguel(String valordoaluguel){this.valordoaluguel = valordoaluguel;}
    
    @Override
    public String getValorDeVenda() {return valordevenda;}
    public void setValorDeVenda(String valordevenda){this.valordevenda = valordevenda;}
}