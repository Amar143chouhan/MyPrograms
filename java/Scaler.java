
import java.io.*;

class Scaler implements Serializable {

	int id;
	String name;

	// Default constructor
	Scaler(int i, String s) {
		this.id = i;
		this.name = s;
	}
}

class Main {

	public static void main(String[] args) {

		Scaler serializedObj = new Scaler(81, "Harsh");

		// Specified file name (must have extension .ser)

		String filename = "file.ser";

		/*-----------------Serialization----------*/
		try {
			// Saving of object in the file

			FileOutputStream file = new FileOutputStream(filename);

			ObjectOutputStream out = new ObjectOutputStream(file);

			// Serialize object
			
			out.writeObject(serializedObj);

			// Close the ObjectOutputStream
			out.close();

			// Close the file
			file.close();

			System.out.println("Object serialized...");

		} catch (Exception e) {
			System.out.println(e);
		}

		Scaler deserializedObj = null;
		/*-----------------Deserialization--------*/
		try {
			// Reading an object from a file

			FileInputStream file = new FileInputStream(filename);

			ObjectInputStream is = new ObjectInputStream(file);

			// Deserialize object

			deserializedObj = (Scaler) is.readObject();

			// Closes the ObjectInputStream

			is.close();

			// Closes the file

			file.close();

			System.out.println("ID = " + deserializedObj.id);
			System.out.println("Name = " + deserializedObj.name);
			System.out.println("Object deserialized...");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
