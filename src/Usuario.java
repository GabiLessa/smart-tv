public class Usuario {
    public static void main(String[] args) throws Exception {
     SmartTv smartTv = new SmartTv();
     smartTv.diminuirVolume();
     smartTv.diminuirVolume();
     smartTv.diminuirVolume();
     smartTv.aumentarVolume();

     smartTv.avançarCanal();
     smartTv.avançarCanal();
     smartTv.avançarCanal();
     smartTv.retornarCanal();
     System.out.println("TV Ligada: " + smartTv.ligada);
     System.out.println("Qual Canal: " + smartTv.canal);
     System.out.println("Qual Volume: " + smartTv.volume);

     smartTv.ligar();
     System.out.println("Novo status -> TV Ligada: " + smartTv.ligada);

     smartTv.desligar();
     System.out.println("Novamente -> TV Ligada: " + smartTv.ligada);
     smartTv.mudarCanal(14);
     System.out.println("Mudei de Canal: " + smartTv.canal);
}
}
