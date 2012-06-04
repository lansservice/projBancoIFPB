package bancoifpb.classes.validadores;

import javax.swing.JFrame;

import bancoifpb.Sistema;
import bancoifpb.gui.CadastroAgencia;
import bancoifpb.gui.CadastroCliente;
import bancoifpb.gui.Login;
import bancoifpb.gui.MenuPrincipal;

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
	
}
