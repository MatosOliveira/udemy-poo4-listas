/**
 * 
 */
package poo.application;

import java.util.Locale;
import java.util.Scanner;

/**
 * Classe que le N números reais e armazene-os em um vetor. Em seguida: 
 * - Imprimir todos os elementos do vetor 
 * - Mostrar na tela a soma e a média dos elementos do vetor
 * 
 * @author Matos - 13.05.2023
 *
 */
public class SomaMediaNumReais {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0.0;
		double media = 0.0;

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			double num = sc.nextDouble();
			vetor[i] = num;
		}

		System.out.print("\nVALORES: ");

		for (int j = 0; j < vetor.length; j++) {
			System.out.print(vetor[j] + " ");
			soma += vetor[j];
		}
		
		media = soma / n;
		
		System.out.printf("\nSOMA = %.2f%n", soma );
		System.out.printf("MEDIA = %.2f%n", media );
		
		sc.close();

	}

}
