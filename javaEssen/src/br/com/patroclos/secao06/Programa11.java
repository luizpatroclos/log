package br.com.patroclos.secao06;

//Tipos de dados
//Numéricos (Inteiros e Reais)
public class Programa11 {

	public static void main(String[] args) {
		//Tipos primitivos
		long num0 = 99; // inteiro 9999999999999999999999999999
		int num1= 4; //inteiro 999999999999999999999
		short num2= 4; //inteiro (menor) 99999999
		byte num3 = 4; //Inteiro 9999
		char num8 = 4; 
		
		//Tipos não primitivos / whrapperClass
		Long num7 = 999999l; //cast usa "l" ou faz esplicito (long)
		Integer num4 = 5;
		Short  num5 = 9;
		Byte num6 = 10;
		Character num9 = 25;
		
		
		System.out.println(" Valor long " + num0);
		System.out.println(" Valor int " + num1);
		System.out.println(" Valor short " + num2);
		System.out.println(" Valor byte " + num3);
		System.out.println(" Valor Integer " + num4);
		System.out.println(" Valor Short " + num5);
		System.out.println(" Valor Byte " + num6);
		System.out.println(" Valor char " + num8);
		
		System.out.println(" Valor total em memoria long/Long " + num7.SIZE);
		System.out.println(" Valor total em memoria int/Integer " + num4.SIZE);
		System.out.println(" Valor total em memoria short/Short " + num5.SIZE);
		System.out.println(" Valor total em memoria byte/Byte " + num6.SIZE);
		System.out.println(" Valor total em memoria char/Character " + num9.SIZE);
		
		
		System.out.println(" Valor Min int/Integer " + num4.MIN_VALUE);
		System.out.println(" Valor Max int/Integer " + num4.MAX_VALUE);
		
		System.out.println(" Valor Min short/Short " + num5.MIN_VALUE);
		System.out.println(" Valor Max short/Short " + num5.MAX_VALUE);
		
		System.out.println(" Valor Min byte/Byte " + num6.MIN_VALUE);
		System.out.println(" Valor Max byte/Byte " + num6.MAX_VALUE);
		
		System.out.println(" Valor Min long/Long " + num7.MIN_VALUE);
		System.out.println(" Valor Max long/Long " + num7.MAX_VALUE);
		
		System.out.println(" Valor Min char/Character " + num9.MIN_VALUE);
		System.out.println(" Valor Max char/Character " + num9.MAX_VALUE);
	}

}
