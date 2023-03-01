package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStrasWith {

	public static void main(String[] args)

	{

		List<Integer> list = Arrays.asList(11, 12, 8, 9, 18, 7, 17);

		List<String> list2 = list.stream().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());

		System.out.println(list2);

	}

}
