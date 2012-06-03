/**
 * 
 */
package bancoifpb.classes;

import java.util.ArrayList;
import java.util.List;



/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 */
public class Banco {

	private List<Agencia> agencia;
	private List<Usuario> usuario;
	/**
	 * 
	 */
	public Banco() {
		agencia = new ArrayList<Agencia>();
		usuario = new ArrayList<Usuario>();

	}

	public List<Agencia> getAgencia() {
		return agencia;
	}

	public void setAgencia(List<Agencia> agencia) {
		this.agencia = agencia;

	}

	/**
	 * @return the usuario
	 */
	public List<Usuario> getUsuario() {
		return usuario;

	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;

	}
	
	
}
