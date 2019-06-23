package br.com.patroclos.secao04;



//If, else,  else if
public class Programa04 {

	
	public static void main(String[] args) {
		
	//Declarando e inicializando
		int numero = 8;
		
		if (numero > 10) {
			System.out.println("Sim, o numero " + numero + " é maior que 5");
		}else if( numero == 5) {
			System.out.println("Não, o numero " + numero + " é igual a 5");
		}else if(numero % 2 == 0){
			System.out.println("O numero " + numero + " é par.");
		}else {
			System.out.println("Não, o numero " + numero + " não é maior que 5");
		}

	}


}
