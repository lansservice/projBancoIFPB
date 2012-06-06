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
		Sistema.frm_alt_senha.setVisible(false);
		Sistema.frm_cadastro_agencia.setVisible(false);
		Sistema.frm_cadastro_cliente.setVisible(false);
		Sistema.frm_cadastro_conta.setVisible(false);
		Sistema.frm_pesquisa_conta.setVisible(false);
		Sistema.frm_pesquisa_cliente.setVisible(false);
		Sistema.frm_deposito.setVisible(false);
		Sistema.frm_excluir_conta.setVisible(false);
		Sistema.frm_excluir_cliente.setVisible(false);
		Sistema.frm_extrato.setVisible(false);
		Sistema.frm_saldo.setVisible(false);
		Sistema.frm_saque.setVisible(false);
		Sistema.frm_salvar_estado.setVisible(false);

	}

}
