package com.String;

public class SwapString {

	public static void main(String[] args) {

		
		
		String s1= "amar";
		
		String s2 ="chouhan";
		
		
		  System.out.println("String  before swapping is" + s1 );
		  System.out.println("String before swapping is" + s2 );
		
		
		s1 =s1+s2;
		
		
	    s2 =s1.substring(0,(s1.length()-s2.length()));
		
	     s1 =s1.substring(s2.length()); 
		
		
	  System.out.println("String after swapping is" + s1 );
	  System.out.println("String after swapping is" + s2 );
	  
		
		
		
		
		
		
		
		
		
		
	}

}
