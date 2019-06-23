package br.com.patroclos.secao20;

import br.com.patroclos.secao11.Conta;

public class FazDeposito implements Runnable {
	
	private Conta conta;
	
	
	public FazDeposito(Conta conta) {
		this.conta = conta;
	}
	
	public void run() {
	this.conta.depositar(100.0f);	
	}

}
