package Classes;
import Interface.Departamento;

public class DepartamentoVendas implements Departamento {
    private Integer id;
    private String nome;

    public DepartamentoVendas(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public void imprimiNomeDepartamento() {System.out.println("ESTE É O  "+getNome()+".\n");}
    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}