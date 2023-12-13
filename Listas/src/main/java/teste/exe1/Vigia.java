package teste.exe1;

public abstract class Vigia {
    private boolean descansando, vigiando,rondando; 
    
    public void descansar(){
        this.descansando = true;
        System.out.println("Soldado descansando");
    }
    
     public void vigiar(){
        this.vigiando = true;
        System.out.println("Soldado no posto de vigia do castelo");
    }
     
      public void rondar(){
        this.rondando = true;
        System.out.println("Soldado rondando castelo");
    }
      
      
    
}
