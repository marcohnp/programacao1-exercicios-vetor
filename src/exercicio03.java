
public class exercicio03 {

	public static void main(String[] args) {
		/* Preencher um vetor B de 10 elementos em tempo de execu��o com o
		n�mero 10 se o �ndice do elemento for �mpar, e com o n�mero 20 se for par. Escrever o
		vetor B ap�s o seu total preenchimento. */
		
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
