package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcateStreams {

	public static void main(String[] args) {

		
		List<String> s1 =Arrays.asList("java ","programming","language");
		
		List<String> s2 =Arrays.asList("is","popular","now");
		
		
		Stream<String> s3 = Stream.concat(s1.stream(), s2.stream());
		
		s3.forEach(str -> System.out.println(str + ""));

	
	}
	

}
