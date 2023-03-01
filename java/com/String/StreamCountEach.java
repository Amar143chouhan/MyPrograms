package com.String;

import java.security.Identity;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamCountEach {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 1, 3, 5, 4, 8, 9, 2, 11, 2, 5, 6, 9, 7, 4, 8, 9, 32, 15, 11);

		Map<Integer, Long> map = list.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

		map.forEach((k, v) -> {

			//System.out.println(k + " = " + v);

		});

	      List<Character> asList = Arrays.asList('a','b','c','a','d','c','v','d','f','r','r','a','b','c','v','f','d','d');	
		
           Map<Character, Long> map2 = asList.stream().collect(Collectors.groupingBy(Character::charValue,Collectors.counting()));

             map2.forEach((k,v) -> {
        	   
        	   System.out.println(k+ " =" +v );
        	   
           });
           
	}

}
