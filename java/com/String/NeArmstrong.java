package com.String;

import java.util.Scanner;

public class NeArmstrong {

	public static void main(String[] args) {

		System.out.println("enter the number to check armstrong");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = "" + n;

		int count = s.length();

		int num = Integer.parseInt(s);

		int temp = num;

		int sum = 0;

		while (num > 0) {

			int ld = num % 10;

			int p = 1;

			for (int i = 1; i <= count; i++)

			{

				p *= ld;

			}

			sum += p;

			num = num / 10;

		}

		if (sum == temp) {

			System.out.println("number is armstrong");
		} else {

			System.out.println("number is not armstrong number");

		}

	}
}
