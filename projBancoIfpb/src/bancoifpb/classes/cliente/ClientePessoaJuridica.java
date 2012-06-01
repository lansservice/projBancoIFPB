/**
 * 
 */
package bancoifpb.classes.cliente;


/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 * Declaramos aqui tudo relativo a entidade Cliente.
 */
public class ClientePessoaJuridica extends Cliente {

	private String cnpj;
	private String renda;
	
	
	public ClientePessoaJuridica() {
		// TODO Auto-generated constructor stub
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getRenda() {
		return renda;
	}


	public void setRenda(String renda) {
		this.renda = renda;
	}
	
	

}
