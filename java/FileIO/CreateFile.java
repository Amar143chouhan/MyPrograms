package FileIO;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile 

{
	
	public static void main(String[] args) throws IOException
    
	{  
		File f = new File("input.txt");

		f.createNewFile();

		File f1 = new File("output.txt");

		f1.createNewFile();

		File f2 = new File("delete.txt");

		f2.createNewFile();

		FileWriter fr = new FileWriter("input.txt");

		fr.write(777);

		FileReader fr1 = new FileReader("input.txt");

		int i = fr1.read();

		while (i != -1) 

		{

			System.out.println((char)i);

			i = fr1.read();

		}

	}

}
