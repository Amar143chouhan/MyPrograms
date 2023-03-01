package com.String;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		String s = "i m a java programmer from rays institute";

		String str1 = "";
		String rev = "";
		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) {

			if (s1[i].length() == 4) {

				str1 = s1[i];

				System.out.println(str1);
//
//				for(int j=str1.length()-1;j>=0;j--)
//				{
//						
//						
//						rev+= str1.charAt(j);
//						
//				
//						
//				}
//
//              
				StringBuffer sb = new StringBuffer(str1);

				System.out.println(sb.reverse());
			}

		}

	}

}
