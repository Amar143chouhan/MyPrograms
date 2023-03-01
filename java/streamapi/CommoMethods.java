package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CommoMethods 

{

	public static void main(String[] args) 
	{

		
		
		List<Integer> number = Arrays.asList(9, 5, 7, 4, 8, 6, 9, 5, 7, 4, 8, 6);

		List<Integer> number1 = Arrays.asList(9, 5, 7, 4, 8, 6, 5, 7, 4, 8, 6);

				//number.stream().map(i -> i*2).forEach(System.out::println);

		
		
		Integer first = number.stream().findFirst().get();

		System.out.println("first element in the stream is" + first);

		Integer i = number.stream().min((x, y) -> x - y).get();

		System.out.println(i);

		number.stream().distinct().forEach(System.out::println);

		List<Integer> list = number.stream().sorted().collect(Collectors.toList());

		Integer t = number.stream().max((x, y) -> x - y).get();

		number.stream().count();

		System.out.println(t);

		System.out.println(list);

		long count = number.stream().count();

		System.out.println(count);

		number.stream().filter(s -> s > 5).forEach(System.out::print);

		List<Integer> list2 = number.subList(5, 12);

		System.out.println("sublist of the given stream is " + list2);

	}

}
