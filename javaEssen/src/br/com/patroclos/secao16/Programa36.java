package br.com.patroclos.secao16;

/*
 * Tratando Exceções com try/catch
 * 
 * 
 * 
 * NomeDaClasse.metodo();
 * 
 * 
 * */
public class Programa36 {
	
	
	public static void main(String[] args) {
		
		int numeros[] = new int[5]; //0..4 -> 0, 1, 2, 3, 4 -> n - 1
		
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3 * 2;
		}
		
		try {
			
		
		for(int i = 0; i <= numeros.length; i++) {
			
			System.out.println(numeros[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println(" Você está tentando acessar índice inesistente !");
		}
				
			}

}
