package arrays;

public class LeftShiftArray {
	
	
	
	public static void main(String[] args) {
		
	
	int[] arr  = {1,2,3,4,5};
	 
	//n is the number of arrays iterations
	 int n=3;
          	  
	  for(int i=0;i<n;i++)
	  {
		  
    	int	first =arr[0],j;
            
    	   for( j=0;j<arr.length-1;j++) 
    
    	 {
    	  
             		 arr[j] = arr[j+1];  		


    	 }
    	   
    		  arr[j] =first;
	  
    	          
	  }
	
	}

}
