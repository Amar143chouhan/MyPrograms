package com.demoClass;

public class ShapeFactory {
	// use getShape method to get object of type shape

	public Shape getShape(String shapeType) 
	{
		if (shapeType == null) 
		{
			return null;
		
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) 
		{

			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("CIRLCLE")) 
		{

			return new Circle();

		}

		return null;

	}
}
