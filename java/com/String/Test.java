package com.String;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		String str ="WWWWAAAAEXXXXXXD";
		
		String[] arr = str.split("");
		
		
//		String s= "123";
//		
//		int i = Integer.parseInt(s);
//		
//		String s1 = String.valueOf(i);
//		
//		
		
		List<String> list = Arrays.asList(arr);		
		
		
		
	          long l = list.stream().filter(x-> x.equals(x)).count();
		 
	
	          System.out.println(l);
	}
		
}	
		



