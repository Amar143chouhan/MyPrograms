package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordByLength {

	public static void main(String[] args) 
	{


		List<String> l =Arrays.asList("i","m","word","with","javacore","sprngmvc");
		
		
		Map<Integer, List<String>> map = l.stream().collect(Collectors.groupingBy(String::length));
		
		
		System.out.println(map);
		
		
	}

}
