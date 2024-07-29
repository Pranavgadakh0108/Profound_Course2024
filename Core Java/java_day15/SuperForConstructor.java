package com.profound.java_day15;
class Animal2{
	//parent class constructor
	 Animal2(int num) {
		System.out.println("Animal Age is "+num);
	}
}

class Dog2 extends Animal2{
	//child class constructor
	Dog2(int num) {
		super(num); //call parent class constructor
		
		System.out.println("Dog Age is "+num);
	}
}
public class SuperForConstructor {

	public static void main(String[] args) {
		Dog2 d = new Dog2(10);
	}
}
