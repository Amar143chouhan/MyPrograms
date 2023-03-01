package lamdaExpression;

@FunctionalInterface
public interface Drawable 
{

	int draw(int width);

	default void show() 
	{

		System.out.println("first default");

	}

 	default void display() 
 	{

		System.out.println("second default");

	}

       static void test() 
 	{
 		
 		
 		System.out.println("test run");
 	}
 	
}
