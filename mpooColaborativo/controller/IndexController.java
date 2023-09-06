package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import view.DoacaoView;
import view.IndexView;
import view.MensagemView;

public class IndexController implements KeyListener {
	
	private IndexView indexView;
	private DoacaoView doacaoView;
	
	public IndexController() {
		indexView = new IndexView();
		doacaoView = new DoacaoView();
		new DoacaoController(doacaoView, indexView);
		indexView.addKeyListener(this);
		indexView.getButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (indexView.getButton() == e.getSource()) {	
					indexView.setVisible(false);
					doacaoView.setVisible(true);
				}
			}
		});
	}


	@Override
	public void keyTyped(KeyEvent e) {}


	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			int i = MensagemView.exibirMensagemConfirmar();
			if (i == 0) {
				System.exit(0);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

}
