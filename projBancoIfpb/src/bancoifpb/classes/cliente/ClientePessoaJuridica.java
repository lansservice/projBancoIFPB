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
	private String razao;
	private String ie;

	
	
	public ClientePessoaJuridica() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}



	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	/**
	 * @return the razao
	 */
	public String getRazao() {
		return razao;
	}



	/**
	 * @param razao the razao to set
	 */
	public void setRazao(String razao) {
		this.razao = razao;
	}



	/**
	 * @return the ie
	 */
	public String getIe() {
		return ie;
	}



	/**
	 * @param ie the ie to set
	 */
	public void setIe(String ie) {
		this.ie = ie;
	}


	

}
