/**
 * 
 */
package poo.entities;

/**
 * @author Matos
 *
 */
public class AluguelQuarto {

	private String nome;
	private String email;
	
	public AluguelQuarto(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return nome + ", " + email;
	}
	
}
