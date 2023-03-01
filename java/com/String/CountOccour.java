package com.String;

import java.util.HashMap;
import java.util.Map;

public class CountOccour {

	public static void main(String[] args) {

		String str = "amar chouhan";

		// splitting to find the word

		int k;

		for (char c = 'a'; c <= 'z'; c++)

		{

			k = 0;

			for (int i = 0; i < str.length(); i++) {

				if (c == str.charAt(i)) {

					k++;
				}
			}

			if (k != 0) 
			{
				System.out.println(c + " word occour time : "+k);
			}
		}
	}
}

//		String arr[] = str.split("");
//
//		int count = 1;
//
//		HashMap<String, Integer> hm = new HashMap<String, Integer>();
//
//		for(int i = 0; i < arr.length; i++) {
//
//			if(hm.containsKey(arr[i]))
//
//			{
//				
//				hm.put(arr[i], count++);
//
//			}
//
//			else
//			
//			{
//
//				hm.put(arr[i], count);
//
//			}
//
//		}
//
//		// loop to iterate over the elements of the map
//
//		for(Map.Entry<String, Integer> entry :
//
//		hm.entrySet()) {
//
//			System.out.println(entry.getKey() + "-" + entry.getValue());
//
//			System.out.println(count);
//
//		}
