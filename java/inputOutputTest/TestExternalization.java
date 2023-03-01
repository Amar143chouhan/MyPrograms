package inputOutputTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ExternalizationDemo exd = new ExternalizationDemo("amar", 10, 20);

		FileOutputStream fos = new FileOutputStream("abc.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(exd);

		System.out.println("dseralozation started");

		FileInputStream fis = new FileInputStream("abc.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		ExternalizationDemo exd1 = (ExternalizationDemo) ois.readObject();

		System.out.println(exd1.s + "  " + exd1.i);

	}

}
