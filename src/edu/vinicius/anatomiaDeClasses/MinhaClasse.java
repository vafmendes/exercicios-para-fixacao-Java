package edu.vinicius.anatomiaDeClasses;

/*Criando classes e declarando métodos*/
public class MinhaClasse {

	public static void main(String[] args) {
		System.out.println("Olá mundo");
		String primeiroNome = "Vinicius";
		
		String ultimoNome = "Mendes";
		
		String nomeCompleto = NomeCompleto(primeiroNome, ultimoNome);
		
		System.out.println(nomeCompleto);
	}
	
	public static String NomeCompleto (String primeiroNome, String ultimoNome) {
		return "Resultado da criação do metodo: "
				+ ""+primeiroNome.concat(" ").concat(ultimoNome);
	}

}
