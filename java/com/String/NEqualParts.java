package com.String;

public class NEqualParts {

	public static void main(String[] args) {

		String s = "abcdef";

		int n = 3;

		int l = s.length();

		int parts = l / n;

		String[] stringparts = new String[n];

		int temp = 0;

		if (l % n != 0)

		{

			System.out.println("string can not divide into n equal parts ");

		}
		else 
		{   
			for (int i = 0; i < l; i = i + parts)

			{

				String part = s.substring(i, i + parts);

				stringparts[temp] = part;

				temp++;

			}

		}

		for(int i = 0; i < stringparts.length; i++)
		{

			System.out.println(stringparts[i]);

		}

	}

}
