package com.String;

        public class StringNparts 

         {
    	
    	  public static void main(String[] args)
    
    	    {
		
     	     String str = "aaabbbccc";
		 
		      int len = str.length();
		
	           int n =3;
	   
	   
	              int c = len/n;
	              
	         //   char x   =(char)c;
	

	           System.out.println(c); 
	      
	     
	            int	temp =0;
		
	          String[] equalsStr = new String[n];
	  
	          if(len % n !=0)
	    
	      {
		    
          
     	    System.out.println("sorry string cannot divide into n equal parts");
	      }
	          else
	          {
		   
     	       for(int i=0;i<len;i=i+c)
     	      
     	       {
         	String part = str.substring(i,i+c);
     		
     		equalsStr[temp]=part;
              
     		 
     		 temp++;
     		
     	  }
	      
	   }
     	      
	          
	          
	          System.out.println(n+"equal parts of given string are");
     	       
    		   
     	       for(int i=0;i<equalsStr.length;i=i++) 
     	       {
     	    	   
     	    	   
     	    	   System.out.println(equalsStr[i]);
     	    	   
     	    	   
     	  }
     	       	       
       }
	
	}
