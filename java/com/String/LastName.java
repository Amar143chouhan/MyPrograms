package com.String;

public class LastName {
	
	
	public static void main(String[] args) {
	
		
		String str= "amar chouhan";
		
		
		int ind = str.indexOf(" ");
		
		System.out.println(ind);
		
		
		String firstname = str.substring(0, ind);
		
		String lastname =str.substring(ind, str.length());
		
		
	System.out.println("firstname is : " + firstname +" "+"lastname is : " +lastname  );
	
	}
	

}
