package FileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException

	{
		FileWriter fw = new FileWriter("abc.txt");

		// int the file contructor we can either pass the single char value or we can
		// also pass the
		// correswponding unicode value

		fw.write(97);

		fw.write('a');

		fw.write('\n');

		fw.write("amar\n chouhan");

		fw.write('\n');

		char[] ch = { 'a', 'b', 'c', 'd' };

		fw.write(ch);

		fw.write('\n');

		FileReader fr = new FileReader("abc.txt");

		int i = fr.read();

		while (i != -1)

		{

			System.out.println((char) i);

			i = fr.read();

		}

		File f = new File("abc.txt");

		char[] ch1 = new char[(int) f.length()];

		FileReader frd = new FileReader("abc.txt");

		frd.read(ch1);

		for(char ch2 : ch1) 
		{

			System.out.println(ch2);
		}

		// method flush ensure that the total data including the last char will be
		// written to the file
		fw.flush();

//for closing the stream
		fw.close();

	}

}
