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

	private List<Cliente> cliente = new ArrayList<Cliente>();
	private List<Conta> conta;
	private String numAgencia;
	private String endAgencia;
	private String ufAgencia;
	private String cidadeAgencia;
	private String bairroAgencia;

	public Agencia() {
		this.numAgencia = null;
		this.endAgencia = null;
	}
	
	public Cliente getClienteAgencia(String nome){
		for (int i = 0; i < this.cliente.size(); i++) {
			if (nome.equals(cliente.get(i).getCliNome())){
				return cliente.get(i);
			}
		}return null;
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

	/**
	 * @return the ufAgencia
	 */
	public String getUfAgencia() {
		return ufAgencia;
	}

	/**
	 * @param ufAgencia the ufAgencia to set
	 */
	public void setUfAgencia(String ufAgencia) {
		this.ufAgencia = ufAgencia;
	}

	/**
	 * @return the cidadeAgencia
	 */
	public String getCidadeAgencia() {
		return cidadeAgencia;
	}

	/**
	 * @param cidadeAgencia the cidadeAgencia to set
	 */
	public void setCidadeAgencia(String cidadeAgencia) {
		this.cidadeAgencia = cidadeAgencia;
	}

	/**
	 * @return the bairroAgencia
	 */
	public String getBairroAgencia() {
		return bairroAgencia;
	}

	/**
	 * @param bairroAgencia the bairroAgencia to set
	 */
	public void setBairroAgencia(String bairroAgencia) {
		this.bairroAgencia = bairroAgencia;
	}

	
}
