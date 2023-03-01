package com.demoClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopCompare {

	public static void main(String[] args) {

		List<Laptop> l = new ArrayList<Laptop>();

		l.add(new Laptop("HP", 46000, 4));

		l.add(new Laptop("Dell", 45000, 6));

		l.add(new Laptop("asus", 55000, 8));

		l.add(new Laptop("lenovo", 40000, 12));

		Comparator<Laptop> c1 = new Comparator<Laptop>()
		{

			@Override
			public int compare(Laptop o1, Laptop o2) 
			{

				if (o1.getRam() > o2.getRam()) 
				{

					
					return 1;

				} 
				else

					return -1;
			}
		};

		Collections.sort(l, c1);

		// enhanced for loop
		for (Laptop laps : l) {

			System.out.println(l);

		}

	}

}
