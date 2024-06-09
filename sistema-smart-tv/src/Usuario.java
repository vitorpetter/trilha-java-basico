public class Usuario {
    public static void main(String[] args) throws Exception {
       
       SmarttTv smartTv = new SmarttTv();

       System.out.println("TV Ligada ? " + smartTv.ligada);
       System.out.println("Canal Atual ? " + smartTv.canal);
       System.out.println("Volume Atual ? " + smartTv.volume);
       
       smartTv.ligar();
       System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

       smartTv.desligar();
       System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
    
        smartTv.canal(true);
        System.out.println("Novo Canal: "+ smartTv.canal);

        smartTv.canal(false);
        System.out.println("Novo Canal: "+ smartTv.canal);

        smartTv.mudarCanal(12);
        System.out.println("Canal Atual: " + smartTv.canal);


       smartTv.volume(true);
       System.out.println("Novo Status -> Volume Atual ? " + smartTv.volume);
       
       smartTv.volume(false);
       System.out.println("Novo Status -> Volume Atual ? " + smartTv.volume);
    }
}
