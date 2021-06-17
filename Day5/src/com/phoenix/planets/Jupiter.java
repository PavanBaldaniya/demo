package com.phoenix.planets;

public class Jupiter extends Planet {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter is moving");
	}

	@Override
	public void rotate() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter is rotating");
	}

	@Override
	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Jupiter is revolving");
	}

	@Override
	protected boolean supportsLife() {
		// TODO Auto-generated method stub
		return false;
	}

}
