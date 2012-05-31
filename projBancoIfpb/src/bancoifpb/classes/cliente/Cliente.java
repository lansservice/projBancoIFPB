/**
 * 
 */
package bancoifpb.classes.cliente;


/**
 * @author Administrador
 *
 */
public class Cliente {

	/**
	 * 
	 */
	private String cliNome;
	
	
	public String getCliNome() {
		return cliNome;
	}

	public void setCliNome(String cliNome) {
		this.cliNome = cliNome;
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

	private String cliSobrenome;
	private String cliEnd;
	private String cliNum;
	
	public Cliente() {
	}

}
