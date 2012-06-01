/**
 * 
 */
package bancoifpb.classes.cliente;


/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 * Declaramos aqui tudo relativo a entidade Cliente.
 */
public class Cliente {

	/** *Nome do responsavel pela conta */
	private String cliNome;
	/** *Sobrenome do responsavel pela conta */
	private String cliSobrenome;
	/** *Endereço do Cliente */
	private String cliEnd;
	/** *Numero do endereço do cliente */
	private String cliNum;
	
	
	public Cliente() {
	}
	public String getCliNome() {
		return cliNome;
	}

	public Boolean setCliNome(String cliNome) {
		if (cliNome != null) {
			this.cliNome = cliNome;
			return true;
		}else {
			return false;
		}
	}

	public String getCliSobrenome() {
		return cliSobrenome;
	}

	public void setCliSobrenome(String cliSobrenome) {
		this.cliSobrenome = cliSobrenome;
	}

	public String getCliEnd() {
		return cliEnd;
	}

	public void setCliEnd(String cliEnd) {
		this.cliEnd = cliEnd;
	}

	public String getCliNum() {
		return cliNum;
	}

	public void setCliNum(String cliNum) {
		this.cliNum = cliNum;
	}

	

}
