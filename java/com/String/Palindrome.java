package com.String;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 

	{

		System.out.println("Enter a string to check :");

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; --i){
        {

			reverse += str.charAt(i);

		}

		if (reverse.equals(str)) 
		
		{


			System.out.println("String is palindrome ");

			
		}
		else 
		
		{

			System.out.println("etered String is not palindrome");

		}

		System.out.println(reverse);

	}

}}
