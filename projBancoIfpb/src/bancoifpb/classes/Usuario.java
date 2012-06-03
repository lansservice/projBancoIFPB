/**
 * 
 */
package bancoifpb.classes;

/**
 * @author Administrador
 *
 */
public class Usuario {
	
	private String usuario;
	private String senha;
	/**
	 * @param usuario
	 * @param senha
	 */
	public Usuario() {
		super();
		this.usuario = "admin";
		this.senha = "1234567";
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	

}
