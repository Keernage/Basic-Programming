package com.ilpbatch4.utility;

public class FactorOfANumber {

	public static void main(String[] args) {
		int input = 10;
		factorial(input);

	}

	private static void factorial(int input) {
		int factorial = 1;
		for(int i=1;i<=input;i++)
		{
			factorial = factorial * i;
		}
		System.out.println("Factorial is" +factorial);
	}
	

}
