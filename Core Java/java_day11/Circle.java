package com.profound.java_day11;

import java.util.Scanner;

public class Circle {
	
	int radius;
	public Circle(int radius) {
		this.radius=radius;
		
		System.out.println("Area of Circle = "+(3.14*radius*radius));
		System.out.println("Circumference of Circle= "+(2*3.14*radius));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER RADIUS OF CIRCLE: ");
		int r = sc.nextInt();
		Circle c = new Circle(r);

	}

}
