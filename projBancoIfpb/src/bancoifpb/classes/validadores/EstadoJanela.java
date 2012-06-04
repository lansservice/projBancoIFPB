/**
 * 
 */
package bancoifpb.classes.validadores;

import bancoifpb.Sistema;

/**
 * @author 
 *
 */
public class EstadoJanela {

	public void JanelaVisibleFalse(){
		Sistema.frm_menu.setVisible(true);
		Sistema.frm_cadastro_agencia.setVisible(false);
		Sistema.frm_cadastro_cliente.setVisible(false);
	}

}
