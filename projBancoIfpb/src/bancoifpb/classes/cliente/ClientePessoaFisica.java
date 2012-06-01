/**
 * 
 */
package bancoifpb.classes.cliente;

import java.util.Scanner;

/**
 * @author Leonardo Costa Vieira
 * @author Alessandro
 * Declaramos aqui tudo relativo a entidade Cliente.
 */

public class ClientePessoaFisica extends Cliente{

	/**
	 * 
	 */
	private String cpf;
	private double renda;
	
	private Scanner entrada = new Scanner(System.in); 
	public ClientePessoaFisica() {
		// TODO Auto-generated constructor stub
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		while (cpf == null) {
			System.out.println("CPF nao pode ficar em branco, digite novamente");
			cpf = entrada.next();
		}
		this.cpf = cpf;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	
	
}
