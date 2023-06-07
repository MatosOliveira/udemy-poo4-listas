/**
 * 
 */
package poo.entities;

/**
 * @author Matos
 *
 */
public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		return id + ", " + nome + ", " + salario;
	}

	public Double aumentaSalario(Integer idFunc, Double percentual) {
		percentual /= 100;
		return	salario = salario * (1.00 + percentual); 
	}
	
}
