package com.profound.java_day24;
//convert an object of a wrapper class to its corresponding primitive type
public class Unboxing {

	public static void main(String[] args) {
	//	Integer i = new Integer(2); => boxing
		
		//way1
		Integer i=2;
		int a = i.intValue();
		System.out.println(a);
		
		//way2
		int b=i;
		System.out.println(b);

	}

}
