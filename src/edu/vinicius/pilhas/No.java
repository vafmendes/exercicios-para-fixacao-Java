package edu.vinicius.pilhas;

public class No {

	private int dado;
	private No refNO = null;// Referencia do No para saber em que nó está

	public No() {

	}

	public No(int dado) {
		super();
		this.dado = dado;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public No getRefNO() {
		return refNO;
	}

	public void setRefNO(No refNO) {
		this.refNO = refNO;
	}

	@Override
	public String toString() {
		return "No [dado=" + dado + "]";
	}
	
	

}
