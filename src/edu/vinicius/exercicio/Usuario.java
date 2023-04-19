package edu.vinicius.exercicio;

public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		
		System.out.println("A tv esta ligada ? "+ smartTv.ligada);
		System.out.println("Canal atual ->"+ smartTv.canal);
		System.out.println("Volume da tv ->"+ smartTv.volume);
		System.out.println(" ");
		smartTv.ligar();
		System.out.println("Novo status -> "+smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo status -> "+smartTv.ligada);
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		System.out.println("Novo status do volume -> "+smartTv.volume);
		
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("Novo status do volume -> "+smartTv.volume);
		
		smartTv.mudarCanal(13);
		System.out.println("Numero do canal "+ smartTv.canal);
		
		
	}

}
