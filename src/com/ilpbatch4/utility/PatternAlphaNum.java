package com.ilpbatch4.utility;

public class PatternAlphaNum {

	public static void printPattern(int n)
    {
        int i, j , count=1;
        
        char c = 'A';
     
        for (i = 1; i <= n; i++) {
            
            for (j = 1; j <= i; j++) {
            	if(j==1) {
            	System.out.print(count + " ");
            	count++;
            	}
                else if(j%2==0) {
               
                System.out.print(c + " ");
                c++;
                
            	}
            	else if(j%2!=0) {
            	System.out.print(count + " ");
            	count++;
            	}
            	
            }
              
              System.out.println();
              c='A';
              count = 1;
              
        }
    }
 
   
    public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
