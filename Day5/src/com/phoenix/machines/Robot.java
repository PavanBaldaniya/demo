package com.phoenix.machines;

import com.phoenix.interfaces.Movable;

public class Robot implements Movable {
	
	public void processData()
	{
		System.out.println("Processing data ... ");
	}
	
	public void senseInfo()
	{
		System.out.println("Sensing Info ... ");
	}
	
	public void useArtificialIntelligence()
	{
		System.out.println("Using AI .... ");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Robot is moving <-->");
	}

}
