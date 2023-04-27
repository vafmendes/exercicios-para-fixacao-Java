package edu.vinicius.filas;

public class Main {

	public static void main(String[] args) {
		Fila primeiraFila = new Fila();
		
		/*Ultilizando o método enqueue para atribuir os dados na fila*/
		primeiraFila.enqueue(new No("primeiro"));
		primeiraFila.enqueue(new No("segundo"));
		primeiraFila.enqueue(new No("terceiro"));
		primeiraFila.enqueue(new No("quarto"));
		
		
		System.out.println(primeiraFila);
		
		System.out.println(primeiraFila.dequeue());// Acabou de tirar o primeiro da fila
		
		System.out.println(primeiraFila);
		
		/*Atribuindo o ultimo na fila*/
		primeiraFila.enqueue(new No("último"));
		
		System.out.println(primeiraFila);
		
		/*Ultilizando o método first para apenas informar quem é o primeiro da fila*/
		System.out.println(primeiraFila.first());
		
		System.out.println(primeiraFila);
	}

}
