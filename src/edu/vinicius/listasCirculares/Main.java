package edu.vinicius.listasCirculares;

public class Main {

	public static void main(String[] args) {

		ListaCircular<String> minhaLista = new ListaCircular<>();

		minhaLista.add("c0");

		System.out.println(minhaLista);

		minhaLista.remove(0);

		System.out.println(minhaLista);

		minhaLista.add("c1");

		System.out.println(minhaLista);
		
		minhaLista.add("c2");
		minhaLista.add("c3");
		System.out.println(minhaLista);
		
		System.out.println(minhaLista.get(0));
		System.out.println(minhaLista.get(1));
		System.out.println(minhaLista.get(2));
		System.out.println(minhaLista.get(3));
		System.out.println(minhaLista.get(4));
		

	}

}
