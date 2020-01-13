
public class exercicio06 {

	public static void main(String[] args) {
		/* Escreva um programa que leia um vetor de 30 posições de números inteiros
		(inicializado em tempo de compilação) e mostre somente os positivos com suas
		respectivas posições. */
		
		int[] vetor = {10, -15, 23, 7, 3, -2, -27, -17, 19, 30, -63,-78, 9, -99, 18,
				36, 100, 78, -45, 89, -63, 42, 50, 1, 63, -96, -78, -98, 65, 40};
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > 0) {
				System.out.printf("O valor em Vetor[%d](%d) é positivo.\n", i, vetor[i]);
			} /*else {
				System.out.printf("O valor em Vetor[%d](%d) é negativo.\n", i, vetor[i]);
			}*/
		}

	}

}
