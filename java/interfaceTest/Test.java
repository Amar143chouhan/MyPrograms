package interfaceTest;

public class Test {

	public static void main(String[] args) {

		AnonymousInterface abc = new AnonymousInterface() 
		{

			@Override
			public void show() 
			{

				System.out.println("welcome");
			}

		};

		abc.show();

	}
}
