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
	
	/** * Criando a janela de Cadastro de Conta */
	public static JFrame frm_cadastro_conta = new JFrame("cadastro_conta");

	/** * Criando a janela de pesquisa de Cliente */
	public static JFrame frm_pesquisa_cliente = new JFrame("pesquisa_cliente");
	
	/** * Criando a janela de pesquisa de Conta */
	public static JFrame frm_pesquisa_conta = new JFrame("pesquisa_conta");

	/** * Criando a janela de exclusao de Cliente */
	public static JFrame frm_excluir_cliente = new JFrame("excluir_cliente");
	
	/** * Criando a janela de exclusao de Conta */
	public static JFrame frm_excluir_conta = new JFrame("excluir_conta");

	/** * Criando janelas de operaçoes */
	public static JFrame frm_deposito = new JFrame("deposito");
	public static JFrame frm_saque = new JFrame("saque");
	public static JFrame frm_extrato = new JFrame("extrato");
	public static JFrame frm_saldo = new JFrame("saldo");
	
	/** *Janela para troca de senha*/
   public static JFrame frm_alt_senha = new JFrame("alt_senha");
   public static JFrame frm_salvar_estado = new JFrame("alt_senha");


    //btn_salvar_estado.addActionListener(handler);

	
	/** *Criando o Banco */
	public static Banco banco = new Banco();

	public static void main(String[] args) {
		/** *Preenchendo os valores nos formularios */
		ValoresJanela.frmLogin();
		ValoresJanela.frmMenu();
		ValoresJanela.frmCadastroAgencia();
        ValoresJanela.frmCadastroCliente();
        ValoresJanela.frmPesquisaCliente();
        ValoresJanela.frmExcluirCliente();
        ValoresJanela.frmCadastroConta();
        ValoresJanela.frmDeposito();
        ValoresJanela.frmSaque();
        ValoresJanela.frmExtrato();
        ValoresJanela.frmSaldo();
        ValoresJanela.frmAltSenha();
        
        
        /** *Chamando a janela de Login */
        frm_login.setVisible (true);
	}

}
