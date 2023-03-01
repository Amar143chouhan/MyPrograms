package com.demoClass;

public class TestReverse {

	public static void main(String[] args) {

		String s = "malayalam";

		String rev = "";

		for(int i=s.length()-1;i>=0;i--) 
		{

			rev += s.charAt(i);

			}


		if(rev.equals(s)) 
		{
			
			
			System.out.println(s+" "+"palindrome");
		}
		else {
			
			System.out.println(s+ " is not  palindrome");
		}
	
	}
}
