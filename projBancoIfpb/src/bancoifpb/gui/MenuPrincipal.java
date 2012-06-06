package bancoifpb.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


import bancoifpb.Sistema;
import bancoifpb.classes.validadores.EstadoJanela;


public class MenuPrincipal extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EstadoJanela estadoJanela = new EstadoJanela();
	
    private JButton btn_cad_agencia;
    private JButton btn_cad_cliente;
    private JButton btn_pesq_cli;
    private JButton btn_exc_cli;
    private JButton btn_cad_conta;
    private JButton btn_exc_cont;
    private JButton btn_pesq_cont;
    private JButton btn_saldo;
    private JButton btn_extrato;
    private JButton btn_deposito;
    private JButton btn_saque;
    private JButton btn_alt_senha;
    private JButton btn_salvar_estado;
    private JButton btn_sair;
    
 
    public MenuPrincipal() {
        //construct components
        btn_cad_agencia = new JButton ("Cadastrar Agencia");
        btn_cad_cliente = new JButton ("Cadastrar Cliente na Agencia");
        btn_pesq_cli = new JButton ("Pesquisar Cliente na Agencia");
        btn_exc_cli = new JButton ("Excluir Cliente da Agencia");
        btn_cad_conta = new JButton ("Cadastrar Conta na Agencia");
        btn_exc_cont = new JButton ("Excluir Conta na Agencia");
        btn_pesq_cont = new JButton ("Pesquisar Conta na Agencia");
        btn_saldo = new JButton ("Saldo Simples");
        btn_extrato = new JButton ("Extrato Detalhado");
        btn_deposito = new JButton ("Deposito em Conta");
        btn_saque = new JButton ("Saque em Conta");
        btn_alt_senha = new JButton ("Alterar Senha");
        btn_salvar_estado = new JButton ("Salvar Estado do Sistema");
        btn_sair = new JButton ("Sair do Sistema");

        //adjust size and set layout
        setPreferredSize (new Dimension(551, 293));
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        setLayout(null);

        
        //add components
        add (btn_cad_agencia);
        add (btn_cad_cliente);
        add (btn_pesq_cli);
        add (btn_exc_cli);
        add (btn_cad_conta);
        add (btn_exc_cont);
        add (btn_pesq_cont);
        add (btn_saldo);
        add (btn_extrato);
        add (btn_deposito);
        add (btn_saque);
        add (btn_alt_senha);
        add (btn_salvar_estado);
        add (btn_sair);

        //set component bounds (only needed by Absolute Positioning)
        btn_cad_agencia.setBounds (30, 40, 237, 25);
        btn_cad_cliente.setBounds (30, 75, 237, 25);
        btn_pesq_cli.setBounds (30, 110, 237, 25);
        btn_exc_cli.setBounds (30, 145, 237, 25);
        btn_cad_conta.setBounds (30, 180, 237, 25);
        btn_exc_cont.setBounds (30, 215, 237, 25);
        btn_pesq_cont.setBounds (30, 250, 237, 25);
        btn_saldo.setBounds (306, 40, 237, 25);
        btn_extrato.setBounds (306, 75, 237, 25);
        btn_deposito.setBounds (306, 110, 237, 25);
        btn_saque.setBounds (306, 145, 237, 25);
        btn_alt_senha.setBounds (306, 180, 237, 25);
        btn_salvar_estado.setBounds (306, 215, 237, 25);
        btn_sair.setBounds (306, 250, 237, 25);

        /** * Dando vida aos botoes do Sistema */
        ButtonHandler handler = new ButtonHandler();
        btn_alt_senha.addActionListener(handler);
        btn_cad_agencia.addActionListener(handler);
        btn_cad_cliente.addActionListener(handler);
        btn_cad_conta.addActionListener(handler);
        btn_deposito.addActionListener(handler);
        btn_extrato.addActionListener(handler);
        btn_exc_cli.addActionListener(handler);
        btn_exc_cont.addActionListener(handler);
        btn_pesq_cli.addActionListener(handler);
        btn_pesq_cont.addActionListener(handler);
        btn_sair.addActionListener(handler);
        btn_saldo.addActionListener(handler);
        btn_salvar_estado.addActionListener(handler);
        btn_saque.addActionListener(handler);
        
        
    }
    
    private class ButtonHandler implements ActionListener {
   	  public void actionPerformed(ActionEvent event){
   		  
  		 if (event.getSource()== btn_cad_agencia) {
  			 estadoJanela.JanelaVisibleFalse();
  			 Sistema.frm_cadastro_agencia.setVisible(true);
		}else if (event.getSource() == btn_cad_cliente) {
			estadoJanela.JanelaVisibleFalse();
			 Sistema.frm_cadastro_cliente.setVisible(true);
		}else if (event.getSource() == btn_cad_conta) {
			estadoJanela.JanelaVisibleFalse();
			 Sistema.frm_cadastro_conta.setVisible(true);
		}else if (event.getSource() == btn_deposito) {
			estadoJanela.JanelaVisibleFalse();
			 Sistema.frm_deposito.setVisible(true);
		}else if (event.getSource() == btn_extrato) {
			estadoJanela.JanelaVisibleFalse();
			 Sistema.frm_extrato.setVisible(true);
		}else if (event.getSource() == btn_exc_cli){
			estadoJanela.JanelaVisibleFalse();
			Sistema.frm_excluir_cliente.setVisible(true);
		}else if (event.getSource() == btn_exc_cont){
			estadoJanela.JanelaVisibleFalse();
			Sistema.frm_excluir_conta.setVisible(true);
		}else if (event.getSource() == btn_pesq_cli) {
			estadoJanela.JanelaVisibleFalse();
			Sistema.frm_pesquisa_cliente.setVisible(true);
		}else if (event.getSource() == btn_pesq_cont) {
			estadoJanela.JanelaVisibleFalse();
			Sistema.frm_pesquisa_conta.setVisible(true);
		}else if (event.getSource() == btn_alt_senha){
			estadoJanela.JanelaVisibleFalse();
			Sistema.frm_alt_senha.setVisible(true);
		}else if (event.getSource() == btn_saldo){
			estadoJanela.JanelaVisibleFalse();
			Sistema.frm_saldo.setVisible(true);
		}else if (event.getSource() == btn_saque){
			estadoJanela.JanelaVisibleFalse();
			Sistema.frm_saque.setVisible(true);
		}else if (event.getSource() == btn_salvar_estado){
			estadoJanela.JanelaVisibleFalse();
			Sistema.frm_salvar_estado.setVisible(true);
		}else if (event.getSource() == btn_sair) {
			JOptionPane.showMessageDialog(null, "Sistema Funcionando");			
			
		}
  	  }
    }
    

}