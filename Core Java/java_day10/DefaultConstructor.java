package com.profound.java_day10;

public class DefaultConstructor {
	
	 private DefaultConstructor() 
	 {
		System.out.println("Default Constructor Called..!!!");
	 }

	public static void main(String[] args) {
		DefaultConstructor dc = new DefaultConstructor();
		
	}

}
