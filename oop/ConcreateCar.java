package oop;

public class ConcreateCar extends AbstractCar implements  InterfaceCar {
	// implement == interface
	// extend == abstract class
	// extends first, implements second
	// 

	@Override
	public void start() {
		
		
	}

	@Override
	public void stop() {
	
		
	}

	@Override
	public void move() {
		System.out.println("moving functionity _ generating car concreate -- coming from interface");
		autoBreak();
		System.out.println(a);
		
		
	}
	//Method Overriding
	@Override
	
	public void autoHeadLight() {
		System.out.println(a+ "headlight--polymorphism class");
		
	}

}
