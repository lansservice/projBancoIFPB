package bancoifpb.gui;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bancoifpb.Sistema;
import bancoifpb.classes.cliente.ClientePessoaFisica;
import bancoifpb.classes.cliente.ClientePessoaJuridica;


public class CadastroCliente extends JPanel {

	private static final long serialVersionUID = 1L;
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
    private JRadioButton rdo_pf;
    private JRadioButton rdo_pj;
    private JLabel lbl_end_num;
    private JTextField txt_end_num;
    private JTextField txt_rg;
    private JLabel lbl_rg;
    private JLabel lbl_fone;
    private JTextField txt_fone;
    private JButton btn_cadastrar;
    private JButton btn_cancelar;
    private JTextField txt_uf;
    private JLabel lbl_razao_social;
    private JTextField txt_razao_social;
    private ButtonGroup rd_pessoa;
    private JTextField txt_limite;
    private JLabel lbl_limite;

    public CadastroCliente() {

        //construct components
        txt_nome = new JTextField (5);
        lbl_sobrenome = new JLabel ("Sobrenome:");
        txt_sobrenome = new JTextField (5);
        lbl_end = new JLabel ("Endereço:");
        txt_end = new JTextField (5);
        lbl_cpf = new JLabel ("CPF/CNPJ:");
        lbl_cidade = new JLabel ("Cidade:");
        lbl_bairro = new JLabel ("Bairro:");
        txt_bairro = new JTextField (5);
        lbl_uf = new JLabel ("UF:");
        rdo_pf = new JRadioButton ("Pessoa Fisica" , true);
        rdo_pj = new JRadioButton ("Pessoa Juridica" , false);
        lbl_end_num = new JLabel ("N:");
        txt_end_num = new JTextField (5);
        lbl_rg = new JLabel ("RG / IE:");
        lbl_fone = new JLabel ("Fone:");
        txt_fone = new JTextField (5);
        btn_cadastrar = new JButton ("Cadastrar");
        btn_cancelar = new JButton ("Cancelar");
        lbl_razao_social = new JLabel ("Razao Social:");
        txt_razao_social = new JTextField (5);
        lbl_nome = new JLabel ("Nome:");
        lbl_limite = new JLabel("Limite:");
        txt_limite = new JTextField();


        lbl_sobrenome.setToolTipText ("Digite seu sobrenome");
        lbl_end.setToolTipText ("Digite seu endereço");
        lbl_cpf.setToolTipText ("Digite seu cpf");
        lbl_cidade.setToolTipText ("Digite sua Cidade");
        lbl_bairro.setToolTipText ("Digite seu Bairro");

        //adjust size and set layout
        setPreferredSize (new Dimension (593, 205));
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        setLayout (null);
        
                //set components properties
                lbl_nome.setToolTipText ("Digite seu nome");
                add (lbl_nome);
                lbl_nome.setBounds (15, 68, 39, 25);

        //add components
        add (txt_nome);
        add (lbl_sobrenome);
        add (txt_sobrenome);
        add (lbl_end);
        add (txt_end);
        add (lbl_cpf);
        txt_cpf = new JTextField (0);
        add (txt_cpf);
        txt_cpf.setBounds (78, 22, 210, 20);
        add (lbl_cidade);
        txt_cidade = new JTextField (5);
        add (txt_cidade);
        txt_cidade.setBounds (305, 123, 178, 20);
        add (lbl_bairro);
        add (txt_bairro);
        txt_uf = new JTextField (5);
        add (txt_uf);
        txt_uf.setBounds (505, 123, 54, 20);
        add (lbl_uf);
        add (rdo_pf);
        add (rdo_pj);
        add (lbl_end_num);
        add (txt_end_num);
        add (lbl_rg);
        txt_rg = new JTextField (5);
        add (txt_rg);
        txt_rg.setBounds (329, 22, 152, 20);
        add (lbl_fone);
        add (txt_fone);
        add (btn_cadastrar);
        add (btn_cancelar);
        add (lbl_razao_social);
        add (txt_razao_social);
        add(txt_limite);
        add(lbl_limite);
        

        //set component bounds (only needed by Absolute Positioning)
        txt_nome.setBounds (55, 72, 150, 20);
        lbl_sobrenome.setBounds (210, 68, 72, 25);
        txt_sobrenome.setBounds (282, 72, 235, 20);
        lbl_end.setBounds (15, 95, 100, 25);
        txt_end.setBounds (75, 98, 442, 20);
        lbl_cpf.setBounds (15, 20, 63, 25);
        lbl_cidade.setBounds (260, 123, 49, 25);
        lbl_bairro.setBounds (15, 123, 66, 25);
        txt_bairro.setBounds (55, 123, 200, 20);
        lbl_uf.setBounds (485, 123, 25, 20);
        rdo_pf.setBounds (10, 0, 159, 25);
        rdo_pj.setBounds (170, 0, 125, 25);
        lbl_end_num.setBounds (520, 95, 15, 25);
        txt_end_num.setBounds (535, 98, 50, 20);
        lbl_rg.setBounds (291, 20, 42, 25);
        lbl_fone.setBounds (15, 150, 33, 25);
        txt_fone.setBounds (50, 150, 170, 20);
        btn_cadastrar.setBounds (375, 170, 100, 20);
        btn_cancelar.setBounds (485, 170, 100, 20);
        lbl_razao_social.setBounds (15, 43, 79, 25);
        txt_razao_social.setBounds (93, 46, 400, 20);
        txt_limite.setBounds(282, 150, 86, 20);
        lbl_limite.setBounds(246, 154, 46, 14);
        txt_limite.setColumns(10);
        
        /** *propriedade do RadioButton */
        
        rd_pessoa = new ButtonGroup();
        rd_pessoa.add(rdo_pf);
        rd_pessoa.add(rdo_pj);
        
        
        
        ButtonHandler handler = new ButtonHandler();
        btn_cadastrar.addActionListener(handler);
        btn_cancelar.addActionListener(handler);
   
 
    }
    
    
    private class ButtonHandler implements ActionListener {
     	  public void actionPerformed(ActionEvent event){
     		  if (event.getSource()== btn_cadastrar) {
     			  SalvarCliente();
     			  Sistema.frm_menu.setVisible(true);
     			  Sistema.frm_cadastro_agencia.setVisible(false);
				Sistema.frm_cadastro_cliente.setVisible(false);
			
     		  }
     		  
     		  if (event.getSource()== btn_cadastrar) {
     			Sistema.frm_menu.setVisible(true);
     			Sistema.frm_cadastro_agencia.setVisible(false);
				Sistema.frm_cadastro_cliente.setVisible(false);
			
     		  }
     	  }
    
    }
    
