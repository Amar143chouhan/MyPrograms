package com.String;

import java.util.Arrays;

public class ReverseOnPlace {

	public static void main(String[] args) {

		String string = "amar singh chouhan";

		// first approach

//		char[] array = s1.toCharArray();
//
//		String string = Arrays.toString(array);

		int lastIndexOf = string.lastIndexOf(" ");

		int indexof = string.indexOf(" ");

		String string1 = string.substring(lastIndexOf, string.length());

		String string2 = string.substring(indexof, lastIndexOf);

		String string3 = string.substring(0, indexof);

		String string4 = string1.concat(string2);

		String reverse = string4.concat(string3);

		// System.out.println(string2);

		System.out.println(reverse);
	}

}
