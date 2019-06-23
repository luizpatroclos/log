package br.com.patroclos.secao16;

import java.util.Scanner;

/*
 * Tratando Exceções com try/catch
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

		System.out.println("Informe o primeiro número para a divisão: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número para a divisão: ");
		int num2 = teclado.nextInt();
		
		
		try {
		System.out.println("A divisão de" + num1 + " por " + " é " + num1/num2 );
		}catch(ArithmeticException e){
			System.out.println("Não é possível dividir " + num1 + " por " + num2);
			e.getMessage();
		}finally {
			System.out.println("Keep Going....");
		}
		
		
		teclado.close();
	}
}
