
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {

		String[] colors = { "red", "green", "blue" };

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		List<String> l = new ArrayList<>();

		for (String string : colors) {

			l.add(string);

		}

		System.out.println(l);

		Collections.addAll(l, colors);

		System.out.println(l);

		List<String> list = Arrays.asList(colors);

		System.out.println(list);

	}

}
