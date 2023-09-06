package view;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class DoacaoView extends JFrame{
	private JLabel agenciaLabel, contaLabel, valorLabel, debitoLabel;
	private JTextField agenciaField, contaField, valorField;
	private JRadioButton simRadioButton, naoRadioButton;
	private JCheckBox autorizaCheckBox;
	
	JButton confirmarButton, voltarButton;

	public DoacaoView() {
		super("Doação View");
		agenciaLabel = new JLabel("Agencia:");
		contaLabel = new JLabel("Conta:");
		valorLabel = new JLabel("Valor (R$):");
		debitoLabel = new JLabel("Débito Automático:");
		
		agenciaField = new JTextField(10);
		contaField = new JTextField(10);
		valorField = new JTextField(10);

		simRadioButton = new JRadioButton("Sim", true);
		naoRadioButton = new JRadioButton("Não", false);
		
		confirmarButton = new JButton("Confirmar");
		voltarButton = new JButton("Voltar");
		
		autorizaCheckBox = new JCheckBox("Autorização de Doação");
		
		ButtonGroup group = new ButtonGroup();
		group.add(simRadioButton);
		group.add(naoRadioButton);
		
		add(agenciaLabel);
		add(agenciaField);
		add(contaLabel);
		add(contaField);
		add(valorLabel);
		add(valorField);
		add(debitoLabel);
		add(simRadioButton);
		add(naoRadioButton);
		add(autorizaCheckBox);
		add(confirmarButton);
		add(voltarButton);
		
		setLayout(new FlowLayout());
		setSize(210, 190);
		setUndecorated(true);
		setLocationRelativeTo(null);
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro aparência Nimbus: O sistema será encerrado!", "Error Nimbus", ERROR);
			System.exit(0);
			e.printStackTrace();
		} 
		setVisible(false);
	}

	public JTextField getAgenciaField() {
		return agenciaField;
	}

	public JTextField getContaField() {
		return contaField;
	}

	public JTextField getValorField() {
		return valorField;
	}

	public JRadioButton getSimRadioButton() {
		return simRadioButton;
	}

	public JRadioButton getNaoRadioButton() {
		return naoRadioButton;
	}

	public JCheckBox getAutorizaCheckBox() {
		return autorizaCheckBox;
	}

	public JButton getConfirmarButton() {
		return confirmarButton;
	}

	public JButton getVoltarButton() {
		return voltarButton;
	}
}
