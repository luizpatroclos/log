package br.com.patroclos.secao20;

import br.com.patroclos.secao11.Cliente;
import br.com.patroclos.secao11.Conta;

//Thread n�o sincronizada (n�o est�vel)


////Por padr�o as threads n�o s�o sincronizadas. Podem ocorrer problemas
//de uma thread acessar o valor de um objeto que ainda n�o foi atualizada
//ou ainda as threads executarem depois do valor j� estar impresso.


public class Programa53 {
	
	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente(37, "Jorge Luiz", "Rua um");
		
		Conta c1 = new Conta(1, 200, 300, cli1);
		
		FazDeposito acao = new FazDeposito(c1);
		

		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();//500 + 100 -> 600 ?
		t2.start();//600 + 100 -> 700 ?
	
		System.out.println(c1);
	}
	
}
