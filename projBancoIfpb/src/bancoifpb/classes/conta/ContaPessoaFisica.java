/**
 * 
 */
package bancoifpb.classes.conta;

/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 * Declaramos aqui tudo relativo a entidade Conta Pessoa Fisica
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
