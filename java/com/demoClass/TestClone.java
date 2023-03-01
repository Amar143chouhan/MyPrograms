package com.demoClass;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException 
	{

		Address ad = new Address("indore", 452001);

		EmpClone e1 = new EmpClone(101, "ankit", 20000, ad);

		EmpClone e2 = (EmpClone) e1.clone();

		e2.getAddress().setCity("delhi");
		;

		System.out.println(e1 + "" + e1.getAddress().getCity());

		System.out.println(e2 + "" + e2.getAddress().getCity());

	}

}
