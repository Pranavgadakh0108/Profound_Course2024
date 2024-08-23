package com.profound.java_day29;

public class StringEg1 {

	public static void main(String[] args) {
		//way-1 = using literal
		String str1 = "Pranav";
		System.out.println(str1);
		
		//way-2 = using new keyword 
		
		char ch[] = {'j','a','v','a'};
		String str2 = new String(ch);
		System.out.println(str2);
		
		String str3 = new String("pratik");
		System.out.println(str3);
		
		char ar[]= {'1','2','3','4','5'};
		String s = new String(ar);
		System.out.println(s);
	}

}
