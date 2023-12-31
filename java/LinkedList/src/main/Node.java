package main;

public class Node {

	private String elemento;
	private Node next;
	
	public Node(String elemento, Node next) {
		this.elemento = elemento;
		this.next = next;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [elemento=" + elemento + ", next=" + next + "]";
	}
	
}
