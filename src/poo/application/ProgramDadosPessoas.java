/**
 * 
 */
package poo.application;

import java.util.Locale;
import java.util.Scanner;

import poo.entities.Pessoa;

/**
 * Classe que le um conjunto de dados contendo a altura e o gênero (M, F) de N
 * pessoas e calcule e escreva: - a maior e a menor altura do grupo, - a média
 * de altura das mulheres e; - o número de homens.
 * 
 * @author Matos - 20.05.2023
 *
 */
public class ProgramDadosPessoas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double maiorAltura = 0.0;
		double menorAltura = 0.0;
		double mediaAlturaMulheres = 0.0;
		int qtdeHomens = 0;
		int qtdeMulheres = 0;
		double soma = 0.0;

		System.out.println("Quantas pessoas serao digitadas? ");
		int qtde = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[qtde];

		for (int i = 0; i < pessoas.length; i++) {

			System.out.println("Altura da " + (i + 1) + "a pessoa: ");
			double altura = sc.nextDouble();

			System.out.println("Genero da " + (i + 1) + "a pessoa: ");
			char genero = sc.next().charAt(0);

			pessoas[i] = new Pessoa(altura, genero);

		}
		
		// obtem a maior altura
		for (int j = 0; j < pessoas.length; j++) {
			if (pessoas[j].getAltura() > maiorAltura) {
				maiorAltura = pessoas[j].getAltura();
			} 
		}

		// obtem a menor altura
		menorAltura = pessoas[0].getAltura();
		for (int j = 0; j < pessoas.length; j++) {
			if (pessoas[j].getAltura() < menorAltura) {
				menorAltura = pessoas[j].getAltura();
			} 
		}
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);

		// calcula a media das alturas das mulheres
		for (int k = 0; k < pessoas.length; k++) {
			if (pessoas[k].getGenero() == 'F') {
				soma += pessoas[k].getAltura();
				qtdeMulheres++;
			} else {
				qtdeHomens++;
			}

		}

		mediaAlturaMulheres = soma / qtdeMulheres;
		System.out.printf("\nMedia das alturas das mulheres: %.2f%n ", mediaAlturaMulheres);

		System.out.println("Numero de homens = " + qtdeHomens);

		sc.close();

	}

}
