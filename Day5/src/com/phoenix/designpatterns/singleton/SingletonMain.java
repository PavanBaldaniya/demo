package com.phoenix.designpatterns.singleton;

public class SingletonMain {
	
	public static void main(String[] args)
	{
	// Creating objects
	Earth e = Earth.getEarth();
	System.out.println("\n");
	President p = President.getPresident();
	System.out.println("\n");
	PrimeMinister pm = PrimeMinister.getPrimeMinister();
	System.out.println("\n");
	Sun s = Sun.getSun();
	System.out.println("\n");
	
	// Invoking methods
	s.giveLight();
	System.out.println("\n");
	e.createLife();
	System.out.println("\n");
	p.representNation();
	System.out.println("\n");
	pm.serveNation();
	}
}
