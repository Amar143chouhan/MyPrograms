package arrays;

   public class MisElement2 
   
   {
	   public static int miselement(int arr[]) 
	   {

		int sum = 0;

		for (int i = 0; i <= arr.length - 1; i++) 
		{

			sum = sum + arr[i];

		}

		return sum;

	}

	public static void main(String[] args) 
	{

		int arr1[] = { 4, 8, 1, 3, 7 };

		int arr2[] = { 7, 4, 3, 1 };

		int s1 = miselement(arr1);

		int s2 = miselement(arr2);

		int s3 = s1 - s2;

		System.out.println(s3);

	}

}