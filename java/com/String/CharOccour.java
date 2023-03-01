package com.String;

import java.util.HashMap;
import java.util.Map;

public class CharOccour {
	
	
	public static void main(String[] args) 
	{
	
		
		String str = "aadarsh";
		
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		
		for(int i =str.length()-1;i>=0;i--) 
		{
			
		 
			if(map.containsKey(str.charAt(i)))
		
			{
				
				
				int count = map.get(str.charAt(i));
			
				map.put(str.charAt(i), ++count);
				
				
			}
			else
			{
	
				map.put(str.charAt(i),1);
	
			}
		
		
	
	}
		System.out.println(map);
		
         }
	}
