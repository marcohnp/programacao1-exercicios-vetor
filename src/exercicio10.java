import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		/* Escreva um programa que leia diversos n�meros inteiros fornecidos pelo
		usu�rio e distribua esses valores entre dois vetores: o vetor dos �mpares e o vetor dos
		pares. Cada um ter� tamanho de 10 elementos. O t�rmino do algoritmo se dar� quando o
		usu�rio digitar zero ou um dos vetores tiver sido totalmente preenchido. Mostre o
		conte�do dos dois vetores no final. */
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 1, contP = 0, contI = 0;
		int[] vetorPar, vetorImpar;
		vetorPar = new int[10];
		vetorImpar = new int[10];
		
		
		
		System.out.println("Digite n�meros (pares e �mpares) para distribui��o nos vetores. Para finalizar digite 0. ");
		while (contI < 10) {
				numero = sc.nextInt();
				if (numero != 0) {
					if (numero%2==0) {
						vetorPar[contP] = numero;
						contP++;
						if (contP > 9) {
							contI = 10;
						}
					} else {
						vetorImpar[contI] = numero;
						contI++;
					}
				} else { 
					contP = 10;
					contI = 10;
				}
		}
		
			
		
		System.out.println("Vetor dos n�meros pares: ");
		for (int i = 0; i < vetorPar.length; i++) {
			if (vetorPar[i] != 0) {
				System.out.println(vetorPar[i]);
			}		
		}
		
		System.out.println("Vetor dos n�meros �mpares: ");
		for (int i = 0; i < vetorImpar.length; i++) {
			if (vetorImpar[i] != 0) {
				System.out.println(vetorImpar[i]);
			}
		}
		
		sc.close();
	}

}
