package main;

public class SimpleLinkedList {

	private Node head;
	private int size;
	
	public SimpleLinkedList() {
		this.head = null;
		this.size=0;
	}
	
	public void addFirst(Node node) {
		node.setNext(this.head);
		this.head=node;
		this.size++;
	}
	
	public Node removeFirst() {
		if (!this.head.equals(null)) {
			var t = this.head;
			this.head = this.head.getNext();
			t.setNext(null);
			size=size-1;
			return this.head;
		} 
		System.out.println("A lista está vazia!");
		return null;
	}

	@Override
	public String toString() {
		return "SimpleLinkedList [head=" + head + ", size=" + size + "]";
	}

	public Node getHead() {
		return head;
	}
	
	
	
	
}
