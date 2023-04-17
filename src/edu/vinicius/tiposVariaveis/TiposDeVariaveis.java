package edu.vinicius.tiposVariaveis;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		double valor = 2.500;//tipo utilizaddo para valores decimais
		byte idade = 123;
		short ano = 2021;
		int cep = 23456777; /*se começar com zero, talvez tenha que ser outro tipo
		pois o java não irá armazenar este valor como inteiro, tendo que trocar
		pelo tipo String*/
		long cpf = 987665432109L;/*se começar com zero, talvez tenha que ser outro tipo
		pois o java não irá armazenar este valor como inteiro, tendo que trocar
		pelo tipo String| Obrigatório terminar com L caso valide como tipo 'long'*/
		float pi = 3.14F;//Obrigatório o valor terminar com F senão a variável será lida como tipo double
		
		/*Constantes*/
		/*Ao colocar o final antes do tipo da variável
		 o valor armazenado nesta variável não sofrerá alteração */
		final double VALOR_DE_PI = 3.14;
		

	}

}
