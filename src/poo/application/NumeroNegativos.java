/**
 * 
 */
package poo.application;

import java.util.Scanner;

/**
 * Classe que le um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor. 
 * 
 * Em seguida, mostrar na tela todos os números negativos lidos.
 * 
 * @author Matos - 13.05.2023
 *
 */
public class NumeroNegativos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int [] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			int num = sc.nextInt();
			vetor[i] = num;
		}
		
		System.out.println("NUMERO(S) NEGATIVO(S): ");
		
		for(int j = 0; j < vetor.length; j++) {
			if(vetor[j] < 0) {
				System.out.println(vetor[j]);
			}
		}
		
		sc.close();

	}

}
