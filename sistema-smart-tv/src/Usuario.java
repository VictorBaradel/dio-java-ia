public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada? " + smartTv.ligada);

        smartTv.ligar ();
        System.out.println("Tv Ligada? " + smartTv.ligada);

        System.out.println("Volume Atual: " + smartTv.volume);
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(10);

        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);
    }
}
