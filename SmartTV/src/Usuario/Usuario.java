package Usuario;

import Tv.SmartTV;

public class Usuario {

	public static void main(String[] args) throws Exception {
		
		SmartTV smartTV = new SmartTV();
		
		smartTV.aumentarVolume();
		System.out.println("Novo Volume da TV: " +smartTV.volume);
		
		smartTV.diminuirVolume();
		System.out.println("Novo Volume da TV: " +smartTV.volume);
		
		System.out.println("TV ligada ? " +smartTV.ligada);
		System.out.println("Canal Atual: " +smartTV.canal);
		System.out.println("Volume Atual: " +smartTV.volume);
		
		smartTV.ligar();
		smartTV.desligar();
		smartTV.ligar();
		System.out.println("Novo status da TV: " + smartTV.ligada);
		
		smartTV.mudarCanal(13);
		System.out.println("Novo Canal: " + smartTV.canal);
		
		

	}

}
