
    public class StartsWith 

    {
    	public static void main(String[] args) {

		String str = "amar vivek ankit vipin vikas";

		String[] s1 = str.split(" ");

		String s = "";

		for (int i = 0; i < s1.length;i++)
		{

			s = s1[i];

			if(s.startsWith("a"))

			{

				System.out.println(s);

			}

		}

	}

}
