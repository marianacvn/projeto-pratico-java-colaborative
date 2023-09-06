package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MensagemView extends JPanel {
	public static int exibirMensagemConfirmar() {
		return  JOptionPane.showConfirmDialog(null, "Deseja realmente sair da doação?", "Encerrar Doação", 0, 0, new ImageIcon("img/logo.png"));
	}
	
	public static void exibirMensagemErro(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "", 0, new ImageIcon("img/logo.png"));
	}
	
	public static void exibirMensagemAlerta(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "Mensage", JOptionPane.INFORMATION_MESSAGE);
	}
}
