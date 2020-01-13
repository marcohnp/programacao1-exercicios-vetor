//import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		/* Escreva um programa que leia e mostre um vetor de 20 elementos inteiros
		(inicializado em tempo de compilação). A seguir, conte e diga quantos valores pares
		existem no vetor. */
		
		//Scanner sc = new Scanner(System.in);
		
		int somaPar = 0;
		int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		/* vetor = new int[20];
		
		System.out.println("Digite 20 números para o Vetor A:");
		for (int i = 0; i < vetor.length; i++) {
				vetor[i] = sc.nextInt();
		} */
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]%2==0) {
				somaPar++;
			}
			System.out.printf("Vetor A[%d]: %d.\n", i, vetor[i]);
		}
		
		System.out.printf("Existem %d números pares no vetor A.\n", somaPar);
		
		//sc.close();

	}

}
