package model;

public class Cliente {
	public String nome;
	String cpf;
	

	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}




	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
	
}
