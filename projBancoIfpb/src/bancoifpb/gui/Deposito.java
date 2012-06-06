package bancoifpb.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.*;

import bancoifpb.Sistema;
import bancoifpb.classes.validadores.EstadoJanela;
import bancoifpb.classes.conta.*;


public class Deposito extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EstadoJanela estadoJanela = new EstadoJanela();
	private JTextField txt_conta;
    private JLabel lbl_titulo;
    private JButton btn_gravar;
    private JTextField txt_agencia;
    private JLabel lbl_agencia;
    private JButton btn_sair;
    private JLabel lbl_valor;
    private JTextField txt_valor;
    
    public Deposito() {
        //construct components
        lbl_titulo = new JLabel ("Digite a conta:");
        lbl_agencia = new JLabel("Agencia do Cliente:");
        btn_gravar = new JButton ("Gravar");
        btn_sair = new JButton("Sair");
        txt_conta = new JTextField (5);
        txt_agencia = new JTextField(5);

        //set components properties
        txt_conta.setToolTipText ("Digite a conta");
        txt_agencia.setToolTipText("Digite o cpf do cliente");
        btn_gravar.setToolTipText ("Clique para pesquisar");

        //adjust size and set layout
        setPreferredSize (new Dimension(318, 91));
        setLayout (null);

        //add components
        add (txt_conta);
        add (txt_agencia);
        add(lbl_agencia);
        add (lbl_titulo);
        add (btn_gravar);
        add (btn_sair);

        //set component bounds (only needed by Absolute Positioning)
        txt_conta.setBounds (81, 29, 116, 20);
        txt_agencia.setBounds(111, 7, 87, 20);
        lbl_titulo.setBounds (5, 27, 142, 25);
        lbl_agencia.setBounds(5, 5, 104, 25);
        btn_gravar.setBounds (207, 5, 100, 25);
        btn_sair.setBounds(207, 38, 100, 25);
        
        lbl_valor = new JLabel("Valor Deposito:");
        lbl_valor.setBounds(5, 53, 142, 25);
        add(lbl_valor);
        
        txt_valor = new JTextField(5);
        txt_valor.setToolTipText("Digite o valor do deposito");
        txt_valor.setBounds(81, 55, 116, 20);
        add(txt_valor);
        
        
        ButtonHandler handler = new ButtonHandler();
        btn_gravar.addActionListener(handler);
        btn_sair.addActionListener(handler);
        
    }
    
    private class ButtonHandler implements ActionListener {
   	  public void actionPerformed(ActionEvent event){
   		  if (event.getSource()== btn_gravar) {
   			  PesquisarSaldoConta();
   			  }
   		  if (event.getSource()== btn_sair) {
   			  Sair();
   			  }
  }
		
    }
    private void PesquisarSaldoConta() {
 
    	ExtratoClasse extra = new ExtratoClasse();
    	BigDecimal valD = new BigDecimal(txt_valor.getText());
    	BigDecimal valS = new BigDecimal(0.0);
    	BigDecimal valI = new BigDecimal(0.0);
    	extra.setNumAgencia(txt_agencia.getText());
    	extra.setNumConta(txt_conta.getText());
    	extra.setValorDeposito(valD);
    	extra.setValorSaque(valS);
    	extra.setValorIOF(valI);

    	    	
    	if (Sistema.banco.getMap_agencia().containsKey(txt_agencia.getText()) == true){
    		if (Sistema.banco.getAgenciaMapa(txt_agencia.getText()).getMap_conta().containsKey(txt_conta.getText()) == true) {
    			Sistema.banco.getMap_agencia().get(txt_agencia.getText()).getMap_conta().get(txt_agencia.getText()).getMap_extrato().put(txt_conta.getText(), extra );
    			Sistema.banco.getMap_agencia().get(txt_agencia.getText()).getMap_conta().get(txt_agencia.getText()).getValorSaldo().add(valD);
 
    		}else {
    			JOptionPane.showMessageDialog(null, "Conta nao Existe na Agencia");
    		}			
    	}else {
    		JOptionPane.showMessageDialog(null, "Conta nao Existe na Agencia");
    	}		
    }
    private void Sair(){
    	Sistema.frm_deposito.getContentPane().removeAll();
    	Sistema.frm_deposito.getContentPane().add(new Deposito());
    	estadoJanela.JanelaVisibleFalse();
    }
}