package com.String;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {

		System.out.println("enter a numbder to check palidrome or not : ");

        Scanner sc= new Scanner(System.in);    
		
        int num = sc.nextInt();
		
        int enterednum = num; 
        
        int lastdigit =0;
        
        int revnum = 0;
		
        while(num!=0) {
			
		lastdigit = num%10;
		
		revnum = revnum * 10 + lastdigit;
	  
		 num = num/10;
		}  
        
        if(enterednum == revnum) {
        
System.out.println("the  entered number "+enterednum + " is a palindorme number");        
        }
        
        else {
        	
        	
        	System.out.println("the entered number " + enterednum +  " is not a palindorme number");
        }
		
		
		
		
		
		
		
		
	}

}
