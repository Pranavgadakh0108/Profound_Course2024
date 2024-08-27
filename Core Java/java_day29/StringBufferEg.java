package com.profound.java_day29;

public class StringBufferEg {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("java");
		
		System.out.println(sb);
		
		sb.append(" programming");
		
		System.out.println(sb);
		
		sb.deleteCharAt(2);
		
		System.out.println(sb);
		
		sb.insert(2, "v");
		
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);

	}
}
