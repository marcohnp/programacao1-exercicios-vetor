import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		/* Ler um vetor X de 10 elementos (ler pelo teclado os 10 elementos do tipo
		inteiro). Crie um vetor Y da seguinte forma: (a) os elementos de ordem par de Y (elementos
		com índice 0, 2, 4, 6, 8) receberão os respectivos elementos de X multiplicados por 2; (b)
		Os elementos de ordem ímpar de Y (elementos com índices 1, 3, 5, 7, 9) receberão os
		respectivos elementos de X multiplicados por 3. Escrever o vetor Y. */
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorX, vetorY;
		vetorX = new int[10];
		vetorY = new int[10];
		
		System.out.println("Digite 10 números para o Vetor X");
		for (int i = 0; i < vetorX.length; i++) {
			vetorX[i] = sc.nextInt();
		}
 		
		for (int i = 0; i < vetorY.length; i++) {
			if (i%2==0) {
				vetorY[i] = vetorX[i] * 2;
				System.out.printf("Vetor X[%d](%d) * 2 = %d.\n", i, vetorX[i], vetorY[i]);
			} else {
				vetorY[i] = vetorX[i] * 3;
				System.out.printf("Vetor X[%d](%d) * 3 = %d.\n", i, vetorX[i], vetorY[i]);
			}
			
		}
			
		
		
		sc.close();

	}

}
