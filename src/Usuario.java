public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();
        System.out.println(smartTv.ligada);

        smartTv.desligar();
        System.out.println(smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
   

        smartTv.diminiurVolume();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
    }
}
