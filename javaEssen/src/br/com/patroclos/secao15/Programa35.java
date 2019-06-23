package br.com.patroclos.secao15;

/*
 * Métodos estáticos
 * 
 * Ummétodo estático não depende de uma instância da classe para ser utilizado
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
	
		System.out.println("Próximo numero de conta = " + Conta.proximaConta());
		
			}

}
