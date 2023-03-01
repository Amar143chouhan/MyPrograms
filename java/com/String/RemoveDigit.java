package com.String;

public class RemoveDigit {

	public static String removeDigit(String s) {

		String result = "";

		for (int i = 0; i < s.length(); i++) {

			if (!Character.isDigit(s.charAt(i))) {

				result += s.charAt(i);
			}

		}
		return result;
	}

	
	public static void main(String[] args) 
	{
		String s1 ="amar124singh456Chouhan12";
		
	        String s2 = removeDigit(s1);	
	
		
		System.out.println(s2);
		
		
	}
	
	
	
}
