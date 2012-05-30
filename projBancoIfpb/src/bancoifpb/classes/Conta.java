/**
 * 
 */


package bancoifpb.classes;

/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 *
 */

import java.math.BigDecimal;

public class Conta {

	/** * Numero da conta bancaria, aceitando somente valores inteiros. Tamanho do campo 05 digitos.*/
	private String numConta;

	/** * Numero do Digito Verificador da  conta bancaria, aceitando somente valores inteiros. Tamanho do campo 01 digito. */
	private String numDigitoVerificador;

	/**	 * Armazena o CPF do correntista em uma string com 14 digitos.	 */
	private String numCPF;
	
	/**  * Armazena o CNPJ do correntista em uma string com  digitos. */
	private String numCNPJ;

	/** * Armazena o saldo da conta em um valor numero com operaçoes precisas */
	private BigDecimal valorSaldo;
	
	
	public Conta() {
		this.numConta = "00000";
		this.numDigitoVerificador = "0";
		this.numConta = "0000";
		this.numCPF = "000.000.000-00";
		this.numCNPJ = "00.000.000/0000-00";
		this.valorSaldo = valorSaldo.add(null);
	}

	/** * Retorna o numero da conta */
	public String getNumConta() {
		return numConta;
	}


	public Boolean setNumConta(String numConta) {
		if (numConta!= null && numConta.length()<6) {
			this.numConta = numConta;
			return true;
		}else {
			return false;
		}
	}


	/** * Retorna o numero do digito verificador da conta */
	public String getNumDigitoVerificador(){
		return numDigitoVerificador;
	}


	public Boolean setNumDigitoVerificador(String numDigitoVerificador) {
		if (numDigitoVerificador != null && numDigitoVerificador.length()<10) {
			this.numDigitoVerificador = numDigitoVerificador;
			return true;
		}else {
			return false;
		}
	}


	public String getNumCPF() {
		return numCPF;
	}


	public Boolean setNumCPF(String numCPF) {
		if (numCPF!= null && numCPF.length()<15) {
			this.numCPF = numCPF;
			return true;	
		}else {
			return false;
		}
	}


	public String getNumCNPJ() {
		return numCNPJ;
	}


	public Boolean setNumCNPJ(String numCNPJ) {
		if (numCNPJ!= null && numCNPJ.length()<19) {
			this.numCNPJ = numCNPJ;
			return true;
		}else {
			return false;
		}
	}


	public BigDecimal getValorSaldo() {
		return valorSaldo;
	}


	public void setValorSaldo(BigDecimal valorSaldo) {
		this.valorSaldo = valorSaldo;
	}

	/**
	 * 
	 */

	
	

}
