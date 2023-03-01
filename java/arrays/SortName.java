package arrays;

import java.util.Scanner;

public class SortName {

	public static void main(String[] args) {

		String temp = "";

		System.out.println("enter the no. of elements to sort");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] names = new String[n];

		System.out.println("enter the elements");

		for (int i = 0; i<n; i++) {

			names[i] = sc.nextLine();

		}
		for (int i = 0; i <n; i++) {

			for (int j = i + 1; j <n; j++) {

				if (names[i].compareTo(names[j]) > 0) {

					temp =names[i];
					
					names[i] =names[j];
					
					names[j]=temp;
					
				}
			}

		}

		 for(String s :names ) {
			 
			 System.out.println( s);
			 
		 }
	}

}
