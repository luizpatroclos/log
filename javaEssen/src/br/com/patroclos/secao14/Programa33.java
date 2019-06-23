package br.com.patroclos.secao14;

/*
 * Interface - o que � e quando utilizar
 * 
 * Interfaces s�o conhecidas como "contratos".
 * 
 * 
 * Uma empresa criou um contrato "com regras" para definir
 * a cria��o de um produto/servi�o
 * 
 * O Jo�o decidiu implementar um produto/servi�o com base nesse contrato.
 * 
 * A Maria tb decidiu fazer o mesmo.
 * 
 * 
 * */
public class Programa33 {
	
	
	public static void main(String[] args) {
	
		Ventilador vtl = new Ventilador();
		
		System.out.println("A Marca do Ventilador � : " + vtl.MARCA);	
		
		vtl.desligar();
		
		vtl.ligar();
		
		vtl.desligar();
		
	
	
	}

}
