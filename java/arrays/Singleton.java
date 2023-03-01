package arrays;

import com.String.reversenumber;

public final class Singleton {

	
	public static Singleton instance;
	
	
	private Singleton() {}
	
	
	public static Singleton getinstance () {
		
       //double check locking pattern		
		if(instance == null) 

		{
			synchronized (Singleton.class) {
				
				if (instance == null) {
					
	            instance =new Singleton() ;
					
				}
			}
			
		}
		return instance;
		
		
		
		
	}
	
	
public static void main(String[] args) {
	
	
	
	
	Singleton singleton =  Singleton.getinstance();
	
     Singleton singleton2 = Singleton.getinstance();
	

if(singleton == singleton2) {
	
	System.out.println("objects are same ");
}

else {
	System.out.println("objects are not same");
}
} 	
  	
	
}
