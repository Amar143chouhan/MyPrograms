package lamdaExpression;

public class TestArethmetic {

	public static void main(String[] args) {
		

		Arthemetic c = (a,b) ->	{ return a+b;};

		int i = c.add(5,10);
		
		System.out.println(i);

	}
}

	



