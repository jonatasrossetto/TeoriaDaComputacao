package main;

public class TestSimpleLinkedList {

	public static void main(String[] args) {
		SimpleLinkedList lista = new SimpleLinkedList();
		
		System.out.println("lista"+lista.toString());
		
		lista.addFirst(new Node("primeiro elemento",null));
		System.out.println("head: "+lista.getHead().getElemento());
		System.out.println("lista"+lista.toString());
		
		lista.addFirst(new Node("segundo elemento",null));
		System.out.println("head: "+lista.getHead().getElemento());
		System.out.println("lista"+lista.toString());
		
		lista.addFirst(new Node("terceiro elemento",null));
		System.out.println("head: "+lista.getHead().getElemento());
		System.out.println("lista"+lista.toString());
		
		System.out.println("removeFirst: "+lista.removeFirst());
		System.out.println("head: "+lista.getHead().getElemento());
		System.out.println("lista"+lista.toString());
		
		System.out.println("removeFirst: "+lista.removeFirst());
		System.out.println("head: "+lista.getHead().getElemento());
		System.out.println("lista"+lista.toString());
		
		System.out.println("removeFirst: "+lista.removeFirst());
		
		System.out.println("lista"+lista.toString());
		
		

	}

}
