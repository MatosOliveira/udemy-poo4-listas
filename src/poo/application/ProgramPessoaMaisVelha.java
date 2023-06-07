/**
 * 
 */
package poo.application;

import java.util.Locale;
import java.util.Scanner;

import poo.entities.Pessoa;

/**
 * Classe que le um conjunto de nomes de pessoas e suas respectivas idades. 
 * 
 * Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. 
 * 
 * Depois, mostrar na tela o nome da pessoa mais velha.
 * 
 * @author Matos - 19.05.2023
 *
 */
public class ProgramPessoaMaisVelha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas voce vai digitar? ");
		int qtde = sc.nextInt();
		Pessoa [] pessoas = new Pessoa[qtde];
		//int maiorIdade = 0;
		String nomeMaisVelho = null;
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			pessoas[i] = new Pessoa(nome, idade);
			
		}
		
		for(int j = 0; j < pessoas.length - 1; j++) {
			if(pessoas[j].getIdade() > pessoas[j + 1].getIdade()) {
				//maiorIdade = pessoas[j].getIdade();
				nomeMaisVelho = pessoas[j].getNome();
			} else if (qtde == 2) {
				//maiorIdade = pessoas[j + 1].getIdade();
				nomeMaisVelho = pessoas[j + 1].getNome();
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nomeMaisVelho);
		
		sc.close();

	}

}
