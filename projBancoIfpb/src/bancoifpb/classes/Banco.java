/**
 * 
 */
package bancoifpb.classes;

import java.util.HashMap;

import javax.swing.JOptionPane;


/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 * Nesta Classe temos algumas listas interessantes, com agencias e usuarios;
 */
public class Banco {
	

	private HashMap<String, Agencia> map_agencia = new HashMap< String, Agencia>();
	private HashMap<String, Usuario> map_usuario = new HashMap<String, Usuario>();

	/**
	 * 
	 * 
	 */
	public Banco() {
		

	}
	
	/**
	 * @return the map_agencia
	 */
	public HashMap<String, Agencia> getMap_agencia() {
		return map_agencia;
	}
	/**
	 * @param map_agencia the map_agencia to set
	 */
	public void setMap_agencia(HashMap<String, Agencia> map_agencia) {
		this.map_agencia = map_agencia;
	}

	
	/**
	 * @return the map_usuario
	 */
	public HashMap<String, Usuario> getMap_usuario() {
		return map_usuario;
	}

	/**
	 * @param map_usuario the map_usuario to set
	 */
	public void setMap_usuario(HashMap<String, Usuario> map_usuario) {
		this.map_usuario = map_usuario;
	}

	public Agencia getAgenciaMapa(String numAgencia){

		if (map_agencia.containsKey(numAgencia)) {
			JOptionPane.showMessageDialog(null, "Agencia encontrada!");
			return map_agencia.get(numAgencia);
			
		} else {
			JOptionPane.showMessageDialog(null, "Agencia nao encontrada");
		}
		
		return null;
	}
	
	public void setAgenciaMapa(String numAgencia, Agencia agencia){
		
		map_agencia.put(numAgencia, agencia);
	}
	
	
}
