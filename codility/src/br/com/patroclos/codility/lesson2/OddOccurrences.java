package br.com.patroclos.codility.lesson2;

import java.util.ArrayList;

/*
 * A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each element of the array can be paired with another element that has the same value, except for one element that is left unpaired.

For example, in array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the elements at indexes 0 and 2 have value 9,
the elements at indexes 1 and 3 have value 3,
the elements at indexes 4 and 6 have value 9,
the element at index 5 has value 7 and is unpaired.
Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers fulfilling the above conditions, returns the value of the unpaired element.

For example, given array A such that:

  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9
the function should return 7, as explained in the example above.

Write an efficient algorithm for the following assumptions:

N is an odd integer within the range [1..1,000,000];
each element of array A is an integer within the range [1..1,000,000,000];
all but one of the values in A occur an even number of times.
 * 
 * 
 * */


public class OddOccurrences {
	
	public static void main (String args[]) {
		
		int[] ki = {9,3,9,3,9,7,9};
		
		//int[] ki = {1,2,1};
		
		int retorno = beterSolution(ki);
		
		System.out.println(" UMPAIR ---> " + retorno);
	}
	
	
	
	public static int beterSolution(int[] n) {
		int unpair = 0;
		
		for(int valor : n) {
			unpair ^= valor;
		}
		return unpair;
		
		
		/*
		 * 100 out of 100 points
		   100%
		 * 
		 * 
		 * */
	}
	
	
	public static int solution(int[] n) {
		
		int unpair = 0;
		int ocorrencia = 0;
		
		/*Set<Integer> semRepeticao = new LinkedHashSet<Integer>();
		for (int valor: n) {
		    semRepeticao.add(valor);
		}*/
		
		ArrayList<Integer> valorx = new  ArrayList<Integer>();
		
		for (int valor: n) {
			valorx.add(valor);
		}
		
		
		for(int i = 0; i < valorx.size(); i++) {
		
			ocorrencia = 0;
			
			for( int j = 0; j < n.length; j++) {
				
				//System.out.println("É par -- Esse n[i] = "+ n[i] + " Com Esse "+ n[j] );
				
				if(valorx.get(i) == n[j]) {
					
					ocorrencia++;
					//System.out.println("É par -- Esse n[i] = "+ n[i] + " Com Esse "+ n[j] );
					
				}
				
			}
			
			if(ocorrencia < 2) {
				
				unpair = n[i];
			}
			
		}

		return unpair;
	
	}
	
	/*
	 * 55 out of 100 points
	55% ----- I have to improve my solution in order to pass in this fucking tests

	 * 
	 * 
	 * */

}
