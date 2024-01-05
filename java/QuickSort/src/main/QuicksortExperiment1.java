package main;

public class QuicksortExperiment1 {

	public static void main(String[] args) {
		System.out.println("QuicksortExperiment1 is running");
//		long[] listaNumeros = new long[10];
		long[] listaNumeros = new long[] { 4, 2, 8, 7, 1, 5, 3, 6 };
		// gera lista de número randômicos
//		for (int i = 0; i < 10; i++) {
//			listaNumeros[i] = Math.round(Math.random() * 100);
////			System.out.println("lista["+i+"]: "+listaNumeros[i]);
//		}
		// imprime lista original de números para ordenação
		for (int ii = 0; ii < listaNumeros.length; ii++) {
			System.out.print(" [" + listaNumeros[ii] + "] ");
		}
		System.out.println("");

		int indiceEsquerda = 0;
		int indiceDireita = listaNumeros.length - 1;
		long pivot = listaNumeros[0];
		System.out.println("pivot= " + pivot);

		while (indiceEsquerda <= indiceDireita) {

			while (listaNumeros[indiceEsquerda] < pivot) {
				indiceEsquerda++;
//				System.out.println("indiceEsquerda= "+indiceEsquerda);
			}

			while (listaNumeros[indiceDireita] >= pivot) {
				indiceDireita--;
//				System.out.println("indiceDireita= "+indiceDireita);
			}

			if (indiceEsquerda <= indiceDireita) {
				System.out.println("Swap, Esquerda: " + indiceEsquerda + " Direita: " + indiceDireita);
				var tempEsquerda = listaNumeros[indiceEsquerda];
				listaNumeros[indiceEsquerda] = listaNumeros[indiceDireita];
				listaNumeros[indiceDireita] = tempEsquerda;
			}

			// imprime lista original de números para ordenação
			for (int ii = 0; ii < listaNumeros.length; ii++) {
				System.out.print(" [" + listaNumeros[ii] + "] ");
			}
			System.out.println("");

		}
	}

	public void Quicksort(long[] vetor) {
		int indiceEsquerda = 0;
		int indiceDireita = vetor.length - 1;
		long pivot = vetor[0];
		System.out.println("pivot= " + pivot);

		while (indiceEsquerda <= indiceDireita) {

			while (vetor[indiceEsquerda] < pivot) {
				indiceEsquerda++;
//				System.out.println("indiceEsquerda= "+indiceEsquerda);
			}

			while (vetor[indiceDireita] >= pivot) {
				indiceDireita--;
//				System.out.println("indiceDireita= "+indiceDireita);
			}

			if (indiceEsquerda <= indiceDireita) {
				System.out.println("Swap, Esquerda: " + indiceEsquerda + " Direita: " + indiceDireita);
				var tempEsquerda = vetor[indiceEsquerda];
				vetor[indiceEsquerda] = vetor[indiceDireita];
				vetor[indiceDireita] = tempEsquerda;
			}

			imprimeVetor(vetor);
		}
	}
	
	public void imprimeVetor(long[] vetor) {
		// imprime lista original de números para ordenação
		for (int ii = 0; ii < vetor.length; ii++) {
			System.out.print(" [" + vetor[ii] + "] ");
		}
		System.out.println("");
	}

}
