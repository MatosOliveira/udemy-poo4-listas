/**
 * 
 */
package poo.application;

import java.util.Scanner;

/**
 * Classe que le N números inteiros e armazene-os em um vetor. 
 * 
 * Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.
 * 
 * @author Matos - 19.05.2023
 *
 */
public class NumerosPares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int [] pares = new int[n];
		int qtdePares = 0;
		
		for(int i = 0; i < pares.length; i++) {
			System.out.println("Digite um numero: ");
			pares[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES:");
		for(int j = 0; j < pares.length; j++) {
			if(pares[j] % 2 == 0) {
				System.out.print(pares[j] + "  ");
				qtdePares++;
			}
		}
		
		System.out.println(" ");
		System.out.println("\nQUANTIDADE DE PARES: " + qtdePares);
		
		sc.close();

	}

}
