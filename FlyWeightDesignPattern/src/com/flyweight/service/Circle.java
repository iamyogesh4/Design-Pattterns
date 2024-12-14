package com.flyweight.service;

public class Circle implements Shape {

	String lable; //sharable Propeties -->Instrinsic Prop
	
	
	public Circle() 
	{
		
		lable= "circle";
	}
	
	@Override            //Non Sharable Properties extrinsive properties
	public void draw(int arg1, String colour, String lineStyle) {
		
		
		System.out.println("Drawing Circle With Radius::"+arg1 + "With Fill Colour:"+"And Line Style::"+lineStyle);
		
		
	}

}
