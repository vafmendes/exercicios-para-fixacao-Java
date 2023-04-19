package edu.vinicius.exercicio;

public class SmartTv {
	boolean ligada = true;
	int canal =  1;
	int volume = 34;
	
	public void ligar() {
		ligada = true;
	}
	public void desligar() {
		ligada = false;
	}
	
	public void aumentarVolume() {
		volume++;
	}
	
	public void diminuirVolume() {
		volume--;
	}
	public void mudarCanal(int canalNovo) {
		canal = canalNovo;
	}
}
