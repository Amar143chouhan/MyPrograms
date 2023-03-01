package inputOutputTest;

import java.io.FileInputStream;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {

	String username = "amar";

	transient String pwd = "aakash";

	transient int pin = 1234;

	private void writeObject(ObjectOutputStream oos) throws IOException

	{
		oos.defaultWriteObject();

		String Epwd = "123" + pwd;

		int pin1 = 4343 + pin;

		oos.writeObject(Epwd);

		oos.writeInt(pin1);
	}

	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {

		ois.defaultReadObject();

		String epwd = (String) ois.readObject();

		pwd = epwd.substring(3);

		int pinn = ois.readInt();

		int pin = 4343 - pinn;
               
	}

}
