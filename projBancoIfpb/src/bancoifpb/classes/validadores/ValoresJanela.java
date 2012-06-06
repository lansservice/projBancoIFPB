package bancoifpb.classes.validadores;

import javax.swing.JFrame;

import bancoifpb.Sistema;
import bancoifpb.gui.CadastroAgencia;
import bancoifpb.gui.CadastroConta;
import bancoifpb.gui.CadastroCliente;
import bancoifpb.gui.CadastroUsuario;
import bancoifpb.gui.Deposito;
import bancoifpb.gui.ExcluirCliente;
import bancoifpb.gui.Extrato;
import bancoifpb.gui.Login;
import bancoifpb.gui.MenuPrincipal;
import bancoifpb.gui.PesquisaCliente;
import bancoifpb.gui.Saldo;
import bancoifpb.gui.Saque;

public class ValoresJanela {
	
	public static void frmLogin(){
        /** *Setando os valores da Janela de login*/        
		Sistema.frm_login.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		Sistema.frm_login.setLocationRelativeTo(null);
		Sistema.frm_login.setTitle("Dados para Login no Banco");
		Sistema.frm_login.getContentPane().add (new Login());
		Sistema.frm_login.pack();
	}
	
	public static void frmMenu(){
		/** *Setando os valores da Janela de Menu*/        
		Sistema.frm_menu.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		Sistema.frm_menu.setLocationRelativeTo(null);
		Sistema.frm_menu.setTitle("Tela Principal");
		Sistema.frm_menu.getContentPane().add (new MenuPrincipal());
		Sistema.frm_menu.pack();
	}
	
	public static void frmCadastroCliente(){
        /** *Setando os valores da Janela de Cadastro de Clientes*/        
        Sistema.frm_cadastro_cliente.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Sistema.frm_cadastro_cliente.setLocationRelativeTo(null);
        Sistema.frm_cadastro_cliente.setTitle("Cadastro de Cliente");
        Sistema.frm_cadastro_cliente.getContentPane().add (new CadastroCliente());
        Sistema.frm_cadastro_cliente.pack();
	}

	public static void frmCadastroAgencia(){
        /** *Setando os valores da Janela de Cadastro de Agencias*/        
        Sistema.frm_cadastro_agencia.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Sistema.frm_cadastro_agencia.setLocationRelativeTo(null);
        Sistema.frm_cadastro_agencia.setTitle("Cadastro de Agencia");
        Sistema.frm_cadastro_agencia.getContentPane().add (new CadastroAgencia());
        Sistema.frm_cadastro_agencia.pack();
	}
	
	public static void frmPesquisaCliente(){
		/** *Setando os valores da Janela de Pesquisa de Clientes*/        
        Sistema.frm_pesquisa_cliente.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Sistema.frm_pesquisa_cliente.setLocationRelativeTo(null);
        Sistema.frm_pesquisa_cliente.setTitle("Pesquisa de Cliente");
        Sistema.frm_pesquisa_cliente.getContentPane().add (new PesquisaCliente());
        Sistema.frm_pesquisa_cliente.pack();
	}
	
	public static void frmExcluirCliente(){
		/** *Setando os valores da Janela de Pesquisa de Clientes*/        
        Sistema.frm_excluir_cliente.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Sistema.frm_excluir_cliente.setLocationRelativeTo(null);
        Sistema.frm_excluir_cliente.setTitle("Excluir Cliente");
        Sistema.frm_excluir_cliente.getContentPane().add (new ExcluirCliente());
        Sistema.frm_excluir_cliente.pack();
	}

	public static void frmCadastroConta() {
		// TODO Auto-generated method stub
		/** *Setando os valores da Janela de Pesquisa de Clientes*/        
        Sistema.frm_cadastro_conta.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Sistema.frm_cadastro_conta.setLocationRelativeTo(null);
        Sistema.frm_cadastro_conta.setTitle("Cadastrar Conta");
        Sistema.frm_cadastro_conta.getContentPane().add (new CadastroConta());
        Sistema.frm_cadastro_conta.pack();
		
	}

	public static void frmDeposito() {
		// TODO Auto-generated method stub
		/** *Setando os valores da Janela de Pesquisa de Clientes*/        
        Sistema.frm_deposito.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Sistema.frm_deposito.setLocationRelativeTo(null);
        Sistema.frm_deposito.setTitle("Deposito");
        Sistema.frm_deposito.getContentPane().add (new Deposito());
        Sistema.frm_deposito.pack();
	}

	public static void frmSaque() {
		// TODO Auto-generated method stub
		/** *Setando os valores da Janela de Pesquisa de Clientes*/        
        Sistema.frm_saque.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Sistema.frm_saque.setLocationRelativeTo(null);
        Sistema.frm_saque.setTitle("Saque");
        Sistema.frm_saque.getContentPane().add (new Saque());
        Sistema.frm_saque.pack();
	}

	public static void frmExtrato() {
		// TODO Auto-generated method stub
		/** *Setando os valores da Janela de Pesquisa de Clientes*/        
        Sistema.frm_extrato.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Sistema.frm_extrato.setLocationRelativeTo(null);
        Sistema.frm_extrato.setTitle("Extrato");
        Sistema.frm_extrato.getContentPane().add (new Extrato());
        Sistema.frm_extrato.pack();
	}

	public static void frmSaldo() {
		// TODO Auto-generated method stub
		/** *Setando os valores da Janela de Pesquisa de Clientes*/        
        Sistema.frm_saldo.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Sistema.frm_saldo.setLocationRelativeTo(null);
        Sistema.frm_saldo.setTitle("Saldo");
        Sistema.frm_saldo.getContentPane().add (new Saldo());
        Sistema.frm_saldo.pack();
	}

	public static void frmAltSenha() {
		// TODO Auto-generated method stub
		/** *Setando os valores da Janela de Pesquisa de Clientes*/        
        Sistema.frm_saldo.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        Sistema.frm_saldo.setLocationRelativeTo(null);
        Sistema.frm_saldo.setTitle("Alterar Senha");
        Sistema.frm_saldo.getContentPane().add (new CadastroUsuario());
        Sistema.frm_saldo.pack();
		
	}
	
}
