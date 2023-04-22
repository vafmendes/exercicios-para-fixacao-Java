package edu.vinicius.estrutRepeticao.exercicios;
/*
 * Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja válido e continue 
 * pedindo até que o usuário informe o valor válido
 * */

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int nota;
		System.out.println("Informe uma nota de 0 a 10:");
		nota = ler.nextInt();
		while(true) {
			if( nota < 0 || nota > 10) {
				System.out.println("Informe uma nota válida");
				nota = ler.nextInt();
			}else {
				System.out.println("Fim da avaliação");
				break;
			}
		}

	}

}
