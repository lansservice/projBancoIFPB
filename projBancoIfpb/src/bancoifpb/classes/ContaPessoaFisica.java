/**
 * 
 */
package bancoifpb.classes;

/**
 * @author Administrador
 *
 */
public class ContaPessoaFisica extends Conta {
	/**
	 * 
	 */
	private String numCPF;
	
	
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

}
