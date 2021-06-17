package com.phoenix.living.pet;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Cat extends Animal implements Walkable {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Cat is jumping");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Cat is moving");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Cat is running");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Cat is walking");
	}

}
