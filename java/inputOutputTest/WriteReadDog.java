package inputOutputTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteReadDog {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
	
		Dog d1 =new Dog();
		
		
	//serialization	
	FileOutputStream fos = new FileOutputStream("abc.ser");
		
	ObjectOutputStream oos =new ObjectOutputStream(fos);
	
	oos.writeObject(d1);
		
	
	//deserialization
	
	FileInputStream fis =new FileInputStream("abc.ser");
	
	ObjectInputStream ois =new ObjectInputStream(fis);
	
	       Dog d2  =(Dog)ois.readObject();	
		
	       
	       System.out.println(d2.c.r.i );
	}

}
