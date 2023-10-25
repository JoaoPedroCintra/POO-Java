package lista4.exe1.exe3Prova;

public class Aluno extends Pessoa{
    private String turma;
    private String ano_escolar;
    
    public Aluno(){
        super();
    }

    public Aluno(String turma, String ano_escolar, String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.setTurma(turma);
        this.setAno_escolar(ano_escolar);
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getAno_escolar() {
        return ano_escolar;
    }

    public void setAno_escolar(String ano_escolar) {
        this.ano_escolar = ano_escolar;
    }

    @Override
    public String toString() {
        return "Aluno{" + "turma=" + turma + ", ano_escolar=" + ano_escolar + '}';
    }

    @Override
     public String falaoi(){
         return "Olá Professor!";
    }
}