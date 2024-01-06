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

		System.out.println(listaNumeros);
		QuickSort(listaNumeros, 0, listaNumeros.size() - 1);
		System.out.println("*** FIM *** " + listaNumeros);

	}

	public static void QuickSort(List<Long> vetor, int inicio, int fim) {
		System.out.println("*** QuickSort Started ***");
		System.out.println("inicio: "+inicio+" fim: "+fim);
		System.out.println(vetor);
		if (inicio >= fim) {
			System.out.println("stop");
			return;
		}
//		System.out.println(vetor.subList(inicio, fim+1));
		int indiceEsquerda = inicio;
		int indiceDireita = fim;
		long pivot = vetor.get(indiceEsquerda);
		System.out.println("pivot= " + pivot);
		System.out.println(vetor.size());

		while (indiceEsquerda <= indiceDireita) {
			if (fim - inicio == 1) {
				System.out.println("fim - inicio == 1");
				if (vetor.get(inicio) > vetor.get(fim)) {
					swapElements(vetor, inicio, fim);
					return;
				}
				return;
			}

			while (vetor.get(indiceEsquerda) < pivot) {
				indiceEsquerda++;
//				System.out.println("indiceEsquerda= "+indiceEsquerda);
			}

			while (vetor.get(indiceDireita) >= pivot) {
				indiceDireita--;
//				System.out.println("indiceDireita= "+indiceDireita);
				if (indiceDireita < 0)
					break;
			}

			if (indiceEsquerda <= indiceDireita) {
				System.out.println("Swap, Esquerda: " + indiceEsquerda + " Direita: " + indiceDireita);
				vetor = swapElements(vetor, indiceEsquerda, indiceDireita);
			}
		}

		System.out.println("Esquerda: " + indiceEsquerda + " Direita: " + indiceDireita);
		System.out.println("esquerda");
		QuickSort(vetor, inicio, indiceEsquerda-1);
		System.out.println("Esquerda: " + indiceEsquerda + " Direita: " + indiceDireita);
		
		System.out.println("direita");
		QuickSort(vetor, indiceDireita+1, fim);
		System.out.println("Esquerda: " + indiceEsquerda + " Direita: " + indiceDireita);


	}

	public static List<Long> swapElements(List<Long> vetor, int indiceA, int indiceB) {
		var temp = vetor.get(indiceB);
		vetor.set(indiceB, vetor.get(indiceA));
		vetor.set(indiceA, temp);
		return vetor;
	}

}
