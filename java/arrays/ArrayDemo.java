package arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of the array");

		int size = sc.nextInt();

		int[] arr = new int[size];

		for(int i = 0; i < size; i++) {

			System.out.println("enter the elements");

			arr[i] = sc.nextInt();

		}

		sc.close();

		System.out.println("printing the elements of the array");

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}

	}

}
