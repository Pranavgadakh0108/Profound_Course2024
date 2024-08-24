package com.profound.java_day29;

public class StringEg2 {

	public static void main(String[] args) {
		String s1 ="pranav";
		String s2 =" Gadakh ";
		
		System.out.println("character at index 4 = "+s1.charAt(4));
		
		System.out.println("length of string = "+s1.length());
		
		System.out.println("substring from index 2= "+s1.substring(2));
		
		System.out.println("substring from index 2 to 6= "+s1.substring(2,6));
		
		System.out.println("is string contains 'ana' ="+s1.contains("ana"));
		
		System.out.println(s1.equals("pra"));
		System.out.println(s1.equals(s1));
		
		System.out.println("string empty? = "+s1.isEmpty());
		
		System.out.println("s1 concat s2: "+s1.concat(s2));
		
		System.out.println(s1.replace('p', 'P'));
		
		System.out.println(s1.equalsIgnoreCase("pRaNaV"));
		
		System.out.println((s1.concat(s2).toLowerCase()));
		
		System.out.println((s1.concat(s2).toUpperCase()));
		
		System.out.println("before trim :" +s2);
		System.out.println("after trim :" +s2.trim());
		

	}
}
