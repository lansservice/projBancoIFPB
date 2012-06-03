/**
 * 
 */
package bancoifpb.classes.cliente;

/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 * Declaramos aqui tudo relativo a entidade Cliente.
 */

public class ClientePessoaFisica extends Cliente{

	/**
	 * 
	 */
	private String cpf;
	private String rg;

	
	public ClientePessoaFisica() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}


	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}


	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}



	
	
}
