package ClasseDeDados;

public class Aluno{
    //Atributos
    private String nome;
    private String curso;
    private String situacao;
    private String enfase;
    private String sobrenome;
    private String nomeInvertido;
    
    /* ALUNO */
    public Aluno(String nome, String curso, String situacao, String enfase, String sobrenome, String nomeInvertido ){
        this.nome = nome;
        this.curso = curso;
        this.situacao = situacao;
        this.enfase = enfase;
        this.sobrenome = sobrenome;
        this.nomeInvertido = nomeInvertido;
    }
    public Aluno(String str){
        String[] vetor = str.split(";");
        this.nome = vetor[0];
        this.curso = vetor[1];
        this.situacao = vetor[2];
        this.enfase = vetor[3];
        
        if (this.nome.contains("Joao") || this.nome.contains("Filho")){
            String[] vetSpace = this.nome.split(" ");
            if (vetSpace.length <=6) {
                int iniIndexSegundoNome = this.nome.indexOf(vetSpace[2]);
                String SemJoao = this.nome.substring(iniIndexSegundoNome);
                this.sobrenome = SemJoao.replace("Joao", "");
                this.nomeInvertido = this.sobrenome + ',' + this.nome.replaceAll(this.sobrenome, "");
            }
            int iniIndexSegundoNome = this.nome.indexOf(" ");
            int finalIndexSegundoNome = this.nome.lastIndexOf(" ");
            this.sobrenome = this.nome.substring(iniIndexSegundoNome, finalIndexSegundoNome);
            this.nomeInvertido = this.sobrenome + ',' + this.nome.replaceAll(this.sobrenome, "");
        }
        int iniIndex = this.nome.lastIndexOf(" ");
        this.sobrenome = this.nome.substring(iniIndex, this.nome.length());
        this.nomeInvertido = this.sobrenome + ',' + this.sobrenome.replaceAll(this.sobrenome, "");
    }
    
    /* NOME */
    public String getNome() {return nome;} 
    public void setNome(String nome) {this.nome = nome;}  
    
    /* CURSO */
    public String getCurso() {return curso;}
    public void setCurso(String curso) {this.curso = curso;}
    
    /* SITUAÇÃO */
    public String getSituacao() {return situacao;}
    public void setSituacao(String situacao) {this.situacao = situacao;}
    
    /* ENFASE */
    public String getEnfase() {return enfase;}
    public void setEnfase(String enfase){this.enfase = enfase;}

    /* SOBRENOME */
    public String getSobrenome(){return sobrenome;}
    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}
    
    public String getNomeInvertido() {return nomeInvertido;}
    public void setNomeInvertido(String nomeInvertido) {this.nomeInvertido = nomeInvertido;}
}