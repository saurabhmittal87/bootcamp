package com.ttnd.bootcamp;

public class Recursion {

	/**
	 * Recursive method
	 */
	public static int fibonacci(int number)
	{	if(number == 1 || number == 2)
			{ return 1; }
		return fibonacci(number-1) + fibonacci(number -2); //tail recursion
	}
	
	public static void main(StringDemo...args){
		int number = 5;
		System.out.println("Fibonacci series: ");
		for(int i=1; i<=number; i++)
			{
				System.out.print(fibonacci(i) +" "); 
			}
	}
}
