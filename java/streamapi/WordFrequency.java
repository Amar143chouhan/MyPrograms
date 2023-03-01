package streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordFrequency {

	public static void main(String[] args)
    {

		List<String> list = Arrays.asList("AA", "BB", "CD", "SS", "FF", "A", "D");

		Map<String, Long> collect = list.stream().filter(word -> Collections.frequency(list, word)>1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        		System.out.println(collect);

	}

}
