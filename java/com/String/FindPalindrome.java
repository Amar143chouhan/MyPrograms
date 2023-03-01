package com.String;

public class FindPalindrome 
{
public static void main(String[] args) {
	
 String str ="My name is nitin and i know malayalam";
 
         String[] s1 = str.split(" ");

         String str1 =""; 

         String result ="";
      
      StringBuffer reverse = null;
      
      for(int i=0; i<=s1.length-1;i++) 
         {
                           	   
            result = s1[i];
          
          StringBuffer sb = new StringBuffer(result);
              
          reverse = sb.reverse();
       
          if(result.equals(reverse)) 
          {
             		   
              
               str1 += result;		
         	 
            }
          
              
         }
        
            	   
               }       	 
        	 
        	 
         
         


}
