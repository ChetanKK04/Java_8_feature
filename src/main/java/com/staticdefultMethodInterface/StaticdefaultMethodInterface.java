package com.staticdefultMethodInterface;

interface Vechicles {

	void horn();
	
default	void speedometer() {
	
	System.out.println("add new speedo meter");
}
	
}

class Car implements Vechicles {

	@Override
	public void horn() {
		System.out.println("Car : Pop pop........");
	}
}

class Bike implements Vechicles {

	@Override
	public void horn() {
		System.out.println("Bike : Pip pip........");
	}
}

public class StaticdefaultMethodInterface {

	public static void main(String[] args) {
		
	Vechicles bike = new Bike();
		bike.horn();
		bike.speedometer();
		
		Vechicles car = new Car();
		car.horn();
		car.speedometer();
	}

}
