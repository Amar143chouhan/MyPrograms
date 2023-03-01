package arrays;

import com.String.reversenumber;

public class firstDuplicateOccourence {
	
	public static void main(String[] args) {
		
	//logic compare elements one by one with all elements of the array
	

	Integer x[] = {10,2,3,4,1,2,9};
	
	for(int i=0;i<x.length;i++) {
		
		for(int j=i+1;j<x.length;j++) {
			
	             if(x[i]==x[j]) {
	            	 
	            	 System.out.println(x[i]);
	            	
	            	 return;
	             }		
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}