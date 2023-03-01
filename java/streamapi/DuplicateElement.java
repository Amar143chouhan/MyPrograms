package streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(10, 15, 8, 29, 25, 98, 32, 15);

	    Set<Integer> set =new HashSet<Integer>();
	    //here we print the element which is not added to the set
	    l.stream().filter( s-> !set.add(s)).forEach(System.out::print);
		
		
		
	}

}
