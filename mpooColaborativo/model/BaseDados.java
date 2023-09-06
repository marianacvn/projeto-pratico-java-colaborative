package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Conta> contas;
	public static ArrayList<Doacao> doacoes;
	
	
	public static void createBase() {
		inicializarBase();
	}
	
	private static void inicializarBase() {
		contas = new ArrayList<Conta>();
		doacoes = new ArrayList<Doacao>();
	}
	
	public static Conta buscarConta(int agencia,int numero) {
		for (Conta conta : contas) {
			if(conta.getAgencia() == agencia && conta.getNumero() == numero)
				return conta;
		}
		return null;
	}
	public static boolean isConta(int agencia, int numero) {
			for (Conta conta : contas) {
				if(conta.getAgencia() == agencia && conta.getNumero() == numero)
					return true;
			}
			return false;
			
	}
	public static boolean addConta(Conta conta) {
			if(isConta(conta.getAgencia(), conta.getNumero())) {
				return false;
			}
			return contas.add(conta);
	}
	public static boolean removerConta(Conta conta) {
		Conta contabd = buscarConta(conta.getAgencia(), conta.getNumero());
		return contas.remove(contabd);
	}
	public static String tipoConta(int agencia, int numero) {
			Conta conta = buscarConta(agencia, numero);
			if (conta instanceof Corrente) {
				return "Corrente";
			} else if (conta instanceof Poupanca){
				return "Poupança";		
			} 
				return null;
	}
	public static ArrayList<Integer> listContas(int agencia){
			ArrayList<Integer> numeros = new ArrayList<Integer>();
			for (Conta conta : contas) {
				if(conta.getAgencia() == agencia)
					numeros.add(conta.getNumero());
			}
			return numeros;
	}
}

