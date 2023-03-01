package interfaceTest;

public class AnonymousTest 
{

	public void show() 
	{


		System.out.println("hi in class AnonymousTest");

	}

	public static void main(String[] args) {

		AnonymousTest a = new AnonymousTest()
		{

			public void show()

			{

				System.out.println("overriding the main class method show");

			}

		};

		a.show();

	}
}
