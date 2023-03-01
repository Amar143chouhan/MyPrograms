package com.demoClass;

 class Outer

 {
	void show()

	{

		System.out.println("outer class show mehtod");

	}

	class inner

	{
		void display()

		{

			System.out.println("inside the inner class dispaly");

		}

	}
}

class Innerdemo {

	public static void main(String[] args)

	{

		Outer obj = new Outer();

		obj.show();

		Outer.inner obj1 = obj.new inner();

		obj1.display();

	}

}
