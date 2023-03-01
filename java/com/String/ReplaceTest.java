package com.String;

public class ReplaceTest {

	public static void main(String[] args) {

		String s = "this is java";

		//String s2 = s.replace('m', 'x');

		//
		// System.out.println(s2);

	
		String s1 = s.replaceAll("s(.*)", "X");

		System.out.println(s1);

		String[] split = s.split("m");

		for (String str : split) {

		//	System.out.println(str);

}
//		System.out.println(s.substring(7));	
		
	//	 System.out.println(s.indexOf('p'));
		
	}

}
