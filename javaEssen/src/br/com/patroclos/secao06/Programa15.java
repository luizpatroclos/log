package br.com.patroclos.secao06;

//Opera��es Matem�ticas
public class Programa15 {

	public static void main(String[] args) {
		
		
		int num1 = 5, num2 = 9, res;
		float res2;
		
		
		//Soma
		res = num1 + num2;
		System.out.println("A Soma de " + num1 + " + " + num2 + " � " + res);
		
		//Subtracao
		res = num1 - num2;
		System.out.println("A Subtra��o de " + num1 + " + " + num2 + " � " + res);
		
		
		//Multiplica��o
		res = num1 * num2;
		System.out.println("A Subtra��o de " + num1 + " + " + num2 + " � " + res);
		
		
		//Divis�o ( Inteira )
		res = num2 / num1;
		System.out.println("A Subtra��o de " + num2 + " / " + num1 + " � " + res);
		
		
		//Divis�o ( Real )
		res2 = (float)num2 / (float)num1; // cast
		System.out.println("A Subtra��o de " + num2 + " / " + num1 + " � " + res2);
		
		
		//M�dulo 
		/*
		 * se o resto do m�dulo da vari�vel por 2 for 0, a vari�vel � par. Se o resto for 1, 
		 * a vari�vel � �mpar
		 */
		res = num2 % 2;
		String result;
		System.out.println("O resto da divis�o de " + num1 + " por 2 � "  + (result =  (res == 0 ? " Par " : " �mpar")));
		
	}

	
	
}
