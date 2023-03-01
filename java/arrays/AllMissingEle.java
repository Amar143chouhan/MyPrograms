package arrays;

public class AllMissingEle {

	public static void main(String[] args)

	{

		int[] arr = { 1, 2, 3, 5, 7, 9 };

		int[] arr1 = { 1, 2, 6, 8 };

		missing(arr1, arr);

	}

	public static void missing(int[] a, int[] b) {

		for (int i = 0; i < a.length; i++) 
		{

			boolean flag = true;

			for (int j = 0; j < b.length; j++)

			{

				if (b[j] == a[i])

				{
					flag = false;

				}

			}

			if(flag) 
			{
				
				System.out.println(" "+a[i]);
			}
		}
	}
}
