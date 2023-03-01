package com.String;

public class RemoveSpecial {

	public static void main(String[] args) {

		String str = "#takshvi143_chouhan!@#$%@gmail.com/>,[]";

		// way1 using replaceall method of String

		// in these if any character found other then our given rejex then it will
		// replace by nothing ("")

		String str1 = str.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(str1);

	}

}
