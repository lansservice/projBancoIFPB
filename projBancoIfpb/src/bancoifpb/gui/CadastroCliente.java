package bancoifpb.gui;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bancoifpb.Sistema;
import bancoifpb.classes.Agencia;
import bancoifpb.classes.cliente.Cliente;
import bancoifpb.classes.validadores.EstadoJanela;


public class CadastroCliente extends JPanel {

	private static final long serialVersionUID = 1L;
	EstadoJanela estadoJanela = new EstadoJanela();
	/**
	 * 
	 */
    private JTextField txt_nome;
    private JLabel lbl_nome;
    private JLabel lbl_sobrenome;
    private JTextField txt_sobrenome;
    private JLabel lbl_end;
    private JTextField txt_end;
    private JLabel lbl_cpf;
    private JLabel lbl_cidade;
    private JLabel lbl_bairro;
    private JTextField txt_cpf;
    private JTextField txt_bairro;
    private JTextField txt_cidade;
    private JLabel lbl_uf;
    private JLabel lbl_end_num;
    private JTextField txt_end_num;
    private JTextField txt_rg;
    private JLabel lbl_rg;
    private JLabel lbl_fone;
    private JTextField txt_fone;
    private JButton btn_cadastrar;
    private JButton btn_cancelar;
    private JTextField txt_uf;
    private JTextField txt_limite;
    private JLabel lbl_limite;
    private JTextField txt_agencia;
    private JLabel lbl_agencia;
    public CadastroCliente() {

        //construct components
        txt_nome = new JTextField (5);
        lbl_agencia = new JLabel("Agencia");
        txt_end_num = new JTextField (5);
        txt_agencia = new JTextField();
        txt_sobrenome = new JTextField (5);
        txt_end = new JTextField (5);
        txt_bairro = new JTextField (5);
        txt_limite = new JTextField();
        txt_fone = new JTextField (5);
        txt_cpf = new JTextField (0);
        txt_rg = new JTextField (5);
        txt_cidade = new JTextField (5);
        txt_uf = new JTextField (5);
        lbl_sobrenome = new JLabel ("Sobrenome:");
        lbl_end = new JLabel ("Endereço:");
        lbl_cpf = new JLabel ("CPF/CNPJ:");
        lbl_cidade = new JLabel ("Cidade:");
        lbl_bairro = new JLabel ("Bairro:");
        lbl_end_num = new JLabel ("N:");
        lbl_uf = new JLabel ("UF:");
        lbl_rg = new JLabel ("RG / IE:");
        lbl_fone = new JLabel ("Fone:");
        lbl_nome = new JLabel ("Nome:");
        lbl_limite = new JLabel("Limite:");
        btn_cadastrar = new JButton ("Cadastrar");
        btn_cancelar = new JButton ("Cancelar");


        lbl_sobrenome.setToolTipText ("Digite seu sobrenome");
        lbl_end.setToolTipText ("Digite seu endereço");
        lbl_cpf.setToolTipText ("Digite seu cpf");
        lbl_cidade.setToolTipText ("Digite sua Cidade");
        lbl_bairro.setToolTipText ("Digite seu Bairro");
        lbl_nome.setToolTipText ("Digite seu nome");

        //adjust size and set layout
        setPreferredSize (new Dimension(593, 203));
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        setLayout (null);
        
                //set components properties

        //add components
        add (lbl_nome);
        add (lbl_sobrenome);
        add (lbl_end);
        add (lbl_cpf);
        add (lbl_cidade);
        add (lbl_bairro);
        add (lbl_end_num);
        add (lbl_fone);
        add (lbl_limite);
        add(lbl_agencia);
        add (lbl_rg);
        add (lbl_uf);
        add (txt_agencia);
        add (txt_nome);
        add (txt_sobrenome);
        add (txt_end);
        add (txt_cpf);
        add (txt_cidade);
        add (txt_end_num);
        add (txt_bairro);
        add (txt_rg);
        add (txt_fone);
        add (txt_uf);
        add (txt_limite);
        add (btn_cadastrar);
        add (btn_cancelar);
        

        //set component bounds (only needed by Absolute Positioning)
        txt_cidade.setBounds (305, 100, 178, 20);
        txt_rg.setBounds (329, 22, 152, 20);
        txt_uf.setBounds (505, 100, 54, 20);
        txt_nome.setBounds (55, 50, 150, 20);
        txt_cpf.setBounds (78, 22, 210, 20);
        txt_sobrenome.setBounds (282, 50, 235, 20);
        txt_end.setBounds (75, 76, 442, 20);
        txt_bairro.setBounds (55, 100, 200, 20);
        txt_fone.setBounds (50, 127, 170, 20);
        txt_limite.setColumns(10);
        txt_limite.setBounds(282, 127, 86, 20);
        txt_agencia.setBounds(438, 127, 86, 20);
        txt_end_num.setBounds (535, 76, 50, 20);
        lbl_sobrenome.setBounds (210, 46, 72, 25);
        lbl_nome.setBounds (15, 46, 39, 25);
        lbl_end.setBounds (15, 73, 100, 25);
        lbl_cpf.setBounds (15, 20, 63, 25);
        lbl_cidade.setBounds (260, 100, 49, 25);
        lbl_bairro.setBounds (15, 100, 66, 25);
        lbl_uf.setBounds (485, 100, 25, 20);
        lbl_end_num.setBounds (520, 73, 15, 25);
        lbl_fone.setBounds (15, 127, 33, 25);
        lbl_rg.setBounds (291, 20, 42, 25);
        lbl_agencia.setBounds(392, 131, 46, 14);
        lbl_limite.setBounds(246, 131, 46, 14);
        btn_cadastrar.setBounds (371, 175, 100, 20);
        btn_cancelar.setBounds (485, 175, 100, 20);
        txt_agencia.setColumns(10);
    

        /** * Pegando os eventos de cada botao */
        ButtonHandler handler = new ButtonHandler();
        btn_cadastrar.addActionListener(handler);
        btn_cancelar.addActionListener(handler);

    }
    
    
    private class ButtonHandler implements ActionListener {
     	  public void actionPerformed(ActionEvent event){
     		  if (event.getSource()== btn_cadastrar) {
     			  SalvarCliente();
     		  }
     		  
     		  if (event.getSource()== btn_cancelar) {
     			  Cancelar();
     		  }
     	  }
    }
    
