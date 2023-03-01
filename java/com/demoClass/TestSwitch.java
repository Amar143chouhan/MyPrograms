package com.demoClass;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
	
		System.out.println("enter first number ");
		
		Scanner sc = new Scanner(System.in);
	

		int i = sc.nextInt();

		System.out.println("enter the operator ");
		
		String op = sc.next();
		
		System.out.println("enter second number ");
		
		int j = sc.nextInt();
		  		

		
		
		switch (op) 
		
		{
		
		case "+"  
		 :
			System.out.println(i+j);
			
			break;
		
		case "-":  
			
			System.out.println(i-j);
			
			break;
		case "*":  
			
			System.out.println(i*j);
			
			break;
		
		case "/":  
			
			System.out.println(i/j);
			
			break;

     		default:

			System.out.println("invalid number");
			
			break;
		}
		
		
		
		
		
		
	}

}
