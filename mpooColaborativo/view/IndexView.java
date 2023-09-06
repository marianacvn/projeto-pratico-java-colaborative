package view;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class IndexView extends JFrame{
	private JLabel imgLabel;
	private JButton button;

	public IndexView() {
		super("Index View");
		imgLabel = new JLabel(new ImageIcon("img/logo.png"));
		button = new JButton("Doar");
		add(imgLabel);
		add(button);
		setLayout(new FlowLayout());
		setSize(250, 170);
		setUndecorated(true);
		setLocationRelativeTo(null);
		setFocusable(true);
		requestFocusInWindow();
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro aparência Nimbus: O sistema será encerrado!", "Error Nimbus", ERROR);
			System.exit(0);
			e.printStackTrace();
		} 
		setVisible(true);
	}

	public JButton getButton() {
		return button;
	}
	
	
}
