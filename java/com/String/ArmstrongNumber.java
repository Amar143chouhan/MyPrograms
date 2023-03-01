package com.String;

public class ArmstrongNumber

      {
	    public static void main(String[] args) {

		int n = 121;

		// converting integer to string

		// String s = "" + n;

		String s = String.valueOf(n);

		int i = s.length() - 1;

		int sum = 0;

		// converting string to integer

		int x = Integer.parseInt(s);

		while (x != 0)

		{

			int ld = x % 10;

			int y = ld * ld * ld;

			sum += y;

			x = x / 10;

		}

		if (sum == x) {

			System.out.println("number is armstrong");

		}

		else {

			System.out.println("number is not armstrong number");

		}

	}

}
