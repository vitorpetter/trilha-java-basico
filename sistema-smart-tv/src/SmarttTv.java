public class SmarttTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void volume(boolean value) {
       if (value){
        volume++;
       } 
        else {
            volume--;
        } 
    }

    public void canal(boolean value) {
        if (value){
            canal++;
        } 
         else {
            canal--;
         } 
     }

     public void mudarCanal(int novoCanal) {
        canal = novoCanal;
     }
}
