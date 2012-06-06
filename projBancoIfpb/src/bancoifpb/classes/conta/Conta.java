/**
 * 
 */


package bancoifpb.classes.conta;

/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 * Inicialmente forao declaradas inumeras variaveis do tipo String mesmo que elas recebam somente numeros,
 * para que assim possamos validar os valores e tratarmos melhor todos entidades.
 *
 */

import java.math.BigDecimal;
import java.util.HashMap;



public class Conta {
	
	/** * Lista de Depositos*/
	private HashMap<String, Deposito> map_deposito = new HashMap<String, Deposito>();
	/** * Lista de Saques*/
	private HashMap<String, Saque> map_saque = new HashMap<String, Saque>();
	
	/** * Lista do Extrato*/
	private HashMap<String, Extrato> map_extrato = new HashMap<String, Extrato>();
	
	/** * Valor fixo em percentagem para algumas movimentaçoes financeiras*/
	final double IOF = 0.01;

	/** * Numero da conta bancaria, aceitando somente valores inteiros. Tamanho do campo 05 digitos.*/
	private String numConta;
	
	private String numAgencia;
	
	private String cpf;

	/** * Armazena o saldo da conta em um valor numero com operaçoes precisas */
	private BigDecimal valorSaldo;
	
	
	public Conta() {
		this.numConta = "00000";
		this.cpf = "";
		
	}


	/**
	 * @return the map_deposito
	 */
	public HashMap<String, Deposito> getMap_deposito() {
		return map_deposito;
	}


	/**
	 * @param map_deposito the map_deposito to set
	 */
	public void setMap_deposito(HashMap<String, Deposito> map_deposito) {
		this.map_deposito = map_deposito;
	}


	/**
	 * @return the map_saque
	 */
	public HashMap<String, Saque> getMap_saque() {
		return map_saque;
	}


	/**
	 * @param map_saque the map_saque to set
	 */
	public void setMap_saque(HashMap<String, Saque> map_saque) {
		this.map_saque = map_saque;
	}


	/**
	 * @return the map_extrato
	 */
	public HashMap<String, Extrato> getMap_extrato() {
		return map_extrato;
	}


	/**
	 * @param map_extrato the map_extrato to set
	 */
	public void setMap_extrato(HashMap<String, Extrato> map_extrato) {
		this.map_extrato = map_extrato;
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
	 * @return the valorSaldo
	 */
	public BigDecimal getValorSaldo() {
		return valorSaldo;
	}


	/**
	 * @param valorSaldo the valorSaldo to set
	 */
	public void setValorSaldo(BigDecimal valorSaldo) {
		this.valorSaldo = valorSaldo;
	}


	

}
