package br.com.patroclos.secao15;

/*
 * M�todos est�ticos
 * 
 * Umm�todo est�tico n�o depende de uma inst�ncia da classe para ser utilizado
 * pode-se utilizar conforme:
 * 
 * NomeDaClasse.metodo();
 * 
 * 
 * */
public class Programa35 {
	
	
	public static void main(String[] args) {
	
		Conta c1 = new Conta("Rafaela");
		
		System.out.println(c1.getNemero());
		System.out.println(c1.getCliente());
	
		System.out.println("Pr�ximo numero de conta = " + Conta.proximaConta());
		
			}

}
