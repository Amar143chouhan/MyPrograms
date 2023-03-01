package com.String;

public class reversenumber {
	
	
	public static void main(String[] args) {
		
	
  	int num = 1234;
  	
  	//first approach
  	StringBuffer sb =new StringBuffer(String.valueOf(num));
  	
  	StringBuffer reverse2 = sb.reverse();
  	
  	System.out.println("reverse of the number is" + reverse2);
  	
  	
  	
  	//second approach
  	
     	int reverse = 0;
  	
    	while(num !=0) {
  		
  		int lastdigit = num % 10;
  		
  		       reverse =reverse*10 + lastdigit;
  	
  		       num =num /10;
  		
  	}
  	
     System.out.println("reverse number is "+ reverse);
	
	}
}
