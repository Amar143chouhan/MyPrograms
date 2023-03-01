package com.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String s1 = "aaabbbcccdd";

		// way1 -> using java 8
		// chars method retuns us a input srteam of the given string
		// distinct method Returns a stream consisting of the distinct elements of this
		// stream.
		
		StringBuilder sb = new StringBuilder();

		s1.chars().distinct().forEach(s -> sb.append((char)s));

		System.out.println(sb);

		// way 2nd :->

		StringBuffer sb2 = new StringBuffer();

		for (int i = 0; i < s1.length(); i++) {

			char c = s1.charAt(i);

			int idx = s1.indexOf(c, i + 1);

			if (idx == -1) {

				sb2.append(c);

			}

		}

		System.out.println(sb2);

	   //3rd	way:-> 

		char[] charr = s1.toCharArray();
		
	   StringBuilder builder =new StringBuilder(); 
	   
	   
		for(int i=0 ;i<charr.length;i++ ) 
		{
	
			   boolean repet =false;
				
			for(int j =i+1 ; j<charr.length;j++) 
			{
				
			if(charr[i] == charr[j]) 
	
			{
				
				repet = true;
			   
				 break;
			}
		}		   
		      
			if(!repet)
			{
	     
			builder.append(charr[i]);		
			
			} 
		}	        	
	
		System.out.println(builder);
					
		

		//way4th ->using collection set 
		StringBuilder sb4 =new StringBuilder();
		
		Set<Character> set =new LinkedHashSet();
		
		for(int i= 0;i<s1.length();i++) 
		{
			
       		set.add(s1.charAt(i));
		
		}

		for(Character c : set) {
        	  
           sb4.append(c);        	  
        	  
          }
		
            System.out.println(sb4);
		
		
		
	
	
	}
			
}

	
	

