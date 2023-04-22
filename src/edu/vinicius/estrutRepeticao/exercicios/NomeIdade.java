package edu.vinicius.estrutRepeticao.exercicios;
/*
 * Faça um programa que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo representando
 * a sua idade.(Pare o programa inserindo o valor 0 no campo nome)
 * */

import java.util.Scanner;

public class NomeIdade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade = 0;
		
		while(true) {
			System.out.println("Insira o nome do aluno: ");
			nome = ler.next();
			if(nome.equals("0")) {
				nome = "Nome não informado";
				break;
			}
			
			System.out.println("Insira a idade do aluno: ");
			if(ler.hasNextInt()) {
				idade = ler.nextInt();
			}else {
				break;
			}
		}
		System.out.println("Nome: "+ nome +"\nIdade: "+ idade);
	}

}
