package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartWith {

	
	public static void main(String[] args) {
		
		
		
		List<String> s = Arrays.asList("amar","ankit","vivek","akhil","praveen","vipin"); 
	
	List<String> list = s.stream().filter(s1->s1.startsWith("a")).collect(Collectors.toList());	

	System.out.println(list);
	
	}
}