    private void SalvarCliente(){

    		Cliente cli = new Cliente();
    	
			cli.setCliNome(txt_nome.getText());
			cli.setCliSobrenome(txt_sobrenome.getText());
			cli.setCpf_cnpj(txt_cpf.getText());
			cli.setRg_ie(txt_rg.getText());
			cli.setCliEnd(txt_end.getText());
			cli.setCliEndNum(txt_end_num.getText());
			cli.setBairro(txt_bairro.getText());
			cli.setCidade(txt_cidade.getText());
			cli.setUf(txt_uf.getText());
			cli.setLimite(txt_limite.getText());
			cli.setAgencia(txt_agencia.getText());
			
			if (Sistema.banco.getMap_agencia().containsKey(txt_agencia.getText()) == true) {
				Sistema.banco.getMap_agencia().get(txt_agencia.getText()).setClienteAgencia(cli.getCpf_cnpj(), cli);
			}else {
				JOptionPane.showMessageDialog(null, "Agencia nao encontrada no Banco, sera Cadastrada uma nova Agencia!");
				Agencia agen = new Agencia(txt_agencia.getText(), txt_uf.getText(), txt_cidade.getText());
				Sistema.banco.setAgenciaMapa(txt_agencia.getText(), agen );
				Sistema.banco.getMap_agencia().get(txt_agencia.getText()).setClienteAgencia(cli.getCpf_cnpj(), cli);
			}
			
 	
	    	JOptionPane.showMessageDialog(null, "Cliente Gravado com Sucesso");
	    	Sistema.frm_cadastro_cliente.getContentPane().removeAll();
	    	Sistema.frm_cadastro_cliente.getContentPane().add(new CadastroCliente());
	    	estadoJanela.JanelaVisibleFalse();
    }
    
    private void Cancelar(){
    	JOptionPane.showMessageDialog(null, "Voce cancelou o cadastro!!");
    	Sistema.frm_cadastro_cliente.getContentPane().removeAll();
    	Sistema.frm_cadastro_cliente.getContentPane().add(new CadastroCliente());
    	estadoJanela.JanelaVisibleFalse();	
    }
}
    

