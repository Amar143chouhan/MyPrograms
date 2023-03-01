package com.String;

public class Anagram2 {

	public static void main(String[] args) {

		String s = "rama";

		String s1 = "rama";

		if (isAnagram(s1, s)) {

			System.out.println("anagram strings");

		} else {
			System.out.println("not anatgram");
		}

	}

	public static boolean isAnagram(String s1, String s2) {

		int[] Count = new int[256];

		for (int i = 0; i < s1.length(); i++) {

			Count[s1.charAt(i)]++;
		    Count[s2.charAt(i)]--;

			System.out.println(Count[i]);
			
		}

		for (int i = 0; i < Count.length; i++) {

			if (Count[i] != 0) {

				return false;

			}

		}
		return true;

	}

}
