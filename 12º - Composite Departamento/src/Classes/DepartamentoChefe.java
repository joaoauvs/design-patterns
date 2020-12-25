package Classes;
import Interface.Departamento;
import java.util.ArrayList;
import java.util.List;

public class DepartamentoChefe implements Departamento {
    private Integer id;
    private String nome;

    private List<Departamento> DepartamentoFilhas;

    public DepartamentoChefe(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
        this.DepartamentoFilhas = new ArrayList<Departamento>();
    }

    @Override
    public void imprimiNomeDepartamento() {
        System.out.println("###IMPRIMINDO TODOS DEPARTAMENTOS:###\n");
        DepartamentoFilhas.forEach(Departamento::imprimiNomeDepartamento);
    }

    public void addDepartamento(Departamento departamento) {
        System.out.println("O " + departamento.getClass().getSimpleName() + " FOI ADICIONADO.\n");
        DepartamentoFilhas.add(departamento);
    }

    public void removeDepartamento(Departamento departamento) {
        System.out.println("O " + departamento.getClass().getSimpleName() + " FOI REMOVIDO.\n");
        DepartamentoFilhas.remove(departamento);
    }
}