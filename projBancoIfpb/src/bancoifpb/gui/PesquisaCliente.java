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
import bancoifpb.classes.cliente.Cliente;
import bancoifpb.classes.validadores.EstadoJanela;


public class PesquisaCliente extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EstadoJanela estadoJanela = new EstadoJanela();
	private JTextField txt_cpf;
    private JLabel lbl_titulo;
    private JTextArea txt_cliente;
    private JButton btn_pesquisar;
    private JTextField txt_agencia;
    private JLabel lbl_agencia;
    private JButton btn_sair;
    
    public PesquisaCliente() {
        //construct components
        lbl_titulo = new JLabel ("Digite o cpf do cliente:");
        lbl_agencia = new JLabel("Agencia do Cliente:");
        btn_pesquisar = new JButton ("Pesquisar");
        btn_sair = new JButton("Sair");
        txt_cliente = new JTextArea (5, 5);
        txt_cpf = new JTextField (5);
        txt_agencia = new JTextField(5);

        //set components properties
        txt_cpf.setToolTipText ("Digite o cpf do cliente");
        txt_cliente.setToolTipText ("Dados do Cliente");
        txt_agencia.setToolTipText("Digite o cpf do cliente");
        btn_pesquisar.setToolTipText ("Clique para pesquisar");

        //adjust size and set layout
        setPreferredSize (new Dimension (479, 333));
        setLayout (null);

        //add components
        add (txt_cpf);
        add (txt_agencia);
        add (txt_cliente);
        add(lbl_agencia);
        add (lbl_titulo);
        add (btn_pesquisar);
        add (btn_sair);

        //set component bounds (only needed by Absolute Positioning)
        txt_cpf.setBounds (121, 29, 180, 20);
        txt_agencia.setBounds(111, 7, 87, 20);
        txt_cliente.setBounds (5, 65, 470, 260);
        lbl_titulo.setBounds (5, 27, 142, 25);
        lbl_agencia.setBounds(5, 5, 104, 25);
        btn_pesquisar.setBounds (369, 5, 100, 25);
        btn_sair.setBounds(369, 31, 100, 25);
        
        
        ButtonHandler handler = new ButtonHandler();
        btn_pesquisar.addActionListener(handler);
        btn_sair.addActionListener(handler);
        
    }
    
    private class ButtonHandler implements ActionListener {
   	  public void actionPerformed(ActionEvent event){
   		  if (event.getSource()== btn_pesquisar) {
   			  PesquisarClienteAgencia();
   			  }
   		  if (event.getSource()== btn_sair) {
   			  Sair();
   			  }
  }
		
    }
    private void PesquisarClienteAgencia() {
    	String dados_cliente;
    	Agencia agen = new Agencia();
    	Cliente cli = new Cliente();
    	
    	if (Sistema.banco.getMap_agencia().containsKey(txt_agencia.getText()) == true){
    		if (Sistema.banco.getAgenciaMapa(txt_agencia.getText()).getMap_cliente().containsKey(txt_cpf.getText()) == true) {
    			agen = Sistema.banco.getMap_agencia().get(txt_agencia.getText());
    			cli = agen.getClienteAgencia(txt_cpf.getText());
    			dados_cliente = "Dados do Cliente" + "\n"+
    					"CPF: " + cli.getCpf_cnpj() + "\n"+
    					"Nome: " + cli.getCliNome() +"\n"+
    					"Agencia: " + cli.getAgencia() + "\n"+
    					"Limite: " + cli.getLimite();
    			
    			txt_cliente.setText(dados_cliente);
    		}else {
    			JOptionPane.showMessageDialog(null, "Cliente nao Existe na Agencia");
    		}			
    	}else {
    		JOptionPane.showMessageDialog(null, "Cliente nao Existe na Agencia");
    	}		
    }
    private void Sair(){
    	Sistema.frm_pesquisa_cliente.getContentPane().removeAll();
    	Sistema.frm_pesquisa_cliente.getContentPane().add(new PesquisaCliente());
    	estadoJanela.JanelaVisibleFalse();
    }
}