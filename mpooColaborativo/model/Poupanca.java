package model;

public class Poupanca extends Conta {
	private int dv;

	public Poupanca(int agencia, double saldo, String senha, int dv, Cliente cliente) {
		super(agencia, saldo, senha);
		this.dv = dv;
		this.setCliente(cliente);
	}

	public int getDv() {
		return dv;
	}

	public void setDv(int dv) {
		this.dv = dv;
	}
	
	

	

}
