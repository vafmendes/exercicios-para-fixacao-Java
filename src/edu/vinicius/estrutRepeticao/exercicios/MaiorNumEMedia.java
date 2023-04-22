package edu.vinicius.estrutRepeticao.exercicios;
/*
 * Faça um programa que leia 5 números
 * e informe o maior número e a média desses
 * números
 * */
import java.util.*;
public class MaiorNumEMedia {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num; 
		int i=0, maior = 0, soma=0;
		
		do {
			System.out.println("Informe 5 números: ");
			num = ler.nextInt();
			i++;
			//soma = soma + num;//1ª forma
			soma+= num;
			
			if(num > maior) maior = num;
		}while(i < 5);
		System.out.println("Maior número: "+maior);
		System.out.println("Media: "+(soma/5));

	}

}
