package main;

public class DoubleLinkedList {
	
	private DoubleNode inicio;
	private DoubleNode fim;
	private int size;
	
	public DoubleLinkedList() {
		this.inicio = new DoubleNode("NODO INICIAL",null,null);
		this.fim = new DoubleNode("NODO FINAL",null,null);
		this.inicio.setNext(fim);
		this.fim.setPrevious(inicio);
		this.size=0;
	}
	
	public void addFirst(DoubleNode novoNodo) {
		System.out.println("adicionando o nodo: "+novoNodo);
		DoubleNode auxiliar = inicio.getNext();
		inicio.setNext(novoNodo);
		novoNodo.setPrevious(inicio);
		novoNodo.setNext(auxiliar);
		auxiliar.setPrevious(novoNodo);
		this.size++;
	}

	public DoubleNode getInicio() {
		return inicio;
	}

	public void setInicio(DoubleNode inicio) {
		this.inicio = inicio;
	}

	public DoubleNode getFim() {
		return fim;
	}

	public void setFim(DoubleNode fim) {
		this.fim = fim;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "DoubleLinkedList [inicio=" + inicio + ", fim=" + fim + ", size=" + size + "]";
	}

	public void status() {
		System.out.println("Double Linked List Status\n");
		System.out.println("*******************************************");
		System.out.println("Previous Inicio:"+this.inicio.getPrevious());
		System.out.println("-------- Inicio:"+this.inicio);
		System.out.println("Next     Inicio:"+this.inicio.getNext());
		System.out.println("*******************************************");
		System.out.println("Previous fim:"+this.fim.getPrevious());
		System.out.println("-------- fim:"+this.fim);
		System.out.println("Next     fim:"+this.fim.getNext());
		System.out.println("*******************************************\n");
		
	}
	
	public void percorreListaDoInicio() {
		System.out.println("Numero de elementos: "+ this.size);
		DoubleNode auxiliar = this.inicio;
		for (int inc=0;inc<size+2;inc++) {
			System.out.println("elemento:"+auxiliar.getElemento());
			auxiliar=auxiliar.getNext();
		}
	}
	
	
	
}
