package edu.vinicius.listasEncadeadas;

public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();
		
		/*Adicionando elementos na lista*/
		minhaListaEncadeada.add("teste1");
		minhaListaEncadeada.add("teste2");
		minhaListaEncadeada.add("teste3");
		minhaListaEncadeada.add("teste4");
		
		/*Usando o método get() para pegar elementos especificos em uma lista*/
		System.out.println(minhaListaEncadeada.get(0));
		System.out.println(minhaListaEncadeada.get(1));
		System.out.println(minhaListaEncadeada.get(2));
		System.out.println(minhaListaEncadeada.get(3));
		
		System.out.println(minhaListaEncadeada);
		
		//removendo um elemento da lista
		System.out.println(minhaListaEncadeada.remove(3));
		
		System.out.println(minhaListaEncadeada);

	}

}
