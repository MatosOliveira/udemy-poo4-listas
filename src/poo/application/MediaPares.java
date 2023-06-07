/**
 * 
 */
package poo.application;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que le um vetor de N números inteiros. 
 * 
 * Em seguida, mostrar na tela a média aritmética somente dos números pares lidos, com uma casa decimal. 
 * 
 * Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 * 
 * @author Matos - 19.05.2023
 *
 */
public class MediaPares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		int soma = 0;
		int qtdePares = 0;
		int qtdeImpares = 0;
		double mediaPares = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		for (int j = 0; j < numeros.length; j++) {
			if(numeros[j] % 2 != 0) {
				qtdeImpares++;
			} else if(numeros[j] % 2 == 0){
				soma += numeros[j];
				qtdePares++;
			}
			
		}
		
		if(qtdeImpares == n) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			mediaPares = soma / qtdePares;
			System.out.printf("\nMEDIA DOS PARES: %.1f%n", mediaPares);
		}
		
		sc.close();

	}

}
