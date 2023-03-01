package inputOutputTest;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccount {

	public static void main(String[] args) throws IOException, ClassNotFoundException

	
	{

		Account ac = new Account();

		System.out.println(ac.username + " " + ac.pwd+""+ac.pin);

		FileOutputStream fos = new FileOutputStream("abc.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(ac);

		FileInputStream fis = new FileInputStream("abc.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Account ac1 = (Account) ois.readObject();

		System.out.println(ac1.username + "   " + ac1.pwd+" "+ac1.pin);

		
	}

}
