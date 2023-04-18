package edu.vinicius.operacoes;

public class Operadores {

	public static void main(String[] args) {
		String nomeCompleto = "LINGUAGEM" + "JAVA";
		// System.out.println(nomeCompleto);

		int num = 5;

		num = -num; // -5

		System.out.println(num);

		num = -num; // 5 | (-) (-) = +

		System.out.println(num);

		num = ++num; // pré-incremento

		System.out.println(num);

		num = --num; // pré-decremento

		System.out.println(num);
		

		System.out.println("antes "+num++);//pós-decremento
		System.out.println(num);


		System.out.println("antes "+num--);//pós-decremento
		System.out.println(num);

		num = num*num; // multiplicação

		System.out.println(num);

	}

}
