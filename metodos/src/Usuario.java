public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv Está Ligada?: "+smartTv.ligada);
        System.out.println("Canal Atual: "+smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);
        
        smartTv.ligar();
        smartTv.passarCanal();
        smartTv.aumentarVolume();

        System.out.println("A tv Está Ligada Agora?: "+smartTv.ligada);
        System.out.println("Canal Atual Agora: "+smartTv.canal);
        System.out.println("Volume Atual Agora: "+smartTv.volume);
        
        smartTv.mudarCanal(25);
        System.out.println("Canal Atual Agora: "+smartTv.canal);
    }
}
