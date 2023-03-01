package inputOutputTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Animal {

	int i = 10;

	public Animal()
	{
		System.out.println("animal default constructer called");
	}

	
	
	
	class Dog extends Animal implements Serializable

	{

		int j = 20;

		public Dog() {

			System.out.println("dog default constructer called");
		}

	}


	}

