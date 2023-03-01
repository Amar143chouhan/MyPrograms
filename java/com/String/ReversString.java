package com.String;

     public class ReversString {

     public static void main(String[] args) {
	


        String s1 ="amar_chouhan@gmail.com";

        // String[] str = s1.split(s1);
    
         char[] ch = s1.toCharArray();
    
     
 
         for(int i=ch.length-1;i>=0;i--) 
    
         {
              
        	
        	 System.out.print(ch[i]);
       	      	             		
          	}
     
        //approch second 
        

          for(int i=s1.length()-1;i>=0;i--) 
    
         {
             
        	System.out.print( s1.charAt(i));
       	      	             		
         }

        //approch 3 
        
        
          StringBuffer sb =new StringBuffer(s1);
          
          System.out.println(sb.reverse());
     
          
          //approch 4 
          
          StringBuilder builder =new  StringBuilder(s1);
          
          System.out.println( builder.reverse());
                           
          
     } 
     
     
     
      









}


