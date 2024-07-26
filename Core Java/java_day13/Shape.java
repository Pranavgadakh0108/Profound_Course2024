package com.profound.java_day13;
import java.util.Scanner;

class Circle{
	int radius;
	float pi;
	
	void circle()
	{
		System.out.println("Area of Circle= "+(pi*radius*radius));
		System.out.println("Circumference of Circle= "+(2*pi*radius));
	}
}
class Rectangle extends Circle{
	int length, width;
	void rectangle()
	{
		System.out.println("Area of Rectangle= "+(length*width));
		System.out.println("Perimeter of Rectangle= "+(2*(length+width)));
	}
}
public class Shape extends Rectangle{

	Scanner sc = new Scanner(System.in);
	Shape()
	{
		System.out.println("--------------------------------------------------");
		System.out.println("ENTER RADIUS AND VALUE OF PI: ");
		radius = sc.nextInt();
		pi = sc.nextFloat();
		circle();
		System.out.println("--------------------------------------------------");
		System.out.println("ENTER LENGTH AND WIDTH OF RECTANGLE: ");
		length = sc.nextInt();
		width = sc.nextInt();
		rectangle();
		System.out.println("--------------------------------------------------");
	}
	public static void main(String[] args) {
		Shape s = new Shape();
	}

}
