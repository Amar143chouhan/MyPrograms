package com.String;

public class RemoveWhiteSpaces {
	
	
	
	public static void main(String[] args) {
		
	
	String s1 = "j  a  va  s ta  r ";
	
	//trim method can only remove leading and trialing space of the string 
	String trimmedstring = s1.trim();
	
	System.out.println(trimmedstring);
	
	//using \\s in replaceall method regex \\s is a unicode wich represent single space
	//so here by using \\s we replace all single space with non space
	
	String string = s1.replaceAll("\\s", "");
	
	System.out.println(string);
	
	}

}
