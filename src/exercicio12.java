import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		/* Elabore um programa que leia pelo teclado um vetor de 6 posições e
			também uma variável identificadora (1, 2, 3 ou 4 conforme o menu a seguir) que calcule a
			operação conforme as opções do menu mostrado a seguir. O menu deverá ser impresso
			na tela assim que os elementos do vetor forem lidos apresentando as opções de operação
			para o usuário:
			Escolha a opcao desejada:
			1- Soma dos elementos
			2- Produto dos elementos
			3- Média dos elementos
			4- Mostre o vetor
			?
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int identificadora = 0, soma = 0, multiplicacao = 1; 
		float media = 0, somaM = 0;
		int[] vetorA;
		vetorA = new int[6];
		
		System.out.println("Digite 6 números: ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.printf("Escolha a opção desejada: \n"
				+ "1- Soma dos elementos.\n"
				+ "2- Produto dos elementos.\n"
				+ "3- Média dos elementos.\n"
				+ "4- Mostre o vetor.\n");
		
		identificadora = sc.nextInt();
		
		if (identificadora == 1) {
			for (int i = 0; i < vetorA.length; i++) {
				soma = soma + vetorA[i];
			}
			System.out.printf("A soma dos elementos no vetor é: %d.\n", soma);	
		} 
		
		else if (identificadora == 2) {
			for (int i = 0; i < vetorA.length; i++) {
				multiplicacao = multiplicacao * vetorA[i];
			}
			System.out.printf("O produto entre os elementos no vetor é: %d.\n", multiplicacao);
		}
		
		else if (identificadora == 3) {
			for (int i = 0; i < vetorA.length; i++) {
				somaM = somaM + vetorA[i];
				media = somaM / 6;
			}
			System.out.printf("A média dos elementos no vetor é: %.2f.\n", media);
		}
		
		else if (identificadora == 4) {
			System.out.println("Os elementos do vetor na ordem em que foram inceridos são: ");
			for (int n : vetorA) {
				System.out.println(n);
			}
		}
		
		System.out.println("Programa Finalizado!");
		
		
		
		sc.close();
		
	}

}
