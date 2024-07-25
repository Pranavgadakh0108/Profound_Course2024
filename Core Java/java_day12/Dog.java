package com.profound.java_day12;
//SIGLE LEVEL INHERITANCE...
import java.util.Scanner;

class Animal{
	String name;
	int age;
	
	void eat()
	{
		System.out.println("He can Eat");
	}
}
public class Dog extends Animal{
	Scanner sc = new Scanner(System.in);
	
	String color;
	double price;
	
	void run()
	{
		System.out.println("Dog can Run..");
	}

	Dog(){
		System.out.println("Enter Dog name: ");
		name =sc.next();
		System.out.println("Enter Dog Age: ");
		age = sc.nextInt();
		System.out.println("Enter Dog Color: ");
		color = sc.next();
		System.out.println("Enter Dog Price");
		price = sc.nextDouble();
	}
	
	void displayDetails()
	{
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("THE DOG NAME IS "+name+" AND HE IS "+age+" YEARS OLD, HAVING COLOR "+color+" AND PRICE "+price+" Rupees.");
		System.out.println("----------------------------------------------------------------------------------");
	}
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.displayDetails();
		d.eat();
		d.run();

	}

}
