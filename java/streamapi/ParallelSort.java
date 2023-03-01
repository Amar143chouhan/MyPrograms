package streamapi;

import java.util.Arrays;

public class ParallelSort {

	public static void main(String[] args) 
	{
	
		
		int [] arr = {10,20,25,35,40,60,40};
		
		Arrays.parallelSort(arr);
		
		Arrays.stream(arr).forEach(s-> System.out.println(s + ""));
	}

}
