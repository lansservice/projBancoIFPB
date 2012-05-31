/**
 * 
 */


package bancoifpb.classes;

/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 * Inicialmente forao declaradas inumeras variaveis do tipo String mesmo que elas recebam somente numeros,
 * para que assim possamos validar os valores e tratarmos melhor todos entidades.
 *
 */

import java.math.BigDecimal;

public class Conta {

	/** * Numero da conta bancaria, aceitando somente valores inteiros. Tamanho do campo 05 digitos.*/
	private String numConta;

	/** * Numero do Digito Verificador da  conta bancaria, aceitando somente valores inteiros. Tamanho do campo 01 digito. */
	private String numDigitoVerificador;

	/** * Armazena o saldo da conta em um valor numero com opera�oes precisas */
	private BigDecimal valorSaldo;
	
	
	public Conta() {
		this.numConta = "00000";
		this.numDigitoVerificador = "0";
		this.numConta = "0000";
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
