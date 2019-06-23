package br.com.patroclos.secao06;

//Operações Matemáticas
public class Programa15 {

	public static void main(String[] args) {
		
		
		int num1 = 5, num2 = 9, res;
		float res2;
		
		
		//Soma
		res = num1 + num2;
		System.out.println("A Soma de " + num1 + " + " + num2 + " é " + res);
		
		//Subtracao
		res = num1 - num2;
		System.out.println("A Subtração de " + num1 + " + " + num2 + " é " + res);
		
		
		//Multiplicação
		res = num1 * num2;
		System.out.println("A Subtração de " + num1 + " + " + num2 + " é " + res);
		
		
		//Divisão ( Inteira )
		res = num2 / num1;
		System.out.println("A Subtração de " + num2 + " / " + num1 + " é " + res);
		
		
		//Divisão ( Real )
		res2 = (float)num2 / (float)num1; // cast
		System.out.println("A Subtração de " + num2 + " / " + num1 + " é " + res2);
		
		
		//Módulo 
		/*
		 * se o resto do módulo da variável por 2 for 0, a variável é par. Se o resto for 1, 
		 * a variável é ímpar
		 */
		res = num2 % 2;
		String result;
		System.out.println("O resto da divisão de " + num1 + " por 2 é "  + (result =  (res == 0 ? " Par " : " Ímpar")));
		
	}

	
	
}
