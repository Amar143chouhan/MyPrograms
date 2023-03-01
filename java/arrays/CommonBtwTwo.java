package arrays;

import java.util.HashSet;

public class CommonBtwTwo {

	public static void main(String[] args) 
	{

		int[] arr = { 80, 10, 15, 60, 2, 35 };
		int[] arr1 = { 90, 50, 15, 60, 2, 20 };

//we have to find the common elements between these two arrays
//approach 1
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr1.length - 1; j++)

			{

				if (arr[i] == arr1[j]) {

					System.out.println(arr[i]);

				}

			}

		}

		CommonBtwTwo.findCommon(arr, arr1);
		
		
	}
	// approach 2 :

	public static void findCommon(int[] a, int[] b) {

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length - 1; i++) {

			set.add(a[i]);
		}
			for (int j = 0; j < b.length - 1; j++) {

				if (set.contains(b[j]))
				{
                          
					System.out.println(b[j]);
					
				
			}

		
		}

	
	}
}