package com.flyweight.service;

public class ClientApplication {
	
	
	public static void main(String[] args) {
		
		
		
//		Shape shape = ShapeFactory.getInstane("circle");
//		
//		System.out.println(shape.hashCode());
//		
//		
//       Shape shape1 = ShapeFactory.getInstane("circle");
//		
//		System.out.println(shape.hashCode());
		
		
		
		for(int i= 0 ; i<=1000;i++) 
		{
			
			
			Shape shape = ShapeFactory.getInstane("circle");
			
			System.out.println(shape.hashCode());
			
			
			shape.draw(i+10, "blue", "No Line");
			
			
			
		}
		
		
		
		
		
		
		
}

}
