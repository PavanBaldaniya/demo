package com.phoenix.designpatterns.singleton;

public class Earth {
	
	private static Earth e;
	
	private Earth()
	{
		System.out.println("Default constructor");
	}
	
	public static Earth getEarth()
	{
		if (e==null)
		{
			e = new Earth();
			System.out.println("Earth object created");
		}
		return e;
	}
	
	public void createLife()
	{
		System.out.println("Creating life");
	}
}
