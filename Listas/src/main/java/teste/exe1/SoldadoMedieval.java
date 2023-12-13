package teste.exe1;

public class  SoldadoMedieval extends Vigia implements Alabardeiro,Cavaleiro,Arqueiro,Espadachim{
    private boolean alabardeiro,arqueiro,cavaleiro,espadachim;

    
    @Override
    public void atacarComLanca() {
        this.alabardeiro = true;
        System.out.println("Soldado atacando com lança");
    }

    @Override
    public void avancar() {
        this.cavaleiro = true;
        System.out.println("Soldado avançando à cavalo");

    }

    @Override
    public void atirarFlechas() {
        this.arqueiro = true;
        System.out.println("Soldado atirando flechas");

    }

    @Override
    public void brandirEspada() {
        this.espadachim = true;
        System.out.println("Soldado brandindo espada");

    }

    @Override
    public String toString() {
        return "SoldadoMedieval{" + "alabardeiro=" + alabardeiro + ", arqueiro=" + arqueiro + ", cavaleiro=" + cavaleiro + ", espadachim=" + espadachim + '}';
    }


   
   

}
