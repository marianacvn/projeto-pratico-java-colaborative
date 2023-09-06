package model;

public abstract class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	private String senha;
	private Cliente cliente;
	private static int numeroProximo;
	
	public Conta(int agencia, double saldo, String senha) {
		super();
		this.agencia = agencia;
		this.saldo = saldo;
		this.senha = senha;
		numero = BaseDados.listContas(agencia).size() == 0 ? 1 : BaseDados.listContas(agencia).get(BaseDados.listContas(agencia).size()-1) + 1;
	}
	
	public Conta(int agencia, String senha) {
		super();
		this.agencia = agencia;
		this.senha = senha;
		numero = BaseDados.listContas(agencia).size() == 0 ? 1 : BaseDados.listContas(agencia).get(BaseDados.listContas(agencia).size()-1) + 1;
	}
	

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static int getNumeroProximo() {
		return numeroProximo;
	}

	public static void setNumeroProximo(int numeroProximo) {
		Conta.numeroProximo = numeroProximo;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + ", senha=" + senha
				+ ", cliente=" + cliente + "]";
	}
	
	
}
