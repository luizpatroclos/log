package br.com.patroclos.secao11;

public class Conta {
	
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;
	

	
	public Conta( int numero, float saldo, float limite, Cliente cliente) {
		
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	public void sacar(float valor) {
		if (valor <= this.getSaldo()) {
			this.saldo = this.saldo - valor;
			
		}else if(valor <= (this.saldo + this.limite)) {
			
			float val_ret = this.saldo - valor;
			//val_ret = this.limite - val_ret;
			val_ret = this.limite + val_ret;
			this.limite = val_ret;
			System.out.println("Saque realizado com sucesso !");
		} else {
			System.out.println("Saldo insuficiente !");
		}
	}
	
	/**
	 * Mátodo que retorna o Saldo atual
	 * 
	 * @param valor
	 */
	//Forma 1 - sincronização de thread
//	public void depositar(float valor) {
//		synchronized (this) {
//			this.saldo = this.saldo + valor;	
//		}
//		
//	}
	
	
	// Forma 2 - sincronização de thread
	public synchronized void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo + this.limite;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "O saldo da conta é " + this.getSaldo();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Conta)) {
			return false;
		}
		
		Conta verificar = (Conta) obj; //Cast
		return verificar.getSaldo() == this.getSaldo();
	}


}
