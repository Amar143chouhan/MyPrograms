package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DeleteStreamDemo {
	
	public static void main(String[] args) {
		
	int [] numbers = {1,2,3,4,5,7,8};

	System.out.println("original array is : "+ Arrays.toString(numbers));

	int index = 3;
	
	int[] array = IntStream.range(0, numbers.length).

			filter(i -> i!=index).

			map(i -> numbers[i]).toArray();

	    
	
	System.out.println("newly array is " + Arrays.toString(array));
	
	
	
	
	
	
	
	
	
	}

}
