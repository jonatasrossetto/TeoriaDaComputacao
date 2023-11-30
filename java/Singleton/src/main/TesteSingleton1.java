package main;

public class TesteSingleton1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Teste do padrão Singleton");
		Singleton singletonA = Singleton.getInstance();
		singletonA.setValue(1);
		Singleton singletonB = Singleton.getInstance();
		singletonB.setValue(2);
		Singleton singletonC = Singleton.getInstance();
		singletonC.setValue(3);
		System.out.println("singletonA.getvalue: "+singletonA.getValue());
		System.out.println("singletonB.getvalue: "+singletonB.getValue());
		System.out.println("singletonC.getvalue: "+singletonC.getValue());
	}

}
