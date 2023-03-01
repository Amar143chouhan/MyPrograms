package com.String;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountEven {

	public static void main(String[] args) {
		
	

	
  List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
  
    List<Integer> list2 = list.stream().filter(x-> x%2 == 0).map(x->
          
    	x*2).collect(Collectors.toList());
   
 System.out.println(list2);
  
  
	
}
}