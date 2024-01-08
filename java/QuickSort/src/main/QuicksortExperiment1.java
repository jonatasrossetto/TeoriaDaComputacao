package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuicksortExperiment1 {

	public static void main(String[] args) {
		System.out.println("QuicksortExperiment1 is running");

		List<Long> listaNumeros = new ArrayList<Long>();

		// gera lista de número randômicos não repetidos
		boolean end = false;
		int inc = 0;
		while (!end) {
			var aux = Math.round(Math.random() * 10000);
			if (!listaNumeros.contains(aux)) {
				inc++;
				listaNumeros.add(aux);
			}
			if (inc==10) end=true;
		}
		
		System.out.println(listaNumeros);
		QuickSort(listaNumeros, 0, listaNumeros.size() - 1);
		System.out.println("*** FIM *** ");
		System.out.println(listaNumeros);

	}

	public static void QuickSort(List<Long> vetor, int inicio, int fim) {
		System.out.println("QuickSort started");
		if (inicio >= fim) {
			return;
		}

		int indiceEsquerda = inicio;
		int indiceDireita = fim;
		long pivot = vetor.get(indiceEsquerda);


		if (fim - inicio == 1) {
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
				swapElements(vetor, indiceEsquerda, indiceDireita);
			}

		}

		if (indiceDireita < inicio)
			indiceDireita = inicio;
		if (inicio<indiceEsquerda - 1) QuickSort(vetor, inicio, indiceEsquerda - 1);
		if (indiceDireita + 1< fim) QuickSort(vetor, indiceDireita + 1, fim);
		
	}

	public static List<Long> swapElements(List<Long> vetor, int indiceA, int indiceB) {
		var temp = vetor.get(indiceB);
		vetor.set(indiceB, vetor.get(indiceA));
		vetor.set(indiceA, temp);
		return vetor;
	}

}
