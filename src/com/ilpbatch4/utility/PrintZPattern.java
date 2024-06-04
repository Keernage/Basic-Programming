package com.ilpbatch4.utility;

public class PrintZPattern {

	public static void main(String[] args) {
		int N=6;
		printZ(N);

	}

	private static void printZ(int n) {
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0||i+j==n+1||i==j) {
					System.out.println("*");
				}
				else {
					System.out.println(" ");
				}
			}
			System.out.println();
		}
		
	}

}
