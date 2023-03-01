package streamapi;

import java.util.Arrays;
import java.util.List;

public class Palindrome {

	public static String ispalindrome(String s) {

		String rev = "";

		for (int i = s.length() - 1; i >= 0; --i) {

			rev += s.charAt(i);

			if (rev.equals(s)) {

				System.out.println(s + " " + "palindrome");

			}

		}

		return "";

	}

	public static void main(String[] args) {

		List<String> l = Arrays.asList("madam", "nitin", "mem", "amar");

		l.stream().map(Palindrome::ispalindrome).forEach(System.out::print);

	}

}
