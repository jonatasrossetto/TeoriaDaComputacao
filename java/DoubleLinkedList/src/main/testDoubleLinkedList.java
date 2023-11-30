package main;

public class testDoubleLinkedList {

	public static void main(String[] args) {
		
		DoubleLinkedList dList = new DoubleLinkedList();
		
		dList.addFirst(new DoubleNode("A",null,null));
		
		dList.addFirst(new DoubleNode("B",null,null));
		
		dList.addFirst(new DoubleNode("C",null,null));
		
//		dList.addLast(new DoubleNode("D - adicionado no fim",null,null));
		
//		dList.addLast(new DoubleNode("E - adicionado no fim",null,null));
		
		dList.percorreListaDoInicio();
		
		dList.percorreListaDoFim();
		
		

	}

}
