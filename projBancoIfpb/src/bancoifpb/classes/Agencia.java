/**
 * 
 */
package bancoifpb.classes;

import java.util.HashMap;

import javax.swing.JOptionPane;

import bancoifpb.classes.cliente.*;
import bancoifpb.classes.conta.*;

/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 * Nesta Classe temos algumas listas interessantes, CLIENTES e CONTAS;
 */
public class Agencia {

	private HashMap<String, Cliente> map_cliente = new HashMap<String, Cliente>();
	private HashMap<String, Conta> map_conta = new HashMap<String, Conta>();
	private String numAgencia;
	private String endAgencia;
	private String ufAgencia;
	private String cidadeAgencia;
	private String bairroAgencia;

	public Agencia() {
		
	}
	
	public Agencia(String numAgencia, String uf, String cidade) {
		this.numAgencia = numAgencia;
		this.endAgencia = "";
		this.cidadeAgencia = cidade;
		this.ufAgencia = uf;
		this.bairroAgencia = "";
	}
	

	/**
	 * @return the map_cliente
	 */
	public HashMap<String, Cliente> getMap_cliente() {
		return map_cliente;
	}
	
	/** * */
	public void setClienteAgencia(String cpf, Cliente cliente){
		
		map_cliente.put(cpf, cliente);
	}
	
	public void setContaAgencia(String numConta, Conta conta){
		
		map_conta.put(numConta, conta);
	}

	public Cliente getClienteAgencia(String cpf){
		if (map_cliente.containsKey(cpf)) {
			JOptionPane.showMessageDialog(null, "Cliente encontrado!");
			return map_cliente.get(cpf);
			
		} else {
			JOptionPane.showMessageDialog(null, "Cliente nao encontrada");
		}
		
		return null;
	}
	
	public Conta getContaAgencia(String numConta){
		if (map_conta.containsKey(numConta)) {
			JOptionPane.showMessageDialog(null, "Conta encontrada");
			return map_conta.get(numConta);
		} else {
			JOptionPane.showMessageDialog(null, "Conta nao Encontrada");
		}
		return null;
	}

	/**
	 * @param map_cliente the map_cliente to set
	 */
	public void setMap_cliente(HashMap<String, Cliente> map_cliente) {
		this.map_cliente = map_cliente;
	}



	/**
	 * @return the map_conta
	 */
	public HashMap<String, Conta> getMap_conta() {
		return map_conta;
	}


	/**
	 * @param map_conta the map_conta to set
	 */
	public void setMap_conta(HashMap<String, Conta> map_conta) {
		this.map_conta = map_conta;
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
