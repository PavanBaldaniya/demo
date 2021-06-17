package com.phoenix.living.wild;

import com.phoenix.interfaces.Walkable;
import com.phoenix.living.Animal;

public class Tiger extends Animal implements Walkable {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
        System.out.println("Tiger is jumping");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is moving");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is running");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is walking");
	}

}
