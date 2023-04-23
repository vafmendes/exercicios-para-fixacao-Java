package edu.vinicius.estrutRepeticao.exercicios;
/*
 * Desenvolva um ggerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro
 * entre 1 a 10. O usuário deve informar de qual número ele
 * deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 * 
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 
 * */

import java.util.*;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o número da tabuada: ");
		int num = ler.nextInt();
		
		System.out.println("Tabuada do "+ num+"\n");
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(num+" X "+ i+" = "+(num*i));
		}

	}

}
