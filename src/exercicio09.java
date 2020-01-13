import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		/* Escreva um programa que leia pelo teclado 2 vetores (A e B) de 10 elementos
		inteiros. Crie um terceiro vetor (C) que seja a união dos dois primeiros (10 + 10). Mostre o
		vetor resultante. */
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA, vetorB, vetorC;
		vetorA = new int[10];
		vetorB = new int[10];
		vetorC = new int[10];
		
		System.out.println("Digite 10 números para o Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
				vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite 10 números para o Vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
				vetorB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetorC.length; i++) {
				vetorC[i] = vetorA[i] + vetorB[i];
				System.out.printf("Vetor A[%d](%d) + Vetor B[%d](%d) = Vetor C[%d](%d).\n", i, vetorA[i], i, vetorB[i], i, vetorC[i]);
		}
		
		
		
		sc.close();

	}

}
