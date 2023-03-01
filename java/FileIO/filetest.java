package FileIO;

import java.io.File;
import java.io.IOException;

public class filetest 

{

	public static void main(String[] args) throws IOException

	{		
        //in the following line we create the java file object(f) 
       //which refer to the abc.txt file if it 
       //exist. we can check it with file exists() method		

		File f = new File("abc.txt");

		System.out.println(f.exists());

		// if we want to create a physical file then we have to write command

		f.createNewFile();

		System.out.println(f.exists());

		// for creating a new directory we write

		File f1 = new File("xyz123");

		f1.mkdir();

		// to create a file xyz.txt in the directory xyz123 we use

		File f3 = new File("xyz123", "xyz.txt");

		// or we can also use the reference of the direcory

		// File f4 =new File(f1, "xyz.txt");

		f3.createNewFile();

		String[] list = f3.list();

		for (String s : list)
		{

			File f4 = new File(f3, s);

			if (f4.isFile())
			{

				System.out.println(s);
			}

		}

	}

}
