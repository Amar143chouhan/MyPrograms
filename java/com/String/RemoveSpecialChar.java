package com.String;

public class RemoveSpecialChar {

	public static void main(String[] args) {

		String s = "#amar%singh&*%chouhan@!";

		int count = 0;

		String CharRemove = "";

		for (int i = 0; i < s.length(); i++) {

			if (!Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i))

					&& !Character.isWhitespace(s.charAt(i))) {

				count++;

			} else {

				CharRemove += s.charAt(i);

			}

		}

		System.out.println("string after removing special characters is:" + " " + CharRemove + " "
				+ "and the number of special characters in string is " + count);
	}

}
