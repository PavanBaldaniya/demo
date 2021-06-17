package com.phoenix.planets;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Revolvable;
import com.phoenix.interfaces.Rotatable;

public abstract class Planet implements Movable, Rotatable, Revolvable {

	// Data members
	private int noOfMoons;
	
	// Getter and setter
	public int getNoOfMoons()
	{
		return noOfMoons;
	}
	
	public void setNoOfMoons(int n)
	{
		noOfMoons = n;
	}
	
	// Abstract method
	protected abstract boolean supportsLife();
	
	// toString method
	public String toString()
	{
		return "No of moons : " + noOfMoons;
	}

}
