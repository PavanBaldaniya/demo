package com.phoenix.planets;

public class Earth extends Planet {

	@Override
	public void move() {
		System.out.println("Earth is moving");
	}

	@Override
	public void rotate() {
		System.out.println("Earth is rotating");
	}

	@Override
	public void revolve() {
		System.out.println("Earth is revolving");
	}

	@Override
	public boolean supportsLife() {
		return true;
	}

}
