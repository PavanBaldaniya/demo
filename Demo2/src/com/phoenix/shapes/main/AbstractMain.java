package com.phoenix.shapes.main;
import com.phoenix.shapes.*;
import com.phoenix.shapes.circles.*;
import com.phoenix.shapes.rectangles.*;
import com.phoenix.shapes.squares.*;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Shape class references
		Shape shape1,shape2,shape3;
		
		// Circle
		shape1 = new Circle(12);
		shape1.calculateArea();
		shape1.calculatePerimeter();
		System.out.println("\n");
		
		// Rectangle
		shape2 = new Rectangle(12,13);
		shape2.calculateArea();
		shape2.calculatePerimeter();
		System.out.println("\n");
		
		// Square
		shape3 = new Square(14);
		shape3.calculateArea();
		shape3.calculatePerimeter();
		System.out.println("\n");
		
	}

}
