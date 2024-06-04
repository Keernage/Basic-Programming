package com.ilpbatch4.utility;

public class PatternPrintingGap {

	public static void printPattern(int n)
    {
        int i, j;
     
        for (i = 1; i <= n; i++) {
            
            for (j = 1; j <= i; j++) {
            	if(j==1) {
            	System.out.print(j);
            	}
                else if(j%2==0) {
               
                System.out.print("  "+ j);
                
            	}
            	else if(j!=1&&j%2!=0) {
            	System.out.print(" " + j);	
            	}
            }
 
              System.out.println();
        }
    }
 
   
    public static void main(String args[])
    {
        int n = 4;
        printPattern(n);
    }
}