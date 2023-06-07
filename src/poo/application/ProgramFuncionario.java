/**
 * 
 */
package poo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import poo.entities.Funcionario;

/**
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e
 * salario) de N funcionários.
 * 
 * Não deve haver repetição de id. Em seguida, efetuar o aumento de X por cento
 * no salário de um determinado funcionário.
 * 
 * Para isso, o programa deve ler um id e o valor X. Se o id informado não
 * existir, mostrar uma mensagem e abortar a operação.
 * 
 * Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
 * 
 * Obs: Lembre-se de aplicar a técnica de encapsulamento para não permitir que o
 * salário possa ser mudado livremente. Um salário só pode ser aumentado com
 * base em uma operação de aumento por porcentagem dada.
 * 
 * @author Matos
 *
 */
public class ProgramFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionarios serao registrados? ");
		int n = sc.nextInt();

		List<Funcionario> lista = new ArrayList<Funcionario>();

		for (int i = 0; i < n; i++) {

			System.out.println("Funcionario # " + (i + 1) + ":");

			System.out.print("Id: ");
			int id = sc.nextInt();

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Salario: ");
			double salario = sc.nextDouble();

			lista.add(new Funcionario(id, nome, salario));

		}

		System.out.println("");
		System.out.println("Informe o ID do funcionario que recebera aumento de salario: ");
		int idFunc = sc.nextInt();

		//Verifica se o ID existe
		Funcionario func = lista.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);
		
		if (func == null) {
			System.out.println("This id does not exist!");
		} else {
			//Aumenta o salario 
			System.out.println("Informe o percentual de aumento de salario: ");
			double percentual = sc.nextDouble();

			for (Funcionario f : lista) {
				if (idFunc == f.getId()) {
					f.aumentaSalario(idFunc, percentual);
				}
			}
			
		}

		//Imprime lista
		System.out.println("Lista de Funcionarios: ");
		for (Funcionario f : lista) {
			System.out.println(f.toString());
		}

		sc.close();

	}

}
