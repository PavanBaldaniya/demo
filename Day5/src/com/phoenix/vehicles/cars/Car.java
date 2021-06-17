package com.phoenix.vehicles.cars;

import com.phoenix.interfaces.Movable;
import com.phoenix.interfaces.Runnable;
import com.phoenix.vehicles.Vehicle;

public class Car extends Vehicle implements Movable, Runnable {

	public void start()
	{
		System.out.println("Car has started.");
	}
	
	public void stop()
	{
		System.out.println("Car has stopped");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car is running");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car is moving");
	}

}
