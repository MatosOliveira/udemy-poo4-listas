/**
 * 
 */
package poo.application;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que le um número inteiro N e depois um vetor de N números reais.
 * 
 * Em seguida, mostrar na tela a média aritmética de todos elementos com três
 * casas decimais.
 * 
 * Depois mostrar todos os elementos do vetor que estejam abaixo da média, com
 * uma casa decimal cada.
 * 
 * @author Matos - 19.05.2023
 *
 */
public class NotasAbaixoMedia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] numeros = new double[n];
		double soma = 0.0;
		double mediaAritmetica = 0.0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}

		for (int j = 0; j < numeros.length; j++) {
			soma += numeros[j];
		}

		mediaAritmetica = soma / n;

		System.out.println(" ");
		System.out.printf("\nMEDIA DO VETOR: %.3f%n", mediaAritmetica);

		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int k = 0; k < numeros.length; k++) {
			if (numeros[k] < mediaAritmetica) {
				System.out.println(String.format("%.1f", numeros[k]));
			}

		}

		sc.close();

	}

}
