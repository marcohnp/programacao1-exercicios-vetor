
public class exercicio13 {

	public static void main(String[] args) {
		/* Faça um programa que leia dois vetores (A e B) de 30 posições e crie um
		terceiro (C) com a intersecção dos dois primeiros, isto é, coloque em C apenas os
		elementos que coexistem em A e B. Mostre C. */
		
		int[] vetorA = {1, 2, 3, 7, 11, 14, 20, 22, 17, 26, 29, 32, 34, 36, 39, 40, 43, 46, 48, 50, 52, 53, 57, 61, 63, 68, 69, 72, 73, 75};
		int[] vetorB = {4, 5, 8, 9, 11, 13, 17, 21, 23, 26, 28, 31, 33, 34, 38, 40, 42, 46, 47, 49, 53, 50, 55, 56, 60, 61, 64, 68, 70, 75};
		int[] vetorC;
		vetorC = new int[30];
		
		System.out.println("Vetor A: ");
		for (int n : vetorA) {
			System.out.print(n + ", ");
		}
		
		System.out.println(" ");
		System.out.println("\nVetor B: ");
		for (int n : vetorB) {
			System.out.print(n + ", ");
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if (vetorA[i] == vetorB[j]) {
					vetorC[i] = vetorA[i];
				}
			}
		}
		
		System.out.println(" ");
		System.out.println("\nVetor C(apenas números que repetem nos vetores A e B): ");
		for (int i = 0; i < vetorC.length; i++) {
			if (vetorC[i] != 0) {
				System.out.print(vetorC[i] + ", ");
			}
		}
	}

}
