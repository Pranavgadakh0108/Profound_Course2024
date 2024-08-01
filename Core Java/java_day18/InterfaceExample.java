package com.profound.java_day18;

interface Example{
	//abstract method by Default
	void accept();
	
	//static methods
	static void method()
	{
		System.out.println("This is a Static Method...");
	}
	
	public static final int a = 10;
}

public class InterfaceExample implements Example{

	@Override
	public void accept() 
	{

		System.out.println("It is an Interface Method..");	
	}
	public static void main(String[] args) {
		InterfaceExample i = new InterfaceExample();
		i.accept();
		Example.method(); //calling static method
		System.out.println(Example.a); //calling static final variable
		System.out.println(InterfaceExample.a); //calling static final variable
	}
}
