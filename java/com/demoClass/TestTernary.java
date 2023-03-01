package com.demoClass;

public class TestTernary {

	public static void main(String[] args) {

		int i = 10;

		// boxing premitive datatype
		Integer obj = new Integer(i);

		// unboxing => converting it into integer again
                       
		int j = obj.intValue();
		
		System.out.println(j);
		
		int k= 20;
		
	  int x = i > k ? 2:4; 
	    	
	    	
	  System.out.println(x);
	    }   
		
		
		
		
	}

