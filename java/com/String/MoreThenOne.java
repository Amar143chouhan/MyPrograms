package com.String;

import java.util.HashSet;

public class MoreThenOne {
	
	//problem is to print the character in a given string which occour more then one timetring
	public static void main(String[] args) {
		
	
	String s1= "abcdab";
	
	HashSet<Character> set =new HashSet<Character>();
 
	char[] arr = s1.toCharArray();
	
	
	for ( char ch:arr) {
		
		
		if(set.contains(ch)) {
	
			System.out.println(ch);
		}
		
		else {
			
			set.add(ch);
			
			
		}	
	}
	
	
	
	}

























}
