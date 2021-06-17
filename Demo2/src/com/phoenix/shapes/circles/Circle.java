package com.phoenix.shapes.circles;
import com.phoenix.shapes.Shape;

public class Circle extends Shape {
	
	// Radius
	private float radius;
	
	// Default constructor
	public Circle()
	{
		radius = 0;
	}
	
	// Parameterized constructor
	public Circle(float r)
	{
		this.radius = r;
	}
	
	// Calculate area
	public void calculateArea()
	{
		System.out.println("Circle area is : " + MATH_PI*radius*radius);
	}
	
	// Calculate perimeter
	public void calculatePerimeter()
	{
		System.out.println("Circle perimeter is : " + MATH_PI*radius);
	}
	
}
