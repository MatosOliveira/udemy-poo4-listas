/**
 * 
 */
package poo.application;

import java.util.Locale;
import java.util.Scanner;

import poo.entities.Aluno;

/**
 * Classe que le um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres. 
 * 
 * Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados, 
 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis).
 * 
 * @author Matos - 19.05.2023
 *
 */
public class ProgramNotasAluno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas alunos serao digitados? ");
		int qtde = sc.nextInt();
		Aluno [] alunos = new Aluno[qtde];
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno: ");
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.next();
			
			sc.nextLine();
			System.out.print("Nota 1: ");
			double nota1 = sc.nextDouble();
			
			System.out.print("Nota 2: ");
			double nota2 = sc.nextDouble();
			
			alunos[i] = new Aluno(nome, nota1, nota2);
			
		}
		
		System.out.println("ALUNOS APROVADOS: ");
		for(int j = 0; j < alunos.length; j++) { 
			
			if(alunos[j].mediaNotas(alunos[j].getNota1(), alunos[j].getNota2()) >= 6.0) {
				
				System.out.println(alunos[j].getNome());
			}
		}
		sc.close();

	}

}