    private void SalvarCliente(){
    	
    	if (rdo_pf.isSelected()) {
			ClientePessoaFisica cli = new ClientePessoaFisica();
			
			cli.setCliNome(txt_nome.getText());
			cli.setCliSobrenome(txt_sobrenome.getText());
			cli.setCpf(txt_cpf.getText());
			cli.setRg(txt_rg.getText());
			cli.setCliEnd(txt_end.getText());
			cli.setCliEndNum(txt_end_num.getText());
			cli.setBairro(txt_bairro.getText());
			cli.setCidade(txt_cidade.getText());
			cli.setUf(txt_uf.getText());
			cli.setLimite(txt_limite.getText());
    	}
    	
    	if (rdo_pj.isSelected()) {
			ClientePessoaJuridica cli = new ClientePessoaJuridica();
			
			cli.setRazao(txt_razao_social.getText());
			cli.setCliNome(txt_nome.getText());
			cli.setCliSobrenome(txt_sobrenome.getText());
			cli.setCnpj(txt_cpf.getText());
			cli.setIe(txt_rg.getText());
			cli.setCliEnd(txt_end.getText());
			cli.setCliEndNum(txt_end_num.getText());
			cli.setBairro(txt_bairro.getText());
			cli.setCidade(txt_cidade.getText());
			cli.setUf(txt_uf.getText());
			cli.setLimite(txt_limite.getText());
								
		}
    	
    	JOptionPane.showMessageDialog(null, "Cliente Gravado com Sucesso");
    	Sistema.frm_cadastro_cliente.getContentPane().removeAll();
    	Sistema.frm_cadastro_cliente.getContentPane().add(new CadastroCliente());
    }
}
    

