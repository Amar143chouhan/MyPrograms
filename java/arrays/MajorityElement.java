package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement
{
    public static void main(String[] args) 
	
    {
    	int arr[] = { 3, 6, 3, 2, 4, 3, 5, 3, 9, 8 };

		int size = arr.length;

		//System.out.println(size);

		Majority(arr, size);
   }

	public static void Majority(int[] arr, int s) 
	{

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : arr) 
		{

			Integer val = map.get(i);

			if (val == null) 
			{

				map.put(i, 1);

			}

			else 
			{

				map.put(i, val + 1);
			}

		}

 //now to find which element comes more times we need to iterate all elements
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) 
		 {
			if(entry.getValue()>s/2) 
			
			{

			 System.out.println( entry.getValue());

			}

		}

	}

}
