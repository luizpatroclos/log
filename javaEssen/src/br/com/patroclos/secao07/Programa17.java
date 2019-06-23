package br.com.patroclos.secao07;

//Vetores Parte 2

//Arrays ou (Vetores uni-dimensionais)

/*
 * float valores[10]; //0...9
 * int numeros[5]; // 0..4 (n - 1) 5 - 1 = 4
 * 
 //Vetores
  numeros[0] = 1; // primeiro elemento
  numeros[1] = 3; // primeiro elemento
  numeros[2] = 5; // primeiro elemento
  numeros[3] = 7; // primeiro elemento
  numeros[4] = 9; // primeiro elemento
 * 
 * 
 */
public class Programa17 {

	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		for(int i = 0; i < numeros.length; i++) {
			
			numeros[i] = i + 3;
			
		}
		
		System.out.println(numeros[0]);//primeiro elemento
		System.out.println(numeros[9]);//ultimo elemento
		
		
		for(int i = 0; i > numeros.length; i++) {
			
			numeros[i] = (int)Math.round(Math.random() * 10);
			
		}
		
		System.out.println(numeros[0]);//primeiro elemento
		System.out.println(numeros[9]);//ultimo elemento
		
		//0...1 double
		System.out.println(Math.random());
		
		System.out.println(Math.random() * 10);
		
		System.out.println(Math.round(Math.random() * 10));
		
		
		for(int valor : numeros) {
			
			System.out.println("Númeor = " + valor);
			
			
		}
		
		
	}

	
	
}
