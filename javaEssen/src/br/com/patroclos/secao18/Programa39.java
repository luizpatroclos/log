package br.com.patroclos.secao18;

import java.util.function.Predicate;

import br.com.patroclos.secao11.Cliente;
import br.com.patroclos.secao11.Conta;

//Object a M�e de todas as classes

/*
 * 
 * A classe Object faz parte do pacote java.lang
 * 
 * 
 * */
public class Programa39 {
	
	
	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente(35,"Marg�", "Rua pacad�nia");
		
		Cliente cliente2 = new Cliente(25,"Craudete", "Rua Cacilds");
		
		Conta c1 = new Conta(1, 200, 300, cliente1);
	
		Conta c2 = new Conta(2, 200, 300, cliente2);
		
		Caixa prateleira = new Caixa();
		
		System.out.println(c1);//por padr�o inst�ncia imprime toString
		System.out.println(c1);
		
		
		if (c1.equals(c2)) {
			System.out.println("S�o a mesma Conta !");
		}else {
			System.out.println("S�o Contas diferentes !");
		}
		
		prateleira.adicionar(c1);
		prateleira.adicionar(c2);
		
		//Conta conta = prateleira.pegar(0);
		
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo());
		
		prateleira.adicionar(cliente1);// 2 = n�o tem getSaldo();
		
		System.out.println(((Cliente)prateleira.pegar(2)).getNome());
		
	}
	
	
	
}
