public class exercicio01 {

public static void main(String[] args) {
/* Preencher um vetor X de 10 elementos (�ndices de 0 a 9) em tempo de
execu��o com o valor inteiro 30. Escrever o vetor X ap�s seu total preenchimento. */
		
		int[] vetor;
		vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
					vetor[i] = 30;
					System.out.printf("Vetor X, �ndice %d : %d.\n", i, vetor[i]);
		}

	}

}
