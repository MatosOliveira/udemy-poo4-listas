/**
 * 
 */
package poo.application;

import java.util.Scanner;

import poo.entities.AluguelQuarto;

/**
 * Classe que cria um vetor que recebe os numeros dos quartos de uma pensao.
 * Ambos devem ser iniciados com 0 (quartos vazios).
 * 
 * Em seguida, le a quantidade (N) de estudantes que alugaram os quartos.
 * Registrar as informacoes do estudante que alugou o quarto: 
 * - Nome 
 * - E-mail 
 * - Nº do quarto
 * 
 * Exibir um relatorio do pensionato de todos os quartos.
 * 
 * 
 * @author Matos
 *
 */
public class ProgramPensaoEstudantes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		AluguelQuarto[] quartos = new AluguelQuarto[10];

		for (int i = 0; i < n; i++) {

			System.out.println("Rent # " + (i + 1) + ":");

			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
		
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int numQuarto = sc.nextInt();
			
			quartos[numQuarto] = new AluguelQuarto(nome, email);

		}
		
		System.out.println("Busy rooms: ");
		for(int j = 0; j < quartos.length; j++) {
			if(quartos[j] != null) {
				System.out.println(j + ": " + quartos[j].toString());
			}
		}
		
		sc.close();

	}

}
