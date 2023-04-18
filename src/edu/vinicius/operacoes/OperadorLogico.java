package edu.vinicius.operacoes;

public class OperadorLogico {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		
		boolean condicao2 = true;
		
		//Operadores lógicos AND - && e OR - ||
		
		if((condicao1 == true) &&(condicao2 == true)) {
			System.out.println("passou");
		}
		
		
		if((condicao1 == true) && (condicao2 == false)) {
			System.out.println("passou");
		}else {
			System.out.println("não passou");
		}
		
		if((condicao1 == true) || (condicao2 == false)) {
			System.out.println("passou");
		}
		
		

	}

}
