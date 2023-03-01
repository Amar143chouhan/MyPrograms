package arrays;

public class MisEleBetTwo {

	static int misnum(int[] arr, int[] arr2, int n) {

		// minnum declear with default value

		int misnum = 0;

		// first array is of size n

		for (int i = 0; i < n; i++) {

			misnum = misnum ^ arr[i];

			for (int j = 0; j < n - 1; j++) {

				misnum = misnum ^ arr2[j];

			}

		}
		return misnum;

	}

	public static void main(String[] args) {

		int arr[] = { 4, 8, 1, 3, 7 };

		int arr1[] = { 7, 4, 3 };

		int n = arr.length;

		System.out.println("missing number = " + misnum(arr, arr1, n));

	}
}