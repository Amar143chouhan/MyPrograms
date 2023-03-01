package com.String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s = "amar";
		String s1 = "sagar";

		// convert the string into lower case

		String st1 = s.toLowerCase();
		String st2 = s1.toLowerCase();

		if (st1.length() == st2.length()) 
		{

			// convert the strings into character array

			char[] arr1 = st1.toCharArray();
			char[] arr2 = st2.toCharArray();

//now we sort the character array

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			// if sorted array are same or identical then string are anagram

			boolean b = Arrays.equals(arr1, arr2);

			if (b) 
			{

				System.out.println("strings are anagram");

			} else {

				System.out.println("string are not anagram");
			}

		}

	}

}
