package com.demoClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import arrays.Test;

public class TestReflection

{

	public static void main(String[] args)

			throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,

			SecurityException, IllegalArgumentException, InvocationTargetException {

		Class c = Class.forName("com.demoClass.TestRef");

		TestRef t = (TestRef) c.newInstance();

		Method m = c.getDeclaredMethod("show", null);

		m.setAccessible(true);

		m.invoke(t, null);

	}

}
