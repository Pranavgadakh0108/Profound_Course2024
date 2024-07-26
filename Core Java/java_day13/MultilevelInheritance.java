package com.profound.java_day13;

class A{
	int num1=10;
}
class B extends A{
	int num2=20;
}
class C extends B{
	int num3=30;
}
public class MultilevelInheritance extends C{
	MultilevelInheritance() {
		System.out.println("NUM1="+num1+" NUM2="+num2+" NUM3="+num3);
	}
	public static void main(String[] args) {
		MultilevelInheritance mi = new MultilevelInheritance();

	}

}
