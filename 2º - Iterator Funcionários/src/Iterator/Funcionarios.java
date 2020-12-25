package Iterator;

public class Funcionarios {
    private String nome;
    private String departamento;
    private String salario;

    public Funcionarios(String nome, String departamento, String salario ){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
    public Funcionarios(String str){
        String[] vetor = str.split(";");
        this.nome = vetor[0];
        this.departamento = vetor[1];
        this.salario = vetor[2];
    }
    
    // NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // DEPARTAMENTO
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    // SALARIO
    public String getSalario() {
        return salario;
    }
    public void setMatricula(String salario) {
        this.salario = salario;
    }
}