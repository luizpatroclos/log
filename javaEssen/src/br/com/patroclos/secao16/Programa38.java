package br.com.patroclos.secao16;

import java.io.IOException;
import java.util.Scanner;

public class Programa38 {
	
	
	public static void main(String[] args) {
		
	
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o primeiro número para a divisão: ");
		int n1 = teclado.nextInt();
		
		
		
		System.out.println("Informe o segundo número para a divisão: ");
		int n2 = teclado.nextInt();
		
		try {
			System.out.println(divisao(n1, n2));
		} catch(ArithmeticException ex)  {
			System.out.println("Um erro de divisção por zero");
		}catch(Exception e) {
			System.out.println("Uma outra exceção");
		}
		
		
		
		
		teclado.close();
		
		
	}
	
	//Criando uma função, que avisa que tem possibilidade
	//de lançar uma exceção do tipo Exception
	public static int divisao(int n1, int n2) throws IOException{
		return n1/n2;
	}
	
}
