package br.com.patroclos.secao19;

import java.util.HashMap;
import java.util.Map;

import br.com.patroclos.secao11.Cliente;
import br.com.patroclos.secao11.Conta;

//HashMap

/*
 * 
 * Não aceita chaves duplicados, mas valores sim.
 * 
 * A classe HashMap implementa a interface Map e trabalha com chave/valor
 * 
 * 
 * 
 * */
public class Programa49 {
	
	public static void main(String[] args) {
		
		
		Map<String,Conta> contas = new HashMap<String, Conta>();
		
		
		Cliente cl1 = new Cliente(23, "Luiza", "Rua 3");
		
		
		Cliente cl2 = new Cliente(25, "Luiz", "Rua 4");
		
		Conta c1 = new Conta(1, 200, 300, cl1);
		Conta c2 = new Conta(1, 400, 700, cl2);
		
		
		contas.put("Pessoa Física", c1);
		contas.put("Pessoa Jurídica", c2);
		
		
		System.out.println(contas.get("Pessoa Física"));
		
	
	}
	
	
}
