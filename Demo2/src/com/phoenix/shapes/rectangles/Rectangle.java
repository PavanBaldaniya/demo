package com.phoenix.shapes.rectangles;
import com.phoenix.shapes.*;

public class Rectangle extends Shape {
	
	// Rectangle parameters
	private int length;
	private int breadth;
	
	// Default constructor
	public Rectangle()
	{
		length = 0;
		breadth = 0;
	}
	
	// Parameterized constructor
	public Rectangle(int l,int b)
	{
		this.length = l;
		this.breadth = b;
	}
	
	// Area method
	public void calculateArea()
	{
		System.out.println("Rectangle area is : " + length*breadth);
	}
	
	// Perimeter method
	public void calculatePerimeter()
	{
		System.out.println("Rectangle perimeter is : " + length+breadth);
	}
	
}
