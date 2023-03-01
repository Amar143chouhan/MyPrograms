package arrays;

import java.util.stream.IntStream;

        public class Removechar {

    	public static void main(String[] args) 
	
      	{

		String s = "javaprogramming";

		String string = s.replace("c", "");

		System.out.println(string);

		char ch = 'a';

		String string2 = Removechar.removeChar(s, ch);

		System.out.println(string2);
	}

	// second approach

	   public static String removeChar(String s, char ch) 
	   {

	   String Sfinal = "";

	   for(int i = 0; i < s.length(); i++)
	   {

			if(s.charAt(i) != ch)

			{

				Sfinal += s.charAt(i);

			}

		}

		return Sfinal;

	}

}
