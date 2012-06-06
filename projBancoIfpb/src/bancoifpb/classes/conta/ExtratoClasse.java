package bancoifpb.classes.conta;

import java.math.BigDecimal;

public class ExtratoClasse {
	
	private int doc = 0;
	private String numAgencia;
	private String numConta;
	private BigDecimal valorDeposito;
	private BigDecimal valorSaque;
	private BigDecimal valorIOF;
	
	
	public ExtratoClasse(){
			
	}


	/**
	 * @return the numAgencia
	 */
	public String getNumAgencia() {
		return numAgencia;
	}


	/**
	 * @param numAgencia the numAgencia to set
	 */
	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}


	/**
	 * @return the numConta
	 */
	public String getNumConta() {
		return numConta;
	}


	/**
	 * @param numConta the numConta to set
	 */
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}


	/**
	 * @return the valorDeposito
	 */
	public BigDecimal getValorDeposito() {
		return valorDeposito;
	}


	/**
	 * @param valorDeposito the valorDeposito to set
	 */
	public void setValorDeposito(BigDecimal valorDeposito) {
		this.valorDeposito = valorDeposito;
	}


	/**
	 * @return the valorSaque
	 */
	public BigDecimal getValorSaque() {
		return valorSaque;
	}


	/**
	 * @param valorSaque the valorSaque to set
	 */
	public void setValorSaque(BigDecimal valorSaque) {
		BigDecimal saq = new BigDecimal(-1.0);
		
		this.valorSaque = valorSaque.multiply(saq);
	}


	/**
	 * @return the valorIOF
	 */
	public BigDecimal getValorIOF() {
		return valorIOF;
	}


	/**
	 * @param valorIOF the valorIOF to set
	 */
	public void setValorIOF(BigDecimal valorIOF) {
		BigDecimal iof = new BigDecimal(-0.1);
		this.valorIOF = valorIOF.multiply(iof);
	}


	/**
	 * @return the doc
	 */
	public int getDoc() {
		return doc;
	}


	/**
	 * @param doc the doc to set
	 */
	public void setDoc(int doc) {
		this.doc = doc;
	}


	
	
	

}
