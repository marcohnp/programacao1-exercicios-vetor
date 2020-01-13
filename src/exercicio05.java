//import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		/* Escreva um programa que leia dois vetores (A e B) de 10 posições e faça a
		multiplicação dos elementos de mesmo índice em ambos os vetores colocando o resultado
		em um terceiro vetor (C). Mostre o vetor resultante. */
		
		//Scanner sc = new Scanner(System.in);
				
		int[] vetorA = {14, 23, 17, 16, 19, 25, 35, 45, 57, 95};
		int[] vetorB = {2, 4, 5, 7, 8, 9, 6, 3, 1, 10};
		int[] vetorC;
		vetorC = new int[10];
		/*int[] vetorA, vetorB, vetorC;
		vetorA = new int[10];
		vetorB = new int[10];
		vetorC = new int[10];
		
		System.out.println("Digite 10 números para o Vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
				vetorA[i] = sc.nextInt();
			}
		
		System.out.println("Digite 10 números para o Vetor B:");
		for (int i = 0; i < vetorB.length; i++) {
				vetorB[i] = sc.nextInt();
		}
		*/
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
			System.out.printf("Vetor A[%d](%d) * Vetor B[%d](%d) = Vetor C[%d](%d).\n",i, vetorA[i], i, vetorB[i], i, vetorC[i]);
		}
			
	
		//sc.close();
		
		


	}

}
