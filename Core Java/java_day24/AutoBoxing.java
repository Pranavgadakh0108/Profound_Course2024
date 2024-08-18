package com.profound.java_day24;
//converting primitive datatype into its corresponding wrapper class
public class AutoBoxing {

	public static void main(String[] args) {
		
		int a =10;
		//way1
		Integer i = Integer.valueOf(a);
		System.out.println(i);
		
		//way2
		Integer b=a;
		System.out.println(b);
		

	}

}
