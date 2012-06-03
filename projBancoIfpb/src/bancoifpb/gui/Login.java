package bancoifpb.gui;


import java.awt.*;
import javax.swing.*;

public class Login extends JPanel {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton jcomp1;
    private JLabel jcomp2;
    private JLabel lbl_usuario;
    private JTextField txt_usuario;
    private JLabel jcomp5;
    private JPasswordField jcomp6;

  public Login() {
      //construct components
      jcomp1 = new JButton ("Logar");
      jcomp2 = new JLabel ("Digite seus Dados:");
      lbl_usuario = new JLabel ("Usuario:");
      txt_usuario = new JTextField (5);
      jcomp5 = new JLabel ("Senha:");
      jcomp6 = new JPasswordField (5);

      //adjust size and set layout
      setPreferredSize (new Dimension (667, 371));
      setLayout (null);

      //add components
      add (jcomp1);
      add (jcomp2);
      add (lbl_usuario);
      add (txt_usuario);
      add (jcomp5);
      add (jcomp6);

      //set component bounds (only needed by Absolute Positioning)
      jcomp1.setBounds (230, 50, 69, 20);
      jcomp2.setBounds (18, 0, 118, 27);
      lbl_usuario.setBounds (18, 26, 50, 20);
      txt_usuario.setBounds (71, 26, 155, 20);
      jcomp5.setBounds (18, 49, 100, 25);
      jcomp6.setBounds (71, 50, 155, 20);
  }



}

