package br.com.patroclos.secao04;



//Instru��o Switch
public class Programa06 {

	public static void main(String[] args) {
		
		int numero = 55;
		
		switch (numero) {
		case 1:
			System.out.println("O num � 1");
			break;
		case 3:
			System.out.println("O num � 3");
			break;
		case 5:
			System.out.println("O num � 5");
			break;
		default:
			System.out.println("O num � " + numero);
			break;
		}
		
		
	}
		
	
	
}
