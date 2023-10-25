package lista4.exe1.exe3Prova;

public  abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;
    
    public Pessoa(){
        super();
    }

    public Pessoa(String nome, int idade, String cpf) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public float getIdade() {
        return idade;
    }

    public final void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", cpf=" + super.toString() + cpf + '}';
    }

    public abstract String falaoi();
      
}
 
