package com.phoenix.designpatterns.singleton;

public class President {

	private static President p;
	
	private President()
	{
		System.out.println("President default constructor");
	}
	
	public static President getPresident()
	{
		if(p==null)
		{
			p = new President();
			System.out.println("President objet created");
		}
		return p;
	}
	
	public void representNation()
	{
		System.out.println("Representing nation");
	}
}
