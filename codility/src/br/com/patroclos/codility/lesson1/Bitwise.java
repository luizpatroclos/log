package br.com.patroclos.codility.lesson1;

public class Bitwise {
	
	
	public static void main(String args[]) {
		
		int n = 8455203;
		int a = 10;
        int b = 12;
        
       /* System.out.println("Binary of -> "+a + " ---> " + Integer.toBinaryString(a));
        
        System.out.println("Binary of -> "+b + " ---> " + Integer.toBinaryString(b));

        System.out.println(a + " | " + b + " = " + (a | b) + " Results Binary -> " + Integer.toBinaryString(a | b));
        System.out.println(a + " & " + b + " = " + (a & b) + " Results Binary -> " + Integer.toBinaryString(a & b));
        System.out.println(a + " ^ " + b + " = " + (a ^ b) + " Results Binary -> " + Integer.toBinaryString(a ^ b));

        a = 9;
        b = 7;

        System.out.println(a + " | " + b + " = " + (a | b));
        System.out.println(a + " & " + b + " = " + (a & b));
        System.out.println(a + " ^ " + b + " = " + (a ^  b));*/
        
        
        
        System.out.println("Binary of -> "+n + " ---> " + Integer.toBinaryString(n));
        
     // get rid of right-hand zeros
	    while (n != 0 && (n & 1) == 0) {
	    	
	    	System.out.println("Binary of -> "+n + " ---> " + Integer.toBinaryString(n));
	    	
	        n >>>= 1;
	        
	        System.out.println("Binary of -> "+n + " ---> " + Integer.toBinaryString(n));
	    }
	    
	    System.out.println("Binary of -> "+n + " ---> " + Integer.toBinaryString(n));
	    
	    int max = 0;
	    int gap = 0;
	    while (n != 0) {
	        if ((n & 1) == 0) {
	        	
	            gap++;
	            max = Math.max(gap, max);
	        } else {
	            gap = 0;
	        }
	        n >>>= 1;
	        
	        System.out.println("Binary of -> "+n + " ---> " + Integer.toBinaryString(n));
	    }
	    System.out.println("Valor "+ max );
		
		
		
	}

}
