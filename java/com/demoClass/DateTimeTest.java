package com.demoClass;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeTest {

	public static void main(String[] args)

	{

		LocalDate currentdate = LocalDate.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD/MM/YY");

		String string = currentdate.format(formatter);

		System.out.println(string);

		String s = "amar chouhan";

		String[] split = s.split("");

		char[] charArray = s.toCharArray();

		//enhanced for loop
	
		for(char c :charArray) 
		{
			
			System.out.print(c);
		}
		
		
		for (int i = 0; i < split.length; i++) 
		{

			System.out.print(split[i]);

		}

	}

}
