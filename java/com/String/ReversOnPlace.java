package com.String;

public class ReversOnPlace {

	public static void main(String[] args) {

		String name = "amar singh";

		String[] s1 = name.split(" ");
		
		 String temp;
		
		for(int i = 0; i<s1.length;i++)
			
		{
			for(int j =i+1;j<s1.length;j++) {
                    
				for(int k =i+2;k<s1.length;k++) {
		            	
				
				
				if(s1[i] != s1[j]  && s1[j] != s1[k] && s1[k] != s1[i])  
				{
		           			
				   temp =s1[i];
				   
				   s1[i] = s1[k];
				   
				   s1[k] = temp;

					System.out.println( s1[i]+" " + s1[j] +" "+""+ s1[k]);				
				   
				}					
				
		}	
	
	}
		
}
		
	}
}