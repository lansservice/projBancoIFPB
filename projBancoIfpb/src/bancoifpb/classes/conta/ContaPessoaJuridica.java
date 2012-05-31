/**
 * 
 */
package bancoifpb.classes.conta;

/**
 * @author Administrador
 *
 */
public class ContaPessoaJuridica extends Conta {
	private String numCNPJ;
	
	public String getNumCNPJ() {
		return numCNPJ;
	}


	public Boolean setNumCNPJ(String numCNPJ) {
		if (numCNPJ!= null && numCNPJ.length()<19) {
			this.numCNPJ = numCNPJ;
			return true;
		}else {
			return false;
		}
	}
	
}
