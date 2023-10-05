package main;

public class testDoubleLinkedList {

	public static void main(String[] args) {
		
		DoubleLinkedList dList = new DoubleLinkedList();
		
		dList.addFirst(new DoubleNode("A",null,null));
		
		dList.addFirst(new DoubleNode("B",null,null));
		
		dList.addFirst(new DoubleNode("C",null,null));
		
		dList.addFirst(new DoubleNode("D",null,null));
		
		dList.percorreListaDoInicio();
		
		

	}

}
