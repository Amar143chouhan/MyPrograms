package FileIO;

import java.io.*;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args)  throws IOException
	{
	/* filereader object read data char by char which is no convinient way and not recomended instad of these we can 
	 *use buffer reader and bufferwriter.while writing data with filewriter we have to mention line seperator manully 
	 *and (/n) varies system to system.to overcome these we should go for buffer reader and writer  
     **/
		
		File f = new File("abc.txt");

		
		FileReader fr =new FileReader(f);
		
		char[] ch1 = new char[(int) f.length()];


		 fr.read(ch1);
		
		for (char ch2: ch1 ) 
		{
			System.out.print(ch2);
		}

	
		
		
		

		
		
	}

}
