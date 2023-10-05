package main;

public class DoubleNode {
	
	private String elemento;
	private DoubleNode next;
	private DoubleNode previous;
	
	public DoubleNode() {
		this.elemento = "";
		this.next = null;
		this.previous = null;
	}
	
	public DoubleNode(String elemento, DoubleNode next, DoubleNode last) {
		this.elemento = elemento;
		this.next = next;
		this.previous = last;
	}
	
	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public DoubleNode getNext() {
		return next;
	}

	public void setNext(DoubleNode next) {
		this.next = next;
	}

	public DoubleNode getPrevious() {
		return previous;
	}

	public void setPrevious(DoubleNode previous) {
		this.previous = previous;
	}

//	@Override
//	public String toString() {
//		return "DoubleNode [elemento=" + elemento + ", next=" + next + ", last=" + previous + "]";
//	}

}
