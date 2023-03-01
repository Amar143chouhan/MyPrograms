package com.demoClass;

public class MaxInArray {

	public static int maxArray(int[] arr) {

		int max = arr[0];

		for (int i = 0; i < arr.length - 1; i++)

		{

			if (arr[i] > max) {

				max = arr[i];

			}

		}
		return max;
	}

	public static void main(String[] args) {

		int[] ar = { 2, 3, 4, 5, 8, 6, 4, 3, 1 };

		int s = MaxInArray.maxArray(ar);

		System.out.println(s);

	}

}