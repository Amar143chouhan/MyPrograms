package com.String;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayToString {

	//using the stingbuilder append method
	
	public static String ConvertArrayTOstring(String[] sarray) {

		
        StringBuilder sb = new StringBuilder();

		for (int i = 0; i < sarray.length; i++) {

			sb.append(sarray[i]);

		}
         return sb.toString();

	}

	
	   //convert using String.join method
      public static String convertUsingJoin(String[] stringArray) {
 
      String str = String.join(" ", stringArray);

     
          return str;


      }

      
      public static String ConvertUsingJoining(String[] strarray) {
    	  
    	  String collect = Arrays.stream(strarray).collect(Collectors.joining());
    	
    	  return collect;
      }
      
      
     	public static void main(String[] args)
     	
     	{

		String[] str = { " i", "live", "in", "indore" };

		String convertdtring = ConvertArrayTOstring(str);

		  
		
  	   String join = convertUsingJoin(str);    
  	    
  	   System.out.println(join);
	
  	   String joining = ConvertUsingJoining(str);
  	   
  	   System.out.println(joining);
  	   
  	   
//		System.out.println(convertdtring);

		String name = "rohan singh jaiswal";

		int lastIndexOf = name.lastIndexOf(" ");

		String lastname = name.substring(lastIndexOf, name.length());

		// it will give first index of space which generally came after firstname

		int i = name.indexOf(" ");

		// for printing middle name
		String middlename = name.substring(i, lastIndexOf);

		// for printing firtname only

		String firstname = name.substring(0, i);

		System.out.println(firstname);

		System.out.println(middlename);

		System.out.println(lastname);

		// char[] charray = name.toCharArray();

//	        for(int i=0;i<=charray.length-1;i++) {

     		// System.out.println(charray[i]);
  
	     	// }

	}
  
}
