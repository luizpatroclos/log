package br.com.patroclos.secao16;

import java.util.Scanner;

/*
 * Tratando Exce��es com try/catch
 * 
 * 
 * 
 * NomeDaClasse.metodo();
 * 
 * 
 * */
public class Programa37 {
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero para a divis�o: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo n�mero para a divis�o: ");
		int num2 = teclado.nextInt();
		
		
		try {
		System.out.println("A divis�o de" + num1 + " por " + " � " + num1/num2 );
		}catch(ArithmeticException e){
			System.out.println("N�o � poss�vel dividir " + num1 + " por " + num2);
			e.getMessage();
		}finally {
			System.out.println("Keep Going....");
		}
		
		
		teclado.close();
	}
}
