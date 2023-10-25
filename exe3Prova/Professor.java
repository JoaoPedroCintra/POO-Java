package lista4.exe1.exe3Prova;


public class Professor extends Pessoa{
    private String graduacao;
    private String materia_ministrada;
    private float salario;
    
    public Professor(){
        super();
    }

    public Professor(String graduacao,String materia_ministrada,float salario,String nome,int idade, String cpf) {
        super(nome,idade,cpf);
        this.setGraduacao(graduacao);
        this.setMateria_ministrada(materia_ministrada);
        this.setSalario(salario);

    }

    public String getGraduacao() {
        return graduacao;
    }
    
    public final void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public String getMateria_ministrada() {
        return materia_ministrada;
    }

    public final void setMateria_ministrada(String materia_ministrada) {
        this.materia_ministrada = materia_ministrada;
    }
    public final void setSalario(float salario) {
        this.salario = salario;
    }
    
     public float getSalario() {
        return salario;
    }

    public String falaoi(){
         return "Olá Turma";
    }

    @Override
    public String toString() {
        return "Professor{" + "graduacao=" + graduacao + ", materia_ministrada=" + materia_ministrada + ", salario=" + super.toString() + salario + '}' ;
    }
    
 }


