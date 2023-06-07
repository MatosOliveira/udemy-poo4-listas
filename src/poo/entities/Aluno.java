/**
 * 
 */
package poo.entities;

/**
 * @author Matos
 *
 */
public class Aluno {

	private String nome;
	private double nota1;
	private double nota2;
	
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double mediaNotas(double nota1, double nota2) {
		return (nota1 + nota2) / 2;
	}
	
}
