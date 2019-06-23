package br.com.patroclos.secao04;



//Instrução Switch
public class Programa06 {

	public static void main(String[] args) {
		
		int numero = 55;
		
		switch (numero) {
		case 1:
			System.out.println("O num é 1");
			break;
		case 3:
			System.out.println("O num é 3");
			break;
		case 5:
			System.out.println("O num é 5");
			break;
		default:
			System.out.println("O num é " + numero);
			break;
		}
		
		
	}
		
	
	
}
