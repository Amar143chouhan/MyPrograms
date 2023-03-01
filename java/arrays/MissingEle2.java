package arrays;

import java.util.HashSet;
import java.util.Set;

public class MissingEle2 {

	public static void printMissing(int[] a) 
	{

		int n = a.length+1;

		Set<Integer> set = new HashSet<Integer>();

		for (int arr : a)
		{

			set.add(arr);

		}

		for (int i = 0; i < n; i++)

		{
			if (!set.contains(i)) {

				System.out.println(i);

			}

		}

	}

	public static void main(String[] args) {
		
		

		int[] arr = { 1, 2, 4,6 , 7, 9 };

		 printMissing(arr);
		 
		
		
	}
}
