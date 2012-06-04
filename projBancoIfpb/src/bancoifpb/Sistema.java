package bancoifpb;

import javax.swing.JFrame;

import bancoifpb.classes.Banco;
import bancoifpb.classes.validadores.ValoresJanela;

public class Sistema {
	
	/** * Criando a janela de Login */
	public static JFrame frm_login = new JFrame ("login");
	
	/** * Criando a janela principal do Sistema */
	public static JFrame frm_menu = new JFrame ("menu");

	/** * Criando a janela de Cadastro de Agencia*/
	public static JFrame frm_cadastro_agencia = new JFrame("cadastro_agencia");

	/** * Criando a janela de Cadastro de Cliente */
	public static JFrame frm_cadastro_cliente = new JFrame("cadastro_cliente");
	
	/** *Criando o Banco */
	public static Banco banco = new Banco();

	public static void main(String[] args) {
		/** *Preenchendo os valores nos formularios */
		ValoresJanela.frmLogin();
		ValoresJanela.frmMenu();
		ValoresJanela.frmCadastroAgencia();
        ValoresJanela.frmCadastroAgencia();
        
        /** *Chamando a janela de Login */
        frm_login.setVisible (true);
	}

}
