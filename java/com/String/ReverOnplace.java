package com.String;

public class ReverOnplace {

	public static String reverse(String s)

	{
		String[] s2 = s.split(" ");

		String result = "";

		for (int i = s2.length - 1; i >= 0; i--) {

			if (i == 0) {

				result += s2[i];

			} else {
				result += s2[i] + " ";

			}

		}
		return result;

	}

	
	
	
	public static void main(String[] args) {

		String str = "amar singh chouhan";

		String string = ReverOnplace.reverse(str);

		System.out.println(string);

	}

}
