package edu.vinicius.pilhas;

public class Main {

	public static void main(String[] args) {
		Pilha minhaPilha = new Pilha();
		
		minhaPilha.push(new No(1));
		minhaPilha.push(new No(2));
		minhaPilha.push(new No(3));
		minhaPilha.push(new No(4));
		minhaPilha.push(new No(5));
		
		
		minhaPilha.pop();// Excluindo o dado de cima da pilha
		
		minhaPilha.push(new No(89));// Acrescentando um novo dado
		
		
		System.out.println(minhaPilha);

	}

}
