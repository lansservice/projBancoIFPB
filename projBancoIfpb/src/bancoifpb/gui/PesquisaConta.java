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
import bancoifpb.classes.conta.Conta;
import bancoifpb.classes.validadores.EstadoJanela;


public class PesquisaConta extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EstadoJanela estadoJanela = new EstadoJanela();
	private JTextField txt_conta;
    private JLabel lbl_titulo;
    private JTextArea txt_cliente;
    private JButton btn_pesquisar;
    private JTextField txt_agencia;
    private JLabel lbl_agencia;
    private JButton btn_sair;
    
    public PesquisaConta() {
        //construct components
        lbl_titulo = new JLabel ("Digite a conta:");
        lbl_agencia = new JLabel("Agencia do Cliente:");
        btn_pesquisar = new JButton ("Pesquisar");
        btn_sair = new JButton("Sair");
        txt_cliente = new JTextArea (5, 5);
        txt_conta = new JTextField (5);
        txt_agencia = new JTextField(5);

        //set components properties
        txt_conta.setToolTipText ("Digite a conta");
        txt_cliente.setToolTipText ("Dados do Cliente");
        txt_agencia.setToolTipText("Digite o cpf do cliente");
        btn_pesquisar.setToolTipText ("Clique para pesquisar");

        //adjust size and set layout
        setPreferredSize (new Dimension(399, 333));
        setLayout (null);

        //add components
        add (txt_conta);
        add (txt_agencia);
        add (txt_cliente);
        add(lbl_agencia);
        add (lbl_titulo);
        add (btn_pesquisar);
        add (btn_sair);

        //set component bounds (only needed by Absolute Positioning)
        txt_conta.setBounds (81, 29, 116, 20);
        txt_agencia.setBounds(111, 7, 87, 20);
        txt_cliente.setBounds (5, 65, 384, 260);
        lbl_titulo.setBounds (5, 27, 142, 25);
        lbl_agencia.setBounds(5, 5, 104, 25);
        btn_pesquisar.setBounds (289, 5, 100, 25);
        btn_sair.setBounds(289, 29, 100, 25);
        
        
        ButtonHandler handler = new ButtonHandler();
        btn_pesquisar.addActionListener(handler);
        btn_sair.addActionListener(handler);
        
    }
    
    private class ButtonHandler implements ActionListener {
   	  public void actionPerformed(ActionEvent event){
   		  if (event.getSource()== btn_pesquisar) {
   			  PesquisarContaAgencia();
   			  }
   		  if (event.getSource()== btn_sair) {
   			  Sair();
   			  }
  }
		
    }
    private void PesquisarContaAgencia() {
    	String dados_conta;
    	Agencia agen = new Agencia();
    	Conta conta = new Conta();
    	
    	if (Sistema.banco.getMap_agencia().containsKey(txt_agencia.getText()) == true){
    		if (Sistema.banco.getAgenciaMapa(txt_agencia.getText()).getMap_conta().containsKey(txt_conta.getText()) == true) {
    			agen = Sistema.banco.getMap_agencia().get(txt_agencia.getText());
    			conta = agen.getContaAgencia(txt_conta.getText());
    			dados_conta = "Dados da Conta" + "\n"+
    					"CPF: " + conta.getCpf() + "\n"+
    					"Numero Conta: " + conta.getNumConta() +"\n"+
    					"Agencia: " + conta.getNumAgencia() + "\n"+
    					"Saldo: " + conta.getValorSaldo();
    			
    			txt_cliente.setText(dados_conta);
    		}else {
    			JOptionPane.showMessageDialog(null, "Conta nao Existe na Agencia");
    		}			
    	}else {
    		JOptionPane.showMessageDialog(null, "Conta nao Existe na Agencia");
    	}		
    }
    private void Sair(){
    	Sistema.frm_pesquisa_conta.getContentPane().removeAll();
    	Sistema.frm_pesquisa_conta.getContentPane().add(new PesquisaConta());
    	estadoJanela.JanelaVisibleFalse();
    }
}