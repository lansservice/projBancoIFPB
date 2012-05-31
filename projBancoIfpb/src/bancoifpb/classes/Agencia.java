/**
 * 
 */
package bancoifpb.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 * Nesta Classe temos algumas listas interessantes, CLIENTES e CONTAS;
 */
public class Agencia {

	private List<Cliente> cliente;
	private List<Conta> conta;

	public Agencia() {
		conta = new ArrayList<Conta>();
		cliente = new ArrayList<Cliente>();
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

}
