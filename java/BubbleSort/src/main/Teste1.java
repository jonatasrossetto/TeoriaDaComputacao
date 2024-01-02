package main;

public class Teste1 {

	public static void main(String[] args) {

		System.out.println("Teste1 is running");
		long[] listaNumeros = new long[10];

		//gera lista de número randômicos
		for (int i=0;i<10;i++) {
			listaNumeros[i]=Math.round(Math.random()*100);
//			System.out.println("lista["+i+"]: "+listaNumeros[i]);
		}
		for (int ii=0;ii<10;ii++) {
			System.out.print(" ["+listaNumeros[ii]+"] ");
		}
		System.out.println("");
		boolean troca=true;
		int passo=0;
		while(troca) {
			System.out.println("passo= "+passo);
			passo++;
			troca=false;
			for (int i=0;i<9;i++) {
				if(listaNumeros[i+1]<listaNumeros[i]) {
					var auxiliar = listaNumeros[i];
					listaNumeros[i]=listaNumeros[i+1];
					listaNumeros[i+1]=auxiliar;
					troca=true;
					for (int ii=0;ii<10;ii++) {
						System.out.print(" ["+listaNumeros[ii]+"] ");
					}
					System.out.println("");
				}
			}
		}
		
		
		
	}

}
