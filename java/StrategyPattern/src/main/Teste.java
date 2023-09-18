package main;

//Projeto simples para verificar a implementação do padrão de projeto Strategy

public class Teste {

	public static void main(String[] args) {

		System.out.println("Test is Running");
		Objeto objeto = new Objeto();
		System.out.println(objeto.toString());
		objeto.setComportamento(new ComportamentoB());
		System.out.println(objeto.toString());
		objeto.setComportamento(new ComportamentoC());
		System.out.println(objeto.toString());
		objeto.setComportamento(new ComportamentoA());
		System.out.println(objeto.toString());
	}

}

