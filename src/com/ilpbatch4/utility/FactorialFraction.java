package com.ilpbatch4.utility;

public class FactorialFraction {

	public static void main(String[] args) {
		int input = 3;
		factorialFraction(input);

	}
	private static int factorial(int input) {
		int factorial = 1;
		for(int i=1;i<=input;i++)
		{
			factorial = factorial * i;
		}
		return factorial;
	}

	private static void factorialFraction(float input) {
		float factFrac = 0;
		for(int i=1;i<=input;i++)
		{
			factFrac = factFrac + (float)i/ (float)factorial(i);
		}
		System.out.println("Sum of Factorial is =" +factFrac);
		
	}

}
