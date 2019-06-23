package br.com.patroclos.secao06;

//Tipos de dados
//Numéricos (Inteiros e Reais)
public class Programa12 {

	public static void main(String[] args) {
		//Tipos primitivos
		//Por padrão, os numeros reais em java são considerados double
		float preco1 = 23.4f; //23.40
		double preco2 = 23.4d; //23.435353535353
		
		
		//tipos não primitivos / whrapperClass
		Float preco3 = 44.6f;
		Double preco4 = 44.5;
		
		System.out.println(" Valor float " + preco1);
		System.out.println(" Valor double " + preco2);
		System.out.println(" Valor Float " + preco3);
		System.out.println(" Valor Double " + preco4);
		
		
		
		System.out.println(" Valor total em memoria float/Float " + Float.SIZE);
		System.out.println(" Valor total em memoria double/Double " + Double.SIZE);
		
		
		System.out.println(" Valor Min float/Float " + Float.MIN_VALUE);
		System.out.println(" Valor Max float/Float " + Float.MAX_VALUE);
		
		System.out.println(" Valor Min double/Double " + Double.MIN_VALUE);
		System.out.println(" Valor Max double/Double " + Double.MAX_VALUE);
		
	}

	
	
}
