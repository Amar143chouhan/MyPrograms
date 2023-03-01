package streamapi;

import java.util.Arrays;

public class ArraysElement {

	public static void main(String[] args) {
	
		int[] arr = { 1, 2, 3, 5, 7, 9 };

		int[] arr1 = { 1, 2, 6, 8 };
		
		Arrays.stream(arr).filter(x-> Arrays.stream(arr1).anyMatch(y-> y==x)).distinct().forEach(System.out::print);

		}

}
