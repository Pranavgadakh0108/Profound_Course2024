package com.profound.java_day12;

public class ConstructorOverloading {
	
	ConstructorOverloading() {
		System.out.println("In a Default Constructor..!!!");
	}
	
	ConstructorOverloading(int num) {
		System.out.println("Number= "+num);
	}

	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading();
		ConstructorOverloading obj1 = new ConstructorOverloading(10);
	}
}
