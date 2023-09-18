package main;

public class Objeto {
	
	private Comportamento comportamento;
	
	public Objeto() {
		comportamento = new ComportamentoA();
		System.out.println("um novo objeto foi construído com o Comportamento A");
	}

	public Comportamento getComportamento() {
		return comportamento;
	}

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	public String toString() {
		return "Objeto [comportamento=" + comportamento + "]";
	}
	
	
	
	
}
