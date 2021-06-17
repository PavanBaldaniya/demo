package com.phoenix.designpatterns.singleton;

public class PrimeMinister {

	private static PrimeMinister pm;
	
	private PrimeMinister()
	{
		System.out.println("PM default constructor");
	}
	
	public static PrimeMinister getPrimeMinister()
	{
		if(pm==null)
		{
			pm = new PrimeMinister();
			System.out.println("PM object created");
		}
		return pm;
	}
	
	public void serveNation()
	{
		System.out.println("Serve nation");
	}
}
