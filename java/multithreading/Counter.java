package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter

{

	// instance variable
//	int count;

	// alternative of synchronized keyword

	AtomicInteger count = new AtomicInteger();

	// we can also make our method synchronized by using synchronized keyword for
	// thread safty

	public void increment() 
	{

		// here to increase the count by one we use incrementandGet method
		count.incrementAndGet();

	}

	public static void main(String[] args) throws Exception

	{

		Counter c = new Counter();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run()

			{

				for (int i = 1; i <= 1000; i++)

				{

					c.increment();

				}

			}
		});

		Thread t2 = new Thread(new Runnable() 
		{

			@Override
			public void run() 
			{

				for (int i = 1; i <= 1000; i++)

				{

					c.increment();

				}

			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(c.count);

	}

}
