public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume: " + this.volume);
    }

    public void diminiurVolume(){
        volume--;
        System.out.println("Volume: " + this.volume);
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }
}
