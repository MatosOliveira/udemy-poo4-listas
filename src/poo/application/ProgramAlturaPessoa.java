/**
 * 
 */
package poo.application;

import java.util.Locale;
import java.util.Scanner;

import poo.entities.Pessoa;

/**
 * Classe que le nome, idade e altura de N pessoas, conforme exemplo. Em seguida:
 * 
 * - Mostrar na tela a altura média das pessoas, 
 * - Mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
 * 
 * @author Matos - 13.05.2023
 *
 */
public class ProgramAlturaPessoa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Pessoa p;
		double soma = 0.0;
		double media = 0.0;
		double menorDezesseis = 0.0;
		double percentual = 0.0;
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int qtde = sc.nextInt();
		Pessoa [] pessoas = new Pessoa[qtde];
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			pessoas[i] = new Pessoa(nome, idade, altura);
			
		}
		
		//obtem a altura e calcula a media
		for(int j = 0; j < pessoas.length; j++) {
			soma += pessoas[j].getAltura();
		}
		
		media = soma / qtde;
		System.out.printf("\nAltura media: %.2f%n ", media);
		
		//obtem a quantidade de menores de 16 anos
		for(int k = 0; k < pessoas.length; k++) {
			if(pessoas[k].getIdade() < 16) {
				menorDezesseis += 1;
			}
		}
		
		percentual = (menorDezesseis / qtde) * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);
		
		//imprime o nome dos menores de 16 anos
		for(int k = 0; k < pessoas.length; k++) {
			if(pessoas[k].getIdade() < 16) {
				System.out.println(pessoas[k].getNome());
			}
		}
		
		sc.close();

	}

}
