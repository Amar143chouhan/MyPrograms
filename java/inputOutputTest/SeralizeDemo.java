package inputOutputTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SeralizeDemo 

{

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	
	{


		System.out.println("serialization started");

		//when we  create the obj of the child class
		//then both first parent and then child class constructor called
		
		Dogg d = new Dogg();

		d.i =888;
		
		d.j=999;
		
		FileOutputStream fos = new FileOutputStream("abc.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(d);

		System.out.println("dseralozation started");

		FileInputStream fis = new FileInputStream("abc.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Dogg d1 = (Dogg) ois.readObject();

		System.out.println(d1.i + "  " + d1.j);

	}

}
