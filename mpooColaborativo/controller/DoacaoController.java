package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import view.DoacaoView;
import view.IndexView;
import view.MensagemView;

public class DoacaoController {
	
	private DoacaoView doacaoView;
	private IndexView indexView;
	
	public DoacaoController(DoacaoView doacaoView, IndexView indexView) {
		this.doacaoView = doacaoView;
		this.indexView = indexView;
		ButtonHandler buttonHandler = new ButtonHandler();
		doacaoView.getConfirmarButton().addActionListener(buttonHandler);
		doacaoView.getVoltarButton().addActionListener(buttonHandler);
	}
	
	class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == doacaoView.getConfirmarButton()) {
				if (!doacaoView.getAutorizaCheckBox().isSelected()) {
					MensagemView.exibirMensagemAlerta("Para continuar. É preciso selecionar a opção de Autorização de Doação");
				}
			}
			if (e.getSource() == doacaoView.getVoltarButton()) {
				int i = MensagemView.exibirMensagemConfirmar();
				if (i == 0) {						
					doacaoView.setVisible(false);
					indexView.setVisible(true);
				}
			}
		}
		
	}
	
	class KeyHandler extends KeyAdapter {
		
	}
	

}
