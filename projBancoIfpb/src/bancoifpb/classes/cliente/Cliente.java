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
	
	private String cpf_cnpj;
	
	private String rg_ie;
	
	private String bairro;
	
	private String cidade;
	
	private String uf;
	
	private String limite;
	
	private String fone;
	
	private String agencia;
	
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

	/**
	 * @return the agencia
	 */
	public String getAgencia() {
		return agencia;
	}

	/**
	 * @param agencia the agencia to set
	 */
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	/**
	 * @return the cpf_cnpj
	 */
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	/**
	 * @param cpf_cnpj the cpf_cnpj to set
	 */
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	/**
	 * @return the rg_ie
	 */
	public String getRg_ie() {
		return rg_ie;
	}

	/**
	 * @param rg_ie the rg_ie to set
	 */
	public void setRg_ie(String rg_ie) {
		this.rg_ie = rg_ie;
	}
	
	
	
	

}
