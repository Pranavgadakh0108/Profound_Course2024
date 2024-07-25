package com.profound.java_day12;
//WAP ADD 2 numbers using only 2 parameters through Constructor Overloading
public class Add {

	Add(int a, int b){
		System.out.println("SUM= "+(a+b));
	}
	
	Add(float a, float b){
		System.out.println("Addition= "+(a+b));
	}
	public static void main(String[] args) {
	   Add intObj = new Add(10, 20);
	   Add floatObj = new Add(10.0f, 20.0f);
	}
}
