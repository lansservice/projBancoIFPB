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
	private String cliEndNum;
	
	private String bairro;
	
	private String cidade;
	
	private String uf;
	
	private String limite;
	
	private String fone;
	
	
	public Cliente() {
	}


	/**
	 * @return the cliNome
	 */
	public String getCliNome() {
		return cliNome;
	}


	/**
	 * @param cliNome the cliNome to set
	 */
	public void setCliNome(String cliNome) {
		this.cliNome = cliNome;
	}


	/**
	 * @return the cliSobrenome
	 */
	public String getCliSobrenome() {
		return cliSobrenome;
	}


	/**
	 * @param cliSobrenome the cliSobrenome to set
	 */
	public void setCliSobrenome(String cliSobrenome) {
		this.cliSobrenome = cliSobrenome;
	}


	/**
	 * @return the cliEnd
	 */
	public String getCliEnd() {
		return cliEnd;
	}


	/**
	 * @param cliEnd the cliEnd to set
	 */
	public void setCliEnd(String cliEnd) {
		this.cliEnd = cliEnd;
	}


	/**
	 * @return the cliEndNum
	 */
	public String getCliEndNum() {
		return cliEndNum;
	}


	/**
	 * @param cliEndNum the cliEndNum to set
	 */
	public void setCliEndNum(String cliEndNum) {
		this.cliEndNum = cliEndNum;
	}


	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}


	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	/**
	 * @return the cidade
	 */
	public String getCidade() {
		return cidade;
	}


	/**
	 * @param cidade the cidade to set
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}


	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}


	/**
	 * @return the limite
	 */
	public String getLimite() {
		return limite;
	}


	/**
	 * @param limite the limite to set
	 */
	public void setLimite(String limite) {
		this.limite = limite;
	}


	/**
	 * @return the fone
	 */
	public String getFone() {
		return fone;
	}


	/**
	 * @param fone the fone to set
	 */
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	

}
