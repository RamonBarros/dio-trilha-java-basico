public class SmartTv {
    boolean ligada = false;
    int canal=1;
    int volume = 25;

    public void ligar(){
        System.out.println("Tv Ligada!");
        ligada = true;
    }
    
    public void desligar(){
        System.out.println("Tv Desligada!");
        ligada = false;
    }
    
    public void aumentarVolume(){
        System.out.println("Volume Aumentado!");
        volume++;
    }
    
    public void abaixarVolume(){
        if(volume!=0){
            System.out.println("Volume Diminuido!");
            volume--;
        }
    }
    
    public void passarCanal(){
        System.out.println("Passou Canal!");
        canal++;
    }
    
    public void voltarCanal(){
        if(canal!=0){
            System.out.println("Voltou Canal!");
            canal--;
        }
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}
