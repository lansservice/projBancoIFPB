package bancoifpb.gui;

import java.awt.*;
import javax.swing.*;

public class MenuPrincipal extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn_cad_agencia;
    private JButton btn_cad_cliente;
    private JButton jcomp3;
    private JButton jcomp4;
    private JButton btn_cad_conta;

    public MenuPrincipal() {
        //construct components
        btn_cad_agencia = new JButton ("Cadastrar Agencia");
        btn_cad_cliente = new JButton ("Cadastrar Cliente na Agencia");
        jcomp3 = new JButton ("Pesquisar Cliente na Agencia");
        jcomp4 = new JButton ("Excluir Cliente da Agencia");
        btn_cad_conta = new JButton ("Cadastrar Conta na Agencia");

        //adjust size and set layout
        setPreferredSize (new Dimension (667, 371));
        setLayout (null);

        //add components
        add (btn_cad_agencia);
        add (btn_cad_cliente);
        add (jcomp3);
        add (jcomp4);
        add (btn_cad_conta);

        //set component bounds (only needed by Absolute Positioning)
        btn_cad_agencia.setBounds (30, 40, 237, 25);
        btn_cad_cliente.setBounds (30, 75, 237, 25);
        jcomp3.setBounds (30, 110, 237, 25);
        jcomp4.setBounds (30, 145, 237, 25);
        btn_cad_conta.setBounds (30, 180, 237, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MenuPrincipal");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MenuPrincipal());
        frame.pack();
        frame.setVisible (true);
    }
}