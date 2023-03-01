
public class CloneTest  implements Cloneable {

  @Override
  protected Object clone() throws CloneNotSupportedException {
  
	  return super.clone();
  }

  String name = "Roni";

  int id = 51;

  public static void main(String[] args) {
	 
	  CloneTest obj1 = new CloneTest();

    try {

    	CloneTest obj2 = (CloneTest) obj1.clone();

      System.out.println(obj2.name);

      System.out.println(obj2.id);
    } 
    catch (Exception e) {
    
    	System.out.println(e);
    }
  }
}



