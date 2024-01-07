package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuicksortExperiment1 {

	public static void main(String[] args) {
		System.out.println("QuicksortExperiment1 is running");

//		List<Long> listaNumeros = Arrays.asList(4L, 2L, 8L, 7L, 1L, 5L, 3L, 6L);
		List<Long> listaNumeros = new ArrayList<Long>();
		// gera lista de número randômicos
		for (int i = 0; i < 10; i++) {
			var aux = Math.round(Math.random() * 100);
//			if (!listaNumeros.contains(aux))
				listaNumeros.add(aux);
		}

		System.out.println(listaNumeros);
		QuickSort(listaNumeros, 0, listaNumeros.size() - 1);
		System.out.println("*** FIM *** " + listaNumeros);

	}

	public static void QuickSort(List<Long> vetor, int inicio, int fim) {

		System.out.println("\n*** QuickSort Started ***");
		System.out.println("inicio: " + inicio + " fim: " + fim);
		System.out.println(vetor);

		if (inicio >= fim) {
			System.out.println("stop");
			return;
		}

		int indiceEsquerda = inicio;
		int indiceDireita = fim;
		long pivot = vetor.get(indiceEsquerda);
		System.out.println("pivot= " + pivot);

		if (fim - inicio == 1) {
			System.out.println("fim - inicio == 1");
			if (vetor.get(inicio) > vetor.get(fim)) {
				swapElements(vetor, inicio, fim);
				return;
			}
			return;
		}

		while (indiceEsquerda <= indiceDireita) {

			while (vetor.get(indiceEsquerda) < pivot) {
				indiceEsquerda++;
			}

			while (vetor.get(indiceDireita) >= pivot) {
				indiceDireita--;
				if (indiceDireita < inicio) {
					break;
				}
			}

			if (indiceEsquerda < indiceDireita) {
				System.out.println("\n-----");
				System.out.println(vetor);
				System.out.println("Swap, Esquerda: " + indiceEsquerda + " Direita: " + indiceDireita);
				swapElements(vetor, indiceEsquerda, indiceDireita);
				System.out.println(vetor);
			}

		}

		System.out.println("Esquerda: " + indiceEsquerda + " Direita: " + indiceDireita);
		if (indiceDireita<inicio) indiceDireita=inicio;

		System.out.println("esquerda");
		QuickSort(vetor, inicio, indiceEsquerda - 1);

		System.out.println("direita");
		QuickSort(vetor, indiceDireita + 1, fim);

	}

	public static List<Long> swapElements(List<Long> vetor, int indiceA, int indiceB) {
		var temp = vetor.get(indiceB);
		vetor.set(indiceB, vetor.get(indiceA));
		vetor.set(indiceA, temp);
		return vetor;
	}

}
