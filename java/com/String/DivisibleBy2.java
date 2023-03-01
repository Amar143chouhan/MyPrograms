package com.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DivisibleBy2 
{

	public static void main(String[] args) {
		
   List<Integer> list = Arrays.asList(3,5,7,11,44,23);
	
    List<Integer> list2 = list.stream().map(x -> {
        
	        if(x % 2 == 0) {
	   
	        	return x; 
	}else 
	{
			return 0;
	
	}}).collect(Collectors.toList());  	
	
	if(list2.contains(0)) {
		
		System.out.println("all elements in the list are not divisible by 2");
		
		
	}else
	{
		System.out.println("all number int the list are divisible by 2");
	}
	 
	
	//second approach 
	
         	boolean match = list.stream().allMatch(s -> s % 2 == 0);	
	
	          
	          if(match) {
	        	  
	        	  System.out.println("all number int the list are divisible by 2");
	        	  
	          }else
	          {
	        	  System.out.println("all number int the list are not divisible by 2");
	          }

	          
	          
	          boolean match1 = list.stream().anyMatch(s -> s% 2==0);
	      
	          if(match1) {
	        	 
	        	  System.out.println("at least one number is divisible by 2");
	        	  
	          }
	          else {
	        	  
	        	  
	        	  System.out.println("not any number is divisibke by 2");
	          }
	        
	}
	
	
	      
	    
	
	
}
