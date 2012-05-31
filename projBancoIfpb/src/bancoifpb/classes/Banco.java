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

	/**
	 * 
	 */
	public Banco() {
		agencia = new ArrayList<Agencia>();
		// TODO Auto-generated constructor stub
	}

	public List<Agencia> getAgencia() {
		return agencia;
	}

	public void setAgencia(List<Agencia> agencia) {
		this.agencia = agencia;
	}

}
