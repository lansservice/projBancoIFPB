package bancoifpb.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bancoifpb.Sistema;
import bancoifpb.classes.conta.Conta;
import bancoifpb.classes.validadores.EstadoJanela;

public class CadastroConta extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn_cadastrar;
    private JLabel lbl_titulo1;
    private JLabel lbl_num_conta;
    private JLabel lbl_agencia;
    private JTextField txt_num_conta;
    private JTextField txt_agencia;
    private JLabel lbl_cpf;
    private JTextField txt_cpf;
    private JButton btn_cancelar;
    EstadoJanela estadoJanela = new EstadoJanela();
    private JLabel lbl_saldo;
    private JTextField txt_saldo;

	public CadastroConta() {

        //construct components
		Label lbl_limite = new Label("Limite Nao Disponivel");
		txt_saldo = new JTextField(5);
		lbl_saldo = new JLabel("Saldo:");
        btn_cadastrar = new JButton ("Cadastrar");
        btn_cancelar = new JButton ("Cancelar");
        lbl_titulo1 = new JLabel ("Dados da Conta:");
        lbl_num_conta = new JLabel ("Numero:");
        lbl_agencia = new JLabel ("Agencia:");
        lbl_cpf = new JLabel ("CPF:");
        txt_num_conta = new JTextField (5);
        txt_agencia = new JTextField (5);
        txt_cpf = new JTextField (5);

        //adjust size and set layout
        setPreferredSize (new Dimension(409, 131));
        setMaximumSize(getPreferredSize());
        setMinimumSize(getPreferredSize());
        setLayout (null);

        //add components
        add (btn_cadastrar);
        add (lbl_titulo1);
        add (lbl_num_conta);
        add (lbl_agencia);
        add (txt_num_conta);
        add (txt_agencia);
        add (lbl_cpf);
        add (txt_cpf);
        add(lbl_saldo);
        add (btn_cancelar);
        add(txt_saldo);

        //set component bounds (only needed by Absolute Positioning)
        btn_cadastrar.setBounds (151, 100, 100, 20);
        btn_cancelar.setBounds (262, 100, 100, 20);
        lbl_titulo1.setBounds (10, 5, 90, 25);
        lbl_num_conta.setBounds (10, 30, 52, 25);
        lbl_agencia.setBounds (175, 30, 65, 25);
        lbl_cpf.setBounds (10, 55, 46, 25);
        txt_num_conta.setBounds (65, 32, 100, 20);
        txt_agencia.setBounds (219, 32, 97, 20);
        txt_cpf.setBounds (37, 57, 213, 20);
        lbl_saldo.setBounds(260, 55, 65, 25);
        txt_saldo.setBounds(304, 57, 97, 20);
        
        
        
        lbl_limite.setForeground(Color.WHITE);
        lbl_limite.setBackground(Color.RED);
        lbl_limite.setAlignment(Label.CENTER);
        lbl_limite.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
        lbl_limite.setBounds(261, 5, 138, 22);
        add(lbl_limite);
        
        /** * Pegando os eventos de cada botao */
        ButtonHandler handler = new ButtonHandler();
        btn_cadastrar.addActionListener(handler);
        btn_cancelar.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {
   	  public void actionPerformed(ActionEvent event){
   		  if (event.getSource()== btn_cadastrar) {
   			  SalvarConta();
		 }
   		  
   		  if (event.getSource()== btn_cancelar) {
   			  Cancelar();
   		  }
   	  }
    }
    
    /** *Cadastrar Conta */
    private void SalvarConta(){
    	Conta cont = new Conta();
    	BigDecimal valor = new BigDecimal(txt_saldo.getText());
    	
    	cont.setNumConta((txt_num_conta.getText()));
    	cont.setNumAgencia((txt_agencia.getText()));
    	cont.setCpf((txt_cpf.getText()));
    	cont.setValorSaldo(valor);
    	
    	if (Sistema.banco.getMap_agencia().containsKey(txt_agencia.getText()) == true) {
			 if (Sistema.banco.getMap_agencia().get(txt_agencia.getText()).getMap_cliente().containsKey(txt_cpf.getText()) == true){
				 Sistema.banco.getMap_agencia().get(txt_agencia.getText()).setContaAgencia(cont.getNumConta(), cont);
				 JOptionPane.showMessageDialog(null, "Conta Gravada com Sucesso");
				 Sistema.frm_cadastro_conta.getContentPane().removeAll();
				 Sistema.frm_cadastro_conta.getContentPane().add(new CadastroConta());
				 estadoJanela.JanelaVisibleFalse();
			 }else{
					 JOptionPane.showMessageDialog(null, "Cliente nao encontrado na Agencia, favor procure seu gerente!");
				 }
		}else {
			JOptionPane.showMessageDialog(null, "Agencia nao encontrada no Banco, favor procure seu gerente!");
			cont = null;				 
			
		}    	
    }
    
    /** *Cancelar Cadastro */
    private void Cancelar(){
    	JOptionPane.showMessageDialog(null, "Cancelada a gravação da Conta");
    	Sistema.frm_cadastro_conta.getContentPane().removeAll();
    	Sistema.frm_cadastro_conta.getContentPane().add(new CadastroConta());
    	estadoJanela.JanelaVisibleFalse();
    }
}
