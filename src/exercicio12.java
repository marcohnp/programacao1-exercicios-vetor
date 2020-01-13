import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		/* Elabore um programa que leia pelo teclado um vetor de 6 posi��es e
			tamb�m uma vari�vel identificadora (1, 2, 3 ou 4 conforme o menu a seguir) que calcule a
			opera��o conforme as op��es do menu mostrado a seguir. O menu dever� ser impresso
			na tela assim que os elementos do vetor forem lidos apresentando as op��es de opera��o
			para o usu�rio:
			Escolha a opcao desejada:
			1- Soma dos elementos
			2- Produto dos elementos
			3- M�dia dos elementos
			4- Mostre o vetor
			?
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int identificadora = 0, soma = 0, multiplicacao = 1; 
		float media = 0, somaM = 0;
		int[] vetorA;
		vetorA = new int[6];
		
		System.out.println("Digite 6 n�meros: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.printf("Escolha a op��o desejada: \n"
				+ "1- Soma dos elementos.\n"
				+ "2- Produto dos elementos.\n"
				+ "3- M�dia dos elementos.\n"
				+ "4- Mostre o vetor.\n");
		
		identificadora = sc.nextInt();
		
		if (identificadora == 1) {
			for (int i = 0; i < vetorA.length; i++) {
				soma = soma + vetorA[i];
			}
			System.out.printf("A soma dos elementos no vetor �: %d.\n", soma);	
		} 
		
		else if (identificadora == 2) {
			for (int i = 0; i < vetorA.length; i++) {
				multiplicacao = multiplicacao * vetorA[i];
			}
			System.out.printf("O produto entre os elementos no vetor �: %d.\n", multiplicacao);
		}
		
		else if (identificadora == 3) {
			for (int i = 0; i < vetorA.length; i++) {
				somaM = somaM + vetorA[i];
				media = somaM / 6;
			}
			System.out.printf("A m�dia dos elementos no vetor �: %.2f.\n", media);
		}
		
		else if (identificadora == 4) {
			System.out.println("Os elementos do vetor na ordem em que foram inceridos s�o: ");
			for (int n : vetorA) {
				System.out.println(n);
			}
		}
		
		System.out.println("Programa Finalizado!");
		
		
		
		sc.close();
		
	}

}
