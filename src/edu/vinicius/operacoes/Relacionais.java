package edu.vinicius.operacoes;

public class Relacionais {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 2;

		boolean simNao = num1 == num2;

		System.out.println("numero 1 e maior que o numero 2 ? " + simNao);

		simNao = num1 != num2;

		System.out.println("numero 1 e diferente ao numero 2 ? " + simNao);

		 simNao = num1 <= num2;

		System.out.println("numero 1 e menor que o numero 2 ? " + simNao);
		
		 simNao = num2 >= num1;

		System.out.println("numero 2 e maior que o numero 1 ? " + simNao);
		
		System.out.println(" ");
		System.out.println("Relacionando objetos");
		
		String nome1 = "Vinicius";
		String nome2 = "Vinicius";
		
		String nome3 = "Vinicius";
		String nome4 = new String("Vinicius");
		
		boolean resposta = nome1 == nome2;
		System.out.println("O nome1 e igual ao nome2 ?"+ resposta );
		
		//O método equals é usado para comparar textos
		System.out.println("O nome3 e igual ao nome4 ?"+ nome3.equals(nome4));

	}

}
