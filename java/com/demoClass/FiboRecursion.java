package com.demoClass;

public class FiboRecursion {

	static int firstnum = 0;
	static int secondnum = 1;
	static int next = 0;

	public static void Printfib(int value) 
	{

		if (value > 2) 
		{

			next = firstnum + secondnum;

			firstnum = secondnum;

			secondnum = next;

			System.out.print(" "+next);

			Printfib(value - 1);

		}
	}

	public static void main(String[] args) {
     
		System.out.print(firstnum+" " + secondnum);
		
		Printfib(5);

	}
}
