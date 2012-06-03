package bancoifpb;

import javax.swing.JFrame;

import bancoifpb.classes.Banco;
import bancoifpb.gui.CadastroAgencia;
import bancoifpb.gui.CadastroCliente;
import bancoifpb.gui.Login;
import bancoifpb.gui.MenuPrincipal;

public class Sistema {
	
	/** * Criando a janela de Login */
	public static JFrame frm_login = new JFrame ("login");
	
	/** * Criando a janela principal do Sistema */
	public static JFrame frm_menu = new JFrame ("menu");

	/** * */
	public static JFrame frm_cadastro_agencia = new JFrame("cadastro_agencia");

	/** * */
	public static JFrame frm_cadastro_cliente = new JFrame("cadastro_cliente");
	
	/** *Criando o Banco */
	public static Banco banco = new Banco();

	public static void main(String[] args) {
        /** *Setando os valores da Janela de login*/        
		frm_login.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frm_login.setTitle("Dados para Login no Banco");
		frm_login.getContentPane().add (new Login());
		frm_login.pack();

		/** *Setando os valores da Janela de Menu*/        
        frm_menu.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frm_menu.setTitle("Tela Principal");
        frm_menu.getContentPane().add (new MenuPrincipal());
        frm_menu.pack();
        
        /** *Setando os valores da Janela de Cadastro de Agencias*/        
        frm_cadastro_agencia.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frm_cadastro_agencia.setTitle("Cadastro de Agencia");
        frm_cadastro_agencia.getContentPane().add (new CadastroAgencia());
        frm_cadastro_agencia.pack();
        
        /** *Setando os valores da Janela de Cadastro de Clientes*/        
        frm_cadastro_cliente.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frm_cadastro_cliente.setTitle("Cadastro de Cliente");
        frm_cadastro_cliente.getContentPane().add (new CadastroCliente());
        frm_cadastro_cliente.pack();
       
        /** *Chamando a janela de Login */
        frm_login.setVisible (true);
	}

}
