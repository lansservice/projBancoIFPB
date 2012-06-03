/**
 * 
 */
package bancoifpb.classes;

import java.util.ArrayList;
import java.util.List;
import bancoifpb.classes.cliente.*;
import bancoifpb.classes.conta.*;

/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 * Nesta Classe temos algumas listas interessantes, CLIENTES e CONTAS;
 */
public class Agencia {

	private List<Cliente> cliente;
	private List<Conta> conta;
	private int numAgencia;
	private String endAgencia;

	public Agencia() {
		this.conta = new ArrayList<Conta>();
		this.cliente = new ArrayList<Cliente>();
		this.numAgencia = 0;
		this.endAgencia = null;
	}

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public List<Conta> getConta() {
		return conta;
	}

	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}

	/**
	 * @return the numAgencia
	 */
	public int getNumAgencia() {
		return numAgencia;
	}

	/**
	 * @param numAgencia the numAgencia to set
	 */
	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}

	/**
	 * @return the endAgencia
	 */
	public String getEndAgencia() {
		return endAgencia;
	}

	/**
	 * @param endAgencia the endAgencia to set
	 */
	public void setEndAgencia(String endAgencia) {
		this.endAgencia = endAgencia;
	}

}
