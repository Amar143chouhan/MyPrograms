package com.String;

public class StringImp

  {

	   public static void main(String[] args)

	   {

		String s1 ="ABCD";

		String s2 ="DCAB";

		if(StringImp.isRotation(s1, s2))

		{

			System.out.println("String are reverse of each other");

		}

	}

	     public static boolean isRotation(String s1, String s2)
         
	   {

      	 return (s1.length() == s2.length() && (s1 + s2).indexOf(s2) != -1);

	   }

}
