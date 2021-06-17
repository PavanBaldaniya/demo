package com.phoenix.interfaces.main;
import com.phoenix.interfaces.*;
import com.phoenix.planets.*;
import com.phoenix.living.wild.*;
import com.phoenix.living.pet.Cat;
import com.phoenix.machines.*;
import com.phoenix.vehicles.cars.*;

public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movable mv1,mv2,mv3,mv4,mv5,mv6;

		mv1 = new Earth();
		Earth e = (Earth) mv1;
		e.setNoOfMoons(1);
		System.out.println(e);
		System.out.println("\n");
		
		mv2 = new Jupiter();
		Jupiter j = (Jupiter) mv2;
		j.setNoOfMoons(2);
		System.out.println(j);
		j.revolve();
		j.move();
		j.rotate();
		System.out.println("\n");
		
		mv3 = new Tiger();
		Tiger t = (Tiger) mv3;
		t.jump();
		t.move();
		t.walk();
		System.out.println("\n");
		
		mv4 = new Cat();
		Cat c = (Cat) mv4;
		c.jump();
		c.move();
		c.run();
		c.walk();
		System.out.println("\n");
		
		mv5 = new Car();
		Car car = (Car) mv5;
		car.run();
		car.start();
		car.stop();
		System.out.println("\n");
		
		mv6 = new Robot();
		Robot r = (Robot) mv6;
		r.move();
		r.senseInfo();
		r.processData();
		r.useArtificialIntelligence();
		
		
	}

}
