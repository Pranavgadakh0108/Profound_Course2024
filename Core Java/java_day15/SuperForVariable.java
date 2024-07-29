package com.profound.java_day15;

class Animal{
	//parent class variable
	String color="white";
}

class Dog extends Animal{
	//child class variable
	String color="black";
	
	void printColor()
	{
		System.out.println(color); //child class color
		System.out.println(super.color); //parent class color
	}
}
public class SuperForVariable {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.printColor();
	}
}
