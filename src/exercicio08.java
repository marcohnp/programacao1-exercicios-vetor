import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		/* Ler um vetor M de 10 elementos e imprimi-lo (ler pelo teclado os 10
		elementos do tipo inteiro). Troque a seguir o 1º elemento com o 6º, o 2º com o 7º, e assim
		por diante até o 5º com 10º, e escreva o vetor M modificado. */
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorM, vetorAux;
		vetorM = new int[10];
		vetorAux = new int[10];
		
		System.out.println("Digite 10 números para o Vetor M: ");
		for (int i = 0; i < vetorM.length; i++) {
				vetorM[i] = sc.nextInt();
				vetorAux[i] = vetorM[i];
		}
		
		for (int i = 0; i<vetorM.length; i++) {
			System.out.printf("Vetor M[%d]: %d\n", i, vetorM[i]);
			
		}
		
		System.out.println("Elementos trocados:");
		
		for (int i = 0; i<5; i++) {
			vetorM[i] = vetorM[i+5];
		}
		for (int i = 5; i<10; i++) {
			vetorM[i] = vetorAux[i-5];
		}
		
		for (int i = 0; i<vetorM.length; i++) {
			System.out.printf("Vetor M[%d]: %d\n", i, vetorM[i]);
		}
			
		sc.close();
	}

}
