/**
 * 
 */
package poo.application;

import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e uma matriz ordem N contendo
 * números inteiros.
 * 
 * Em seguida, mostrar a diagonal principal e a quantidade de valores negativos
 * da matriz.
 * 
 * @author Matos - 25.05.2023
 *
 */
public class MatrizMxN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		int qtde = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		// Diagonal Principal
		System.out.println("Diagonal Principal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		// Numeros negativos
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					qtde++;
				}
			}
		}

		System.out.println("\nNumeros negativos: " + qtde);

		sc.close();

	}

}
