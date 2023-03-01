package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumList {
	
	public static void main(String[] args) {
		
		//not so important the problem is wrong 
	
//problem state that single integer value like 45621 and we have t find sum of all its digit		
	List<Integer> list =Arrays.asList(1,2,3,4,5);
	
	
       list.stream().map(s->{
	
	  int sum =0;
		
	   return sum = sum+s;
	
	}).forEach(System.out::print);
	
	
	
	
	}

}
