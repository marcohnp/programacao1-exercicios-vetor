
public class exercicio02 {

	public static void main(String[] args) {
		/* Preencher um vetor A de 10 elementos (�ndices de 0 a 9) em tempo de
		execu��o com os n�meros inteiros 10, 20, 30, 40, 50, ..., 100. Escrever o vetor A ap�s o
		seu total preenchimento. */
		
		int soma = 0;
		int[] vetor;
		vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
					soma = soma + 10;
					vetor[i] = soma;
					System.out.printf("Vetor A[%d]: %d.\n",i, vetor[i]);
		}

	}

}
