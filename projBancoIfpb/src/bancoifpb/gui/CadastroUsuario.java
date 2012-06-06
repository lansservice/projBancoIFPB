package bancoifpb.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.JTextField;

import bancoifpb.Sistema;
import bancoifpb.classes.Usuario;
import bancoifpb.classes.validadores.EstadoJanela;
import javax.swing.JFormattedTextField;

public class CadastroUsuario extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EstadoJanela estadoJanela = new EstadoJanela();
	private JButton btn_cadastrar;
    private JLabel lbl_titulo1;
    private JLabel lbl_nome;
    private JTextField txt_nome;
    private JTextField txt_login;
    private JLabel lbl_senha;
    private JButton btn_cancelar;
    private JLabel lbl_login;
    private JFormattedTextField txt_senha;
	public CadastroUsuario() {

		txt_senha = new JFormattedTextField();
        btn_cadastrar = new JButton ("Cadastrar");
        btn_cancelar = new JButton ("Cancelar");
        lbl_titulo1 = new JLabel ("Dados do Usuario:");
        lbl_nome = new JLabel ("Nome Usuario:");
        lbl_login = new JLabel ("Login:");
        lbl_senha = new JLabel ("Senha:");
        txt_nome = new JTextField (5);
        txt_login = new JTextField (5);

        //adjust size and set layout
        setPreferredSize (new Dimension(409, 131));
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        setLayout (null);

        //add components
        add (btn_cadastrar);
        add (lbl_titulo1);
        add (lbl_nome);
        add (lbl_login);
        add (txt_nome);
        add (txt_login);
        add (lbl_senha);
        add (btn_cancelar);
        add(txt_senha);

        //set component bounds (only needed by Absolute Positioning)
        btn_cadastrar.setBounds (151, 100, 100, 20);
        txt_senha.setBounds(48, 57, 116, 20);
        btn_cancelar.setBounds (262, 100, 100, 20);
        lbl_titulo1.setBounds (10, 5, 90, 25);
        lbl_nome.setBounds (10, 30, 90, 25);
        lbl_login.setBounds (260, 30, 65, 25);
        lbl_senha.setBounds (10, 55, 46, 25);
        txt_nome.setBounds (85, 32, 166, 20);
        txt_login.setBounds (291, 32, 108, 20);
        
        txt_senha.setToolTipText("Digite uma senha");
        
        /** * Pegando os eventos de cada botao */
        ButtonHandler handler = new ButtonHandler();
        btn_cadastrar.addActionListener(handler);
        btn_cancelar.addActionListener(handler);

	}
	
    private class ButtonHandler implements ActionListener {
     	  public void actionPerformed(ActionEvent event){
     		  if (event.getSource()== btn_cadastrar) {
     			  SalvarUsuario();
  		 }
     		  
     		  if (event.getSource()== btn_cancelar) {
     			  Cancelar();
     		  }
     	  }
      }

	public void SalvarUsuario() {
		// TODO Auto-generated method stub
		Usuario user = new Usuario();
		
		user.setLogin(txt_login.getText());
		user.setNome(txt_nome.getText());
		user.setSenha(txt_senha.getText());
		
		if (Sistema.banco.getMap_usuario().containsValue(txt_login.getText()) == true) {
			JOptionPane.showMessageDialog(null, "Usuario ja cadastrado os dados serao Atualizados!");
			Sistema.banco.getUsuarioMapa(txt_login.getText()).setNome(txt_nome.getText());
			Sistema.banco.getUsuarioMapa(txt_login.getText()).setSenha(txt_senha.getText());
			Sistema.banco.getUsuarioMapa(txt_login.getText()).setLogin(txt_login.getText());
		}else {
			Sistema.banco.setUsuarioMapa(txt_login.getText(), user);
		}
		
    	JOptionPane.showMessageDialog(null, "Usuario Gravado com Sucesso");
    	Sistema.frm_alt_senha.getContentPane().removeAll();
    	Sistema.frm_alt_senha.getContentPane().add(new CadastroUsuario());
    	estadoJanela.JanelaVisibleFalse();
    	
		
	}

	public void Cancelar() {
		// TODO Auto-generated method stub
		
	}
}
