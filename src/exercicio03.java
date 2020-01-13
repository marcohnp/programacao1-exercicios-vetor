
public class exercicio03 {

	public static void main(String[] args) {
		/* Preencher um vetor B de 10 elementos em tempo de execução com o
		número 10 se o índice do elemento for ímpar, e com o número 20 se for par. Escrever o
		vetor B após o seu total preenchimento. */
		
		int impar = 10, par = 20;
		int[] vetor;
		vetor = new int[10];
		
		for (int i = 0; i < vetor.length; i++) {
				if (i%2==0) {
				vetor[i] = par;
				System.out.printf("Vetor B[%d]: %d.\n",i, vetor[i]);
				} else {
					vetor[i] = impar;
					System.out.printf("Vetor B[%d]: %d.\n", i, vetor[i]);
				}
		}

	}

}
