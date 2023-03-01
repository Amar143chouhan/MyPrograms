package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThirdHighest {

	public static void main(String[] args) {
	
		Integer [] arr = {4,2,9,8,5,7,6};		
	  	
	     List<Integer> list = Arrays.asList(arr);
		
	    //thee will sort the given list in ascending order
	     
	     //list.stream().sorted().forEach(System.out::print);
	     
	    list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::print);
	
	    
	     
	}

}
