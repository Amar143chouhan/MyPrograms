package FileIO;

import java.io.File;
import java.io.IOException;

public class NewFile {

	public static void main(String[] args) throws IOException {

		int count = 0;

		File f = new File("D:\\amar\\StringProgrms\\com.java");

//		/f.createNewFile();

		String[] s1 = f.list();

		for (String s : s1)

		{

			// we can get list of files in the string variable but we can't perform the
			
			// operation on
			
			// string variable so for fetching the files we use the following code

			File f1 = new File(f, s);

			if (f1.isFile())

			{
				count++;

				System.out.println(s);
			}

			System.out.println("total number of count " + count);

		}

	}

}
