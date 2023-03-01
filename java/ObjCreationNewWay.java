
public class ObjCreationNewWay {

       	public String name;

	// Default or no-arg constructor

       	ObjCreationNewWay() {

		name = "Ayush";
	}

	public static void main(String[] args) {
		try {
			// Load the required class

//		  loads the class named "ObjCreationNewWay" and stores the reference in c

			Class c = Class.forName("ObjCreationNewWay");

			// Create an instance of the class loaded using newInstance() method

			ObjCreationNewWay s = (ObjCreationNewWay)c.newInstance();

			System.out.println(s.name);

		} catch (Exception e) {

			System.out.println(e);
		}
	}

}
