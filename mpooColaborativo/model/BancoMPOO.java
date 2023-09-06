package model;

public class BancoMPOO implements Operacao {

	@Override
	public boolean depositar(double valor, Conta conta) throws ContaException {
		if(valor > 0) {
			conta.setSaldo(conta.getSaldo()+valor);
			return true;
		}
		throw new ContaException("Valor não pode ser menor ou igual a zero");
	}

	@Override
	public boolean sacar(double valor, Conta conta) throws ContaException {
		if(conta.getSaldo() >= valor ) {
			conta.setSaldo(conta.getSaldo()-valor);
			return true;
		} 
		throw new ContaException("Saldo Insuficiente");
	}
	
	public boolean transferir(double valor, Conta contaOrigem, Conta contaDestino) throws ContaException{
		if(sacar(valor, contaOrigem) && depositar(valor, contaDestino))
			return true;
		return false;
	}
    public boolean validarContaDoacao(int agencia, int numero) throws ContaNaoAutorizadaException {
    	if (BaseDados.tipoConta(agencia, numero).equals("Corrente")) {
    		return true;
    	}
    	throw new ContaNaoAutorizadaException("Conta não autorizada!");
    }
}
