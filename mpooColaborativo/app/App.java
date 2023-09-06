package app;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import controller.IndexController;
import model.BancoMPOO;
import model.BaseDados;
import model.Cliente;
import model.Conta;
import model.ContaException;
import model.Corrente;
import model.Poupanca;
import view.MensagemView;

public class App {
	public static void main(String[] args) {
		IndexController controller = new IndexController();
		
		BaseDados.createBase();
		
		Conta conta1 = new Poupanca(2739, 0, "101010", 1, new Cliente("Maria Silva", "833.553.163-34"));
		Conta conta2 = new Corrente(2739, 0, "998877", new Cliente("Godofredo Silva", "358.251.830-27"));
		
		BaseDados.addConta(conta1);
		BaseDados.addConta(conta2);
		
		BancoMPOO banco = new BancoMPOO();

		System.out.println("=-=-=-=-=-=-==-=-=-=-=-=-=-=-=");
		System.out.println("=-           Saldo          -=");
		System.out.println("=-=-=-=-=-=-==-=-=-=-=-=-=-=-=");
		
		System.out.println(conta1);
		System.out.println(conta2);
		
		try {
			banco.depositar(1000, conta1);
			banco.sacar(100, conta1);
			banco.transferir(400, conta1, conta2);
		} catch (ContaException e) {
			MensagemView.exibirMensagemErro(e.getMessage());
		}
		

		System.out.println("=-=-=-=-=-=-==-=-=-=-=-=-=-=-=");
		System.out.println("=-    Saldo Após Operação   -=");
		System.out.println("=-=-=-=-=-=-==-=-=-=-=-=-=-=-=");
		

		System.out.println(conta1);
		System.out.println(conta2);
	}

}
