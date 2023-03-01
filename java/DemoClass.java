import java.lang.reflect.*;

public class DemoClass {
	
	

	  public String name;

	  public int id;

	  public DemoClass() 
	  {

		  this.name = "Ayush";
	    
		  this.id = 0;
	  }

	  public DemoClass(String name) {

		  this.name = name;
	    
		  this.id = 0;
	  }

	  public DemoClass(String name, Integer i) 
	  {

		  this.name = name;
	    
		  this.id = i;
	  }

	  public static void main(String args[]) 
	  {
	    try {
	      // Load the class

	    	Class.forName("DemoClass");

	      // Uset the getConstructor() method of Constructor class
	      // to access an existing constructor

	      // Afterwards use the newInstance() method to 
	      // create an instance of the class
	      
	      // We can pass arguments as well in 
	      // newInstance() method of Constructor class
	      Constructor c1 = DemoClass.class.getConstructor(String.class);

	      DemoClass obj1 = (DemoClass) c1.newInstance("Riya");

	      // Print necessary attributes
	      System.out.print(obj1.name + ", ");

	      System.out.println(obj1.id);

	      Constructor c2 = DemoClass.class.getConstructor();

	      DemoClass obj2 = (DemoClass) c2.newInstance();
	      
	      System.out.print(obj2.name + ", ");
	      
	      System.out.println(obj2.id);

	      Constructor c3 =
	        DemoClass.class.getConstructor(String.class, Integer.class);

	      DemoClass obj3 = (DemoClass) c3.newInstance("Robin", 1);
	      
	      System.out.print(obj3.name + ", ");
	      
	      System.out.println(obj3.id);
	  } 
	    catch (Exception e) 
	  
	    {
	    
	    	System.out.println(e);
	    
	    }
	  
	  }
	
}



