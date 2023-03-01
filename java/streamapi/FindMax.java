package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMax {

	public static void main(String[] args) {
	
		
		List<Integer> l =Arrays.asList(10,23,54,68,45,12);

	      Integer list = l.stream().max(Integer::compare).get();
	      
	      System.out.println(list);
	}

}
