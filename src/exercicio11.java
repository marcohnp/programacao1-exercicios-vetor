
public class exercicio11 {

	public static void main(String[] args) {
		// Escreva um programa que leia um vetor de 20 posições e mostre-o ordenado em ordem crescente.
		
			
		int[] vet = { 7, 4, 10, 8, 2, 5, 1, 3, 6, 12, 14, 11, 16, 15, 17, 19, 18, 20, 9, 13};
		 
		System.out.println("Vetor sem ordenacao:");
 
		for (int n : vet) {
			System.out.print(n + " ");
		}
		
		System.out.println();
 
		for (int i = 1; i < vet.length; i++) {
			for (int j = 0; j < i; j++) {
				if (vet[i] < vet[j]) {
					int aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
				}
 
			}
		}
 
		System.out.println("Vetor em ordem crescente:");
 
		for (int n : vet) {
			System.out.print(n + " ");
		}
		
	}
}