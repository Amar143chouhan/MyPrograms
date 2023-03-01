package com.String;

public class EachStringLength {

	public static void main(String[] args) {

		String s = "this is java";

		String[] s1 = s.split(" ");

		for (String str1 : s1) 
		{

			int countLength = EachStringLength.countLength(str1);

			System.out.println("length of  word"+" "+str1.toUpperCase()+" "+" in the given string is :=>" + countLength);
			

		}

	}

	public static int countLength(String str) {

		int len = str.length();

		return len;
	}

}
