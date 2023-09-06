package model;

public interface Operacao {
	public boolean depositar(double valor, Conta conta) throws ContaException;
	public boolean sacar(double valor, Conta conta) throws ContaException;
}
