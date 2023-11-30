package main;

public class Singleton {
	private static final Singleton singleton = new Singleton();
	private static int value =0 ;
	
	private Singleton(){
		System.out.println("objeto criado");
	}
	public static Singleton getInstance() {
		System.out.println("Get Instance");
		return singleton;
	}
	public void setValue(int aux) {
		this.value = aux;
	}
	public int getValue() {
		return this.value;
	}
}
