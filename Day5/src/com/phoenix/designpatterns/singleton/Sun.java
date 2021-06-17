package com.phoenix.designpatterns.singleton;

public class Sun {

	private static Sun s;
	
	private Sun()
	{
		System.out.println("Sun default constructor");
	}
	
	public static Sun getSun()
	{
		if(s==null)
		{
			s = new Sun();
			System.out.println("Sun object created");
		}
		return s;
	}
	
	public void giveLight()
	{
		System.out.println("Giving light");
	}
}
