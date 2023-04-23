package edu.vinicius.estrutRepeticao.exercicios;
/*
 * Faça um programa que calcule o fatorial de um número
 * inteiro fornecido pelo usuário.
 * Ex: 5! = 120 (5 X 4 X 3 X 2 X 1 = 120)
 * */
import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int n = ler.nextInt();
		
		int multiplicacao = 1;
		
		System.out.println("Fatorial de : "+ n);
		
		for(int i = n; i >= 1; i--) {
			multiplicacao *= i;
		}
		System.out.println(multiplicacao);

	}

}
