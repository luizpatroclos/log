package br.com.patroclos.secao07;

//Matrizes parte 2
/*
 * Vetores/arrays/matrizes multi-dimenssionais
 * 
 //Vetor
  
  int numeros[3];
  numeros[0] = 3;
  numeros[1] = 2;
  numeros[2] = 5;
  
  //Matriz
   [linhas] [colunas]
   int numeros [3][3]
  
  numeros[0][0] = 1
  numeros[0][1] = 2
  numeros[0][2] = 5
  numeros[1][0] = 7
  numeros[1][1] = 4
  numeros[1][2] = 9
  numeros[2][0] = 3
  numeros[2][1] = 6
  numeros[2][2] = 32
 * 
 */
public class Programa19 {

	public static void main(String[] args) {

		// Declara��o e defini��o de tamanho
		int numeros[][] = new int[3][3];

		numeros[0][0] = 1;
		numeros[0][1] = 3;
		numeros[0][2] = 5;
		numeros[1][0] = 7;
		numeros[1][1] = 9;
		numeros[1][2] = 11;
		numeros[2][0] = 13;
		numeros[2][1] = 15;
		numeros[2][2] = 17;

		// System.out.println(numeros[1][2]);

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				// System.out.println(numeros[i][j]);
				System.out.println(" Numeros [" + i + "] [" + j + "] = " + numeros[i][j]);

			}

		}

	}

	
	
}
