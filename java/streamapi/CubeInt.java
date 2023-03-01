package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeInt {

	public static void main(String[] args) {
	
		List<Integer> l =Arrays.asList(2,3,4,5,6,7,8);
		
		
		l.stream().filter(s->s>3).map(s->s*s*s).forEach(System.out::println);
		
	}

}
