package com.demoClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();

		l.add("apple");
		l.add("orange");
		l.add("banana");
		l.add("apple");
		l.add("orange");
		l.add("banana");

		System.out.println(l);

		//converting list to set 

		Set<String> set =new HashSet<String>(l);
	
      	System.out.println(set);
	
	}

}
