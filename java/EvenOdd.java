
public class EvenOdd {

	public static void main(String[] args) 
	{
	
		
	   int [] arr = new int [200];	
		
	   int [] arr1 = new int [200];	
		
		
		System.out.println("even numbers are ");
		
	   for(int i=100; i<arr.length;i++) 
	   {
	
			   if(i%2 == 0) 
			   {
			   
				   arr[i] = i;
	
				   System.out.println("even =>" + arr[i]);
				   	
			   }else
			   {
				
				   
					arr1[i] = i;   
					
					System.out.println("odd => "+ arr1[i]);
					   
					}					
				   
				   
			   }
		
	   
	   }

}
	

