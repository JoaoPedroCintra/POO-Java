package lista4.exe1.exe3Prova;

public class Testa {

    public static void exibeResultado(Pessoa pessoa){
       
        System.out.println(pessoa.falaoi());
        System.out.println(pessoa.toString());

   
    }
    
    public static void main(String[] args) {
        Professor objProf = new Professor("Matematica","Matematica",3000,"Fulano",21,"798");
          exibeResultado(objProf);
          Aluno objAluno = new Aluno("3B","terceiro coelgial","ciclano",17,"342");
          exibeResultado(objAluno);

    }
    
}

