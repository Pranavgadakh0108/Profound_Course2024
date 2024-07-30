package com.profound.java_day16;

import java.util.Scanner;

class Shape{
	int length, width;
	Scanner sc = new Scanner(System.in);
	Shape()
	{
		System.out.println("Enter side length: ");
		length = sc.nextInt();
	}
}
class Square extends Shape{
	void Area()
	{
		System.out.println("Area of square= "+(length*length));
	}
}
class Rectangle extends Shape{
	void Area()
	{
		System.out.println("Enter Width: ");
		width = sc.nextInt();
		System.out.println("Area of rectangle= "+(length*width));
	}
}
public class FindArea {

	public static void main(String[] args) {
		Square s = new Square();
		s.Area();
		Rectangle r = new Rectangle();
		r.Area();
	}

}
