package edu.vinicius.estrutRepeticao.exercicios;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares
 */
/*
 * */
import java.util.Scanner;
public class Par_Impar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int quantNumeros, numero;
		int numPar = 0, numImpar = 0;
		
		System.out.println("Quantidade de números: ");
		quantNumeros = ler.nextInt();
		int i = 0;
		
		do {
			System.out.println("Numero: ");
			numero = ler.nextInt();
			if(numero%2 == 0)numPar++; else numImpar++;
			
			i++;
			
		}while(i < quantNumeros);
		
		System.out.println("==================================");
		System.out.println("Números Pares "+ numPar);
		System.out.println("Números Impares "+ numImpar);
		
		
		

	}

}
