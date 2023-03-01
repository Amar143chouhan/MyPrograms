package com.String;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthGreterthenFive {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("welcome", "springboot", "hello", "java", "python", "javascript");


	List<String> list2 = list.stream().filter(s-> s.length()>5).collect(Collectors.toList());

	//we can also print the count of String >5
	
	list.stream().filter(s-> s.length()>5).forEach(System.out::println);	
	
	//System.out.println("number of string having length greater then 5 is : " +count);
	
	//System.out.println(list2);
	
	}

	

	}

