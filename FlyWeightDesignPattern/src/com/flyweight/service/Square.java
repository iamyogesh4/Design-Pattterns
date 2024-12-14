package com.flyweight.service;

public class Square  implements Shape{
	
	
	String lable;
	
	public Square() 
	{
		
		lable="square";
	}

	@Override
	public void draw(int arg1, String colour, String lineStyle) {
		
		System.out.println("Drawing Square With side::"+arg1 + "With Fill Colour:"+"And Line Style::"+lineStyle);
		
	}

}
