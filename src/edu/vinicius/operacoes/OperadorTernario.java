package edu.vinicius.operacoes;

public class OperadorTernario {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		/*Estrutura Condicional comum*/
		if(a==b) {
			System.out.println("Verdadeiro");
		}
		else {
			System.out.println("Falso");
		}
		
	
		System.out.println(" ");
		int c = 7;
		int d = 8;
		/*Utilizando o operador ternário*/
		
		String result = (c==d) ?"Verdadeiro":"Falso";
		
		System.out.println(result);

	}

}
