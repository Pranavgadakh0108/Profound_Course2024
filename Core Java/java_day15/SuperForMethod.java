package com.profound.java_day15;

class Animal1{
	//parent class method
	void eat()
	{
		System.out.println("Animal can eat...");
	}
}

class Dog1 extends Animal1{
	//child class method
	void eat()
	{
		System.out.println("Dog can eat...");
	}
	
	void callMethods()
	{
		eat(); //called child class method
		super.eat(); //called parent class method
	}
}
public class SuperForMethod {

	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.callMethods();
	}
}
