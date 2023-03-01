
public final class ImmutableClass    {
	
	
	private String id;
	
	private String name;


	 public ImmutableClass(String id,String name ) {
		 
		 
		 this.id= id;
		 this.name=name;
		 
		 
	 }


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}

       public static void main(String[] args) {
	

     ImmutableClass imtc = new ImmutableClass("101", "amar");
     
      
     System.out.println(imtc.getId() + "" + imtc.getName()  );
         
     
  
  
  
  
  
  
  
  
  
  
  }
	
	 

}
