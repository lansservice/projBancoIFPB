/**
 * 
 */
package bancoifpb.gui;

import java.awt.*;
import javax.swing.*;

public class CadastroAgencia extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton brn_cadastrar;
    private JLabel lbl_titulo1;
    private JLabel lbl_num_agencia;
    private JLabel lbl_end_agencia;
    private JTextField txt_num_agencia;
    private JTextField txt_end_agencia;
    private JLabel lbl_bairro_agencia;
    private JLabel lbl_cidade_agencia;
    private JLabel lbl_uf_agencia;
    private JTextField txt_bairro_agencia;
    private JTextField txt_cidade_agencia;
	private JTextField txt_uf_agencia;
    private JButton btn_cancelar;


	public CadastroAgencia() {

        //construct components
        brn_cadastrar = new JButton ("Cadastrar");
        lbl_titulo1 = new JLabel ("Digite os Dados da Agencia:");
        lbl_num_agencia = new JLabel ("Numero:");
        lbl_end_agencia = new JLabel ("Endereço:");
        txt_num_agencia = new JTextField (5);
        txt_end_agencia = new JTextField (5);
        lbl_bairro_agencia = new JLabel ("Bairro:");
        lbl_cidade_agencia = new JLabel ("Cidade:");
        lbl_uf_agencia = new JLabel ("UF:");
        txt_bairro_agencia = new JTextField (5);
        txt_cidade_agencia = new JTextField (5);
        txt_uf_agencia = new JTextField(5);
        btn_cancelar = new JButton ("Cancelar");

        //adjust size and set layout
        setPreferredSize (new Dimension (577, 131));
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        setLayout (null);

        //add components
        add (brn_cadastrar);
        add (lbl_titulo1);
        add (lbl_num_agencia);
        add (lbl_end_agencia);
        add (txt_num_agencia);
        add (txt_end_agencia);
        add (lbl_bairro_agencia);
        add (lbl_cidade_agencia);
        add (lbl_uf_agencia);
        add (txt_bairro_agencia);
        add (txt_cidade_agencia);
        add (txt_uf_agencia);
        add (btn_cancelar);

        //set component bounds (only needed by Absolute Positioning)
        brn_cadastrar.setBounds (330, 105, 100, 20);
        lbl_titulo1.setBounds (10, 5, 166, 25);
        lbl_num_agencia.setBounds (10, 30, 52, 25);
        lbl_end_agencia.setBounds (10, 55, 100, 25);
        txt_num_agencia.setBounds (65, 32, 100, 20);
        txt_end_agencia.setBounds (70, 56, 500, 20);
        lbl_bairro_agencia.setBounds (10, 80, 46, 25);
        lbl_cidade_agencia.setBounds (265, 80, 51, 25);
        lbl_uf_agencia.setBounds (485, 80, 24, 25);
        txt_bairro_agencia.setBounds (50, 80, 213, 20);
        txt_cidade_agencia.setBounds (310, 80, 172, 20);
        txt_uf_agencia.setBounds (505, 80, 65, 20);
        btn_cancelar.setBounds (435, 105, 100, 20);
    }


}
