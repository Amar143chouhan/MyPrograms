package com.String;

public class PalindromeSentance {

	public static void main(String[] args) 
	{

		String str1 = "My name is nitin and i know malayalam";

		String[] s1 = str1.split(" ");

		for (String s2 : s1) {

			if (PalindromeSentance.ispalindrome(s2)) {

				System.out.println(s2 + " palindrome");

			}

			else {

				System.out.println("not palindrome");
			}
		}
	}

	public static boolean ispalindrome(String s) {

		int i1 = 0;
		int i2 = s.length() - 1;

		while (i2 > i1) 
		{

			if (s.charAt(i1) != s.charAt(i2)) 
			{

				return false;

			} else {

				i1++;
				i2--;
			}
		}
		return true;
	}

}