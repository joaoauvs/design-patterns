package Composite;
import Interface.Departamento;
import Classes.DepartamentoChefe;
import Classes.DepartamentoFinanceiro;
import Classes.DepartamentoVendas;

public class ProjetoComposite {
    public static void main(String[] args) {
        Departamento departamentoVendas = new DepartamentoVendas(1, "DEPARTAMENTO DE VENDAS");
        Departamento departamentoFinanceiro = new DepartamentoFinanceiro(2, "DEPARTAMENTO FINANCEIRO");

        DepartamentoChefe departamentoChefe = new DepartamentoChefe(3, "DEPARTAMENTO CHEFE");

        departamentoChefe.addDepartamento(departamentoVendas);
        departamentoChefe.addDepartamento(departamentoFinanceiro);

        departamentoChefe.imprimiNomeDepartamento();
        
        departamentoChefe.removeDepartamento(departamentoVendas);
        
        departamentoChefe.imprimiNomeDepartamento();
        
        departamentoChefe.addDepartamento(departamentoVendas);
        departamentoChefe.removeDepartamento(departamentoFinanceiro);
        
        departamentoChefe.imprimiNomeDepartamento();
    }
}