package java_basico.metodos;

public class Usuario {

	public static void main(String[] args) throws Exception {
		
		sistemaSmartTv smartTv = new sistemaSmartTv();
		
		System.out.println("  Status Atual\n");
		System.out.println("TV Ligada? " + smartTv.ligada);
		System.out.println("Canal Atual: " + smartTv.canal);
		System.out.println("Volume da TV: " + smartTv.volume);
		
		smartTv.ligar();
		System.out.println("\n  Novo Status\n");
		System.out.println("TV Ligada? " + smartTv.ligada);
		smartTv.mudarCanal(9);
		System.out.println("Canal Atual: " + smartTv.canal);
		smartTv.diminuirCanal();
		smartTv.diminuirCanal();
		System.out.println("Mudança Para Canal: " + smartTv.canal);
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume da TV? " + smartTv.volume);
		
	}

}
