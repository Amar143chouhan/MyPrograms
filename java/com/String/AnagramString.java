package com.String;

import java.util.HashMap;

public class AnagramString {

	public static boolean isAnagram(String s1, String s2) {

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();

		int count;

		for (int i = 0; i < s1.length(); i++) {

			if (map1.containsKey(s1.charAt(i))) 
			{

				count = map1.get(s1.charAt(i));

			}

			else {

				map1.put(s1.charAt(i), 1);
			}

		}
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		int count1;

		for (int i = 0; i < s2.length(); i++) {

			if (map1.containsKey(s2.charAt(i)))
			{

				count = map1.get(s2.charAt(i));

			}

			else {

				map1.put(s2.charAt(i), 1);
			}

		}

		if(map1.containsValue(map2.values()))

		{
			return true;

		} else

		{
			return false;
		}

	}

	public static void main(String[] args) {

	
	String str ="aababcbcc";
	
	String str1="bbbccaaac";
	
    if( isAnagram(str, str1)) {
    	
    	System.out.println(" both strings are anagram" );
        	
    }else
    	
    {
    	
    	System.out.println(" both strings are not anagram" );
    	
    	
    	
    }	
	
}
}
