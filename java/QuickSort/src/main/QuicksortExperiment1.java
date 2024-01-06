package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuicksortExperiment1 {

	public static void main(String[] args) {
		System.out.println("QuicksortExperiment1 is running");

		List<Long> listaNumeros = Arrays.asList(4L, 2L, 8L, 7L, 1L, 5L, 3L, 6L);

		// gera lista de número randômicos
//		for (int i = 0; i < 10; i++) {
//			listaNumeros[i] = Math.round(Math.random() * 100);
////			System.out.println("lista["+i+"]: "+listaNumeros[i]);
//		}

		imprimeVetor(listaNumeros);
		QuickSort(listaNumeros);

	}

	public static List<Long> QuickSort(List<Long> vetor) {
		
		int indiceEsquerda = 0;
		int indiceDireita = vetor.size() - 1;
		long pivot = vetor.get(indiceEsquerda);
		System.out.println("pivot= " + pivot);

		while (indiceEsquerda <= indiceDireita) {

			if (vetor.size() == 2) {
				if (vetor.get(0) > vetor.get(1)) {
					return swapElements(vetor, 0, 1);
				}
			}

			while (vetor.get(indiceEsquerda) < pivot) {
				indiceEsquerda++;
				System.out.println("indiceEsquerda= "+indiceEsquerda);
			}

			while (vetor.get(indiceDireita) >= pivot) {
				indiceDireita--;
				System.out.println("indiceDireita= "+indiceDireita);
				if (indiceDireita<0) break;
			}

			if (indiceEsquerda <= indiceDireita) {
				System.out.println("Swap, Esquerda: " + indiceEsquerda + " Direita: " + indiceDireita);
				vetor = swapElements(vetor, indiceEsquerda, indiceDireita);
			}
			imprimeVetor(vetor);
		}
		System.out.println("Fim, Esquerda: " + indiceEsquerda + " Direita: " + indiceDireita);

		
		
		//		var vetorEsquerda = Arrays.copyOfRange(vetor, 0, indiceEsquerda);
//		var vetorDireita = Arrays.copyOfRange(vetor, indiceEsquerda, vetor.length-1);
//		imprimeVetor(vetorEsquerda);
//		imprimeVetor(vetorDireita);
//		vetorEsquerda=QuickSort(vetorEsquerda);
//		vetorDireita=QuickSort(vetorDireita);
		return vetor;
	}

	public static void imprimeVetor(List<Long> vetor) {
		// imprime os elementos de vetor
		for (int ii = 0; ii < vetor.size(); ii++) {
			System.out.print(" [" + vetor.get(ii) + "] ");
		}
		System.out.println("");
	}

	public static List<Long> swapElements(List<Long> vetor, int indiceA, int indiceB) {
		var temp = vetor.get(indiceA);
		vetor.set(indiceB, vetor.get(indiceA));
		vetor.set(indiceA, vetor.get(indiceB));
		return vetor;

	}

}
