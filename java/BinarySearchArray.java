
   public class BinarySearchArray {

	public static void main(String[] args) 

	{

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		int fir = 0;

		int las = arr.length - 1;

		int kee = 70;

		BinarySearchArray.binarySearch(arr, fir, las, kee);

	   }

	public static void binarySearch(int[] arr, int first, int last, int key) 
	{

		while (first <= last) 
		{

			int mid = (first + last) / 2;

			if (arr[mid] < key) {

				first = mid + 1;

			}

			else if (arr[mid] == key) 
			
			{

				System.out.println("element found  at index " + mid);

				break;

			}
			
			else 
			
			{

				if (arr[mid] > key) 

				{

					last = mid - 1;

				}

			}

		}

		if (first > last) 
		{

			System.out.println("element not found in the array");
		}

	}

}
