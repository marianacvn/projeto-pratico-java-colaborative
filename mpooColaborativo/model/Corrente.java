package model;

public class Corrente extends Conta{

	public Corrente(int agencia, double saldo, String senha, Cliente cliente) {
		super(agencia, saldo, senha);
		this.setCliente(cliente);
	}
 
}
