package bancoifpb.gui;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bancoifpb.Sistema;
import bancoifpb.classes.validadores.EstadoJanela;
public class ExcluirConta extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private EstadoJanela estadoJanela = new EstadoJanela();
	private JTextField txt_num_conta;
    private JLabel lbl_num_conta;
    private JButton btn_excluir;
    private JTextField txt_agencia;
    private JLabel lbl_agencia;
    private JButton btn_sair;


	public ExcluirConta(){
        //construct components
        lbl_num_conta = new JLabel ("Digite o cpf do cliente:");
        lbl_agencia = new JLabel("Agencia da Conta:");
        btn_excluir = new JButton ("Excluir");
        btn_sair = new JButton("Sair");
        txt_num_conta = new JTextField (5);
        txt_agencia = new JTextField(5);

        //set components properties
        txt_num_conta.setToolTipText ("Digite o cpf do cliente");
        txt_agencia.setToolTipText("Digite o cpf do cliente");
        btn_excluir.setToolTipText ("Clique para pesquisar");

        //adjust size and set layout
        setPreferredSize (new Dimension(479, 63));
        setLayout (null);

        //add components
        add (txt_num_conta);
        add (txt_agencia);
        add(lbl_agencia);
        add (lbl_num_conta);
        add (btn_excluir);
        add (btn_sair);

        //set component bounds (only needed by Absolute Positioning)
        txt_num_conta.setBounds (121, 29, 180, 20);
        txt_agencia.setBounds(111, 7, 87, 20);
        lbl_num_conta.setBounds (5, 27, 142, 25);
        lbl_agencia.setBounds(5, 5, 104, 25);
        btn_excluir.setBounds (369, 5, 100, 25);
        btn_sair.setBounds(369, 31, 100, 25);
        
        
        ButtonHandler handler = new ButtonHandler();
        btn_excluir.addActionListener(handler);
        btn_sair.addActionListener(handler);
		
	}
	
    private class ButtonHandler implements ActionListener {
     	  public void actionPerformed(ActionEvent event){
     		  if (event.getSource()== btn_excluir) {
     			  ExcluirContaAgencia();
     			  }
     		  if (event.getSource()== btn_sair) {
     			  Sair();
     			  }
    }
  		
      }
      private void ExcluirContaAgencia() {
      	
      	if (Sistema.banco.getMap_agencia().containsKey(txt_agencia.getText()) == true){
      		if (Sistema.banco.getAgenciaMapa(txt_agencia.getText()).getMap_conta().containsKey(txt_num_conta.getText()) == true) {
      			Sistema.banco.getAgenciaMapa(txt_agencia.getText()).getMap_conta().remove(txt_num_conta.getText());
      			}else {
      			JOptionPane.showMessageDialog(null, "Conta nao Existe na Agencia");
      		}			
      	}else {
      		JOptionPane.showMessageDialog(null, "Conta nao Existe na Agencia");
      	}		
      }
      
      private void Sair(){
      	Sistema.frm_excluir_conta.getContentPane().removeAll();
      	Sistema.frm_excluir_conta.getContentPane().add(new ExcluirConta());
      	estadoJanela.JanelaVisibleFalse();
      }
	

}
