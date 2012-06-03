import javax.swing.JFrame;

import bancoifpb.gui.Login;


public class Main {


	public static void main(String[] args) {
	      JFrame frame = new JFrame ("Login");
	      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	      frame.getContentPane().add (new Login());
	      frame.pack();
	      frame.setVisible (true);

	}

}
