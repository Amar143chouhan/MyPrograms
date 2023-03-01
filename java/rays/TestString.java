package rays;

public class TestString {

	public static void main(String[] args) 
	{

		String s = "welcome to java programing bhupenpatidar";

		String str = "";

		String str1 = "";

		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) 
		{

			str = s1[i];

					
			for (int j = i + 1; j < s1.length; j++) 
			{

				str1 = s1[j];

			}

		}
			if (str.length() > str1.length()) 
			{
                  
				revstr(str);
				
			      	
			}
			else 
			{
				
				
				revstr(str1);
			 
			}

		}

	

	public static void revstr(String s) {

		StringBuffer sb = new StringBuffer(s);

		System.out.println(sb.reverse());

	}

}
