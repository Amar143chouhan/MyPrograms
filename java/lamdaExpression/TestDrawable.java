package lamdaExpression;

public class TestDrawable implements Drawable

{

	public static void main(String[] args) 
	{

		Drawable.test();

		TestDrawable t =new TestDrawable();
		
		
		t.display();
		
		
		Drawable d = new Drawable() {

			@Override
			public void show() {

				System.out.println("override show");
			}

		
			public void display() {

				System.out.println("override diaplay");

			}

			@Override
			public int draw(int width) {
				// TODO Auto-generated method stub
				return 0;
			}

		};

	}

	// @Override
//			 public void draw(int width) {
//		     TODO Auto-generated method stub
//				
//				System.out.println("override draw through traditional approach" + width);
//				
//			}
//		
//		};
//
//		d.draw(5);
	// override using lamda expression

	// (argumentlist) -> implimentation{}

	@Override
	public int draw(int width) {

		return 0;
	}

}