package com.profound.java_day16;

class A{
	void show_A()
	{
		System.out.println("A");
	}
}
class B extends A{
	void show_B()
	{
		System.out.println("B");
	}
}
class C extends A{
	void show_C()
	{
		System.out.println("C");
	}
}
public class HierrachicalInheritance {

	public static void main(String[] args) {
		B b = new B();
		b.show_A();
		b.show_B();
		
		C c=new C();
		c.show_A();
		c.show_C();

	}

}
