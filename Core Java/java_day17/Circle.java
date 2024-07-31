package com.profound.java_day17;

import java.util.Scanner;

abstract class Area{
	Scanner sc = new Scanner(System.in);
	int radius;
	final float pi=3.14f;
	
	Area()
	{
		System.out.println("Enter Radius of Circle: ");
		radius = sc.nextInt();
	}
	abstract void areaOfCircle();
}

public class Circle extends Area{
	@Override
	void areaOfCircle()
	{
		System.out.println("Area of Circle: "+(pi*radius*radius));
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		c.areaOfCircle();
	}
}
