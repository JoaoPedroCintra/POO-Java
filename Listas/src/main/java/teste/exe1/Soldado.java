package teste.exe1;

public class Soldado {

    public static void main(String[] args) {
            SoldadoMedieval s1 = new SoldadoMedieval();
            System.out.println(s1.toString());
            s1.atirarFlechas();
            s1.brandirEspada();
            s1.vigiar();
            s1.descansar();
            System.out.println(s1.toString());

    }
    
}
