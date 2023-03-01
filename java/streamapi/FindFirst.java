package streamapi;

import java.util.Arrays;
import java.util.List;

public class FindFirst {

	public static void main(String[] args) {


		List<Integer> l = Arrays.asList(10, 15, 8, 29, 25, 98, 32, 15);

		
		
           l.stream().findFirst().ifPresent(System.out::print);
		
	}

}
