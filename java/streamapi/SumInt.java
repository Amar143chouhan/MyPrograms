package streamapi;

import java.util.Scanner;

public class SumInt {
	
	public static void main(String[] args) {
		
		
		System.out.println("please enter the integer number");
		
		Scanner sc =new  Scanner(System.in);
		
		int n = sc.nextInt();
		
		int  sum =0;
		while(n!=0) 
		{
			
	        int rem = n%10;
	        
	        sum = sum + rem;
			  
	        n = n/10;
		    	
			
		}
		
		
		System.out.println(sum);
	}

}
