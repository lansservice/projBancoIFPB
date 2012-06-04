/**
 * 
 */
package bancoifpb.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bancoifpb.Sistema;
import bancoifpb.classes.Agencia;
import bancoifpb.classes.validadores.EstadoJanela;

public class CadastroAgencia extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn_cadastrar;
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
    EstadoJanela estadoJanela = new EstadoJanela();

	public CadastroAgencia() {

        //construct components
        btn_cadastrar = new JButton ("Cadastrar");
        btn_cancelar = new JButton ("Cancelar");
        lbl_titulo1 = new JLabel ("Digite os Dados da Agencia:");
        lbl_num_agencia = new JLabel ("Numero:");
        lbl_end_agencia = new JLabel ("Endereço:");
        lbl_bairro_agencia = new JLabel ("Bairro:");
        lbl_cidade_agencia = new JLabel ("Cidade:");
        lbl_uf_agencia = new JLabel ("UF:");
        txt_num_agencia = new JTextField (5);
        txt_end_agencia = new JTextField (5);
        txt_bairro_agencia = new JTextField (5);
        txt_cidade_agencia = new JTextField (5);
        txt_uf_agencia = new JTextField(5);

        //adjust size and set layout
        setPreferredSize (new Dimension (577, 131));
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        setLayout (null);

        //add components
        add (btn_cadastrar);
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
        btn_cadastrar.setBounds (330, 105, 100, 20);
        btn_cancelar.setBounds (435, 105, 100, 20);
        lbl_titulo1.setBounds (10, 5, 166, 25);
        lbl_num_agencia.setBounds (10, 30, 52, 25);
        lbl_end_agencia.setBounds (10, 55, 100, 25);
        lbl_bairro_agencia.setBounds (10, 80, 46, 25);
        lbl_cidade_agencia.setBounds (265, 80, 51, 25);
        lbl_uf_agencia.setBounds (485, 80, 24, 25);
        txt_num_agencia.setBounds (65, 32, 100, 20);
        txt_end_agencia.setBounds (70, 56, 500, 20);
        txt_bairro_agencia.setBounds (50, 80, 213, 20);
        txt_cidade_agencia.setBounds (310, 80, 172, 20);
        txt_uf_agencia.setBounds (505, 80, 65, 20);
        
        /** * Pegando os eventos de cada botao */
        ButtonHandler handler = new ButtonHandler();
        btn_cadastrar.addActionListener(handler);
        btn_cancelar.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {
   	  public void actionPerformed(ActionEvent event){
   		  if (event.getSource()== btn_cadastrar) {
   			  SalvarAgencia();
		 }
   		  
   		  if (event.getSource()== btn_cancelar) {
   			  Cancelar();
   		  }
   	  }
    }
    
    /** *Cadastrar Agencia */
    private void SalvarAgencia(){
    	Agencia agencia = new Agencia();
    	
    	agencia.setNumAgencia(txt_num_agencia.getText());
    	agencia.setEndAgencia(txt_end_agencia.getText());
    	agencia.setBairroAgencia(txt_bairro_agencia.getText());
    	agencia.setCidadeAgencia(txt_cidade_agencia.getText());
    	agencia.setUfAgencia(txt_uf_agencia.getText());
    	
    	
    	JOptionPane.showMessageDialog(null, "Cliente Gravado com Sucesso");
    	Sistema.frm_cadastro_agencia.getContentPane().removeAll();
    	Sistema.frm_cadastro_agencia.getContentPane().add(new CadastroAgencia());
    	estadoJanela.JanelaVisibleFalse();
    }
    
    /** *Cancelar Cadastro */
    private void Cancelar(){
    	JOptionPane.showMessageDialog(null, "Cancelada a gravação da Agencia!!");
    	Sistema.frm_cadastro_agencia.getContentPane().removeAll();
    	Sistema.frm_cadastro_agencia.getContentPane().add(new CadastroAgencia());
    	estadoJanela.JanelaVisibleFalse();
    }

}
