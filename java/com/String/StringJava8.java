package com.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringJava8 {
	
	
	
public static void main(String[] args) {
	
	//we have to sum all the numbers in the given array,if odd multiply by 2, if even keep same, 
	//if negative dont consider
	
	int[] arr = {1,2,-3,5,6,-7,8,9, 10};
	
	//first of all we convert the array of integer into list using java8  array.aslist method
	
	List<Integer> list = Arrays.asList(1,2,-3,5,6,-7,8,9, 10);
	
	
	System.out.println(list.stream().map(x ->{
		
		if(x<0 || x%2==0) {
		
			return x;
			  
		  }
		else if(x%2==1) {
			  
			  return x*2;
		
		}
		else {
		
			if(x<0) {
				
				return 0;
			}
		return null;
		  }
	}).collect(Collectors.summingInt(Integer::intValue)));
	
	
	
	
}	
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	


