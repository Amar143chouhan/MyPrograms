package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExtractor {

	public static void main(String[] args) throws IOException 
	{

		PrintWriter pr = new PrintWriter("output.txt");

        File f =new File("input.txt");	
		
		BufferedReader br = new BufferedReader(new FileReader(f));

		String line = br.readLine();

		while (line != null) 
		{

			boolean available = false;

	        File f1 =new File("delete.txt");	

			BufferedReader br1 = new BufferedReader(new FileReader(f1));

			String target = br1.readLine();

			while (target != null) {

				if (target.equals(line)) {

					available = true;

					break;

				}

				target = br1.readLine();

			}
			if(available = false)
			{

				pr.println(line);

			}

			line = br.readLine();
		}
		pr.flush();
	}

}
