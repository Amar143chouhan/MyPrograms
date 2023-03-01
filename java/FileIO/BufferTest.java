package FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferTest {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("abc.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write('c');

		bw.newLine();

		char[] ch = { 'a', 'b', 'c', 'd' };

		bw.write(ch);

		bw.newLine();

		bw.write("softwere solutions");

		FileReader fr = new FileReader("abc.txt");

		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();

		while (line != null) 
		{

			System.out.println(line);

			line = br.readLine();

		}

      		bw.close();

	}

}
