package bancoifpb.gui;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bancoifpb.Sistema;

public class Login extends JPanel {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn_login;
    private JLabel lbl_titulo1;
    private JLabel lbl_usuario;
    private JTextField txt_usuario;
    private JLabel lbl_senha;
    private JPasswordField txt_senha;

  public Login() {
      //construct components
      btn_login = new JButton ("Logar");
      lbl_titulo1 = new JLabel ("Digite seus Dados:");
      lbl_usuario = new JLabel ("Usuario:");
      lbl_senha = new JLabel ("Senha:");
      txt_usuario = new JTextField (5);
      txt_senha = new JPasswordField (5);

      //adjust size and set layout
      setPreferredSize (new Dimension(307, 85));
      setLayout (null);

      //add components
      add (btn_login);
      add (lbl_titulo1);
      add (lbl_usuario);
      add (lbl_senha);
      add (txt_usuario);
      add (txt_senha);

      //set component bounds (only needed by Absolute Positioning)
      lbl_titulo1.setBounds (18, 0, 118, 27);
      lbl_usuario.setBounds (18, 26, 50, 20);
      lbl_senha.setBounds (18, 49, 100, 25);
      txt_usuario.setBounds (71, 26, 155, 20);
      txt_senha.setBounds (71, 50, 155, 20);
      btn_login.setBounds (230, 50, 69, 20);
      
      /** * Dando vida ao botao de login*/
      ButtonHandler handler = new ButtonHandler();
      btn_login.addActionListener(handler);
       
  }

  /** * Dando Vida ao Botao de Login*/
  
  private class ButtonHandler implements ActionListener {
	  
	  public void actionPerformed(ActionEvent event){
		  Sistema.frm_menu.setVisible(true);
		  Sistema.frm_login.setVisible(false);
         	        
	  }
	  
  }

}

