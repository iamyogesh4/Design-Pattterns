package com.flyweight.service;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	
	
	static Map<String, Shape> instanceMap = new HashMap<>();
	
	
	
	
	public static Shape getInstane(String type) 
	{
		
		
		Shape shape= null;
		
		
		

			if(!instanceMap.containsKey(type)) 
			{
				
				
				if(type.equalsIgnoreCase("circle")) 
				{
					
					
					shape = new Circle();
					
				}else if(type.equalsIgnoreCase("square")) 
				{
					
					shape=new Square();
					
					
				}else
				{
					
					
					throw new IllegalArgumentException("Invalid Type:::");
				}
				
				
				instanceMap.put(type, shape);
				
				
			}
		     
			shape = instanceMap.get(type);
		
			return shape;
		
		
		
		
		
		
		
	}
	

}
