package com.phoenix.shapes.squares;
import com.phoenix.shapes.*;

public class Square extends Shape {

	// Side
	private int side;
	
	// Default constructor
	public Square()
	{
		side = 0;
	}
	
	// Parameterized constructor
	public Square(int side)
	{
		this.side = side;
	}
	
	// Area method
	public void calculateArea()
	{
		System.out.println("Square area is : " + side*side);
	}
	
	// Perimeter method
	public void calculatePerimeter()
	{
		System.out.println("Square perimeter is : " + 2*side);
	}
	
}
