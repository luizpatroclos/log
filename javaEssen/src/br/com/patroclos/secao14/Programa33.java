package br.com.patroclos.secao14;

/*
 * Interface - o que é e quando utilizar
 * 
 * Interfaces são conhecidas como "contratos".
 * 
 * 
 * Uma empresa criou um contrato "com regras" para definir
 * a criação de um produto/serviço
 * 
 * O João decidiu implementar um produto/serviço com base nesse contrato.
 * 
 * A Maria tb decidiu fazer o mesmo.
 * 
 * 
 * */
public class Programa33 {
	
	
	public static void main(String[] args) {
	
		Ventilador vtl = new Ventilador();
		
		System.out.println("A Marca do Ventilador é : " + vtl.MARCA);	
		
		vtl.desligar();
		
		vtl.ligar();
		
		vtl.desligar();
		
	
	
	}

}
