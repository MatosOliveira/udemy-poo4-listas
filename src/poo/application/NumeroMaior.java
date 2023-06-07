/**
 * 
 */
package poo.application;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que le N números reais e armazene-os em um vetor. 
 * 
 * Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). 
 * 
 * Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).
 * 
 * @author Matos - 19.05.2023
 *
 */
public class NumeroMaior {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double [] numeros = new double[n];
		int posicao = 0;
		double maiorValor = 0.0;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		for(int j = 0; j < numeros.length - 1; j++) {
			if(numeros[j] > numeros[j + 1]) {
				maiorValor = numeros[j];
				posicao = j;
			}
		}
		
		System.out.println(" ");
		System.out.println("\nMAIOR VALOR: " + maiorValor);
		System.out.println("POSICAO DO MAIOR VALOR: " + posicao);
		
		sc.close();

	}

}
