package com.profound.java_day29;

public class StringBufferEg2 {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Java");
		System.out.println(str1);
		str1.append(" Programming");
		System.out.println(str1);
		System.out.println("---------------------------");
		
		StringBuffer str2 = new StringBuffer("Hello");
		System.out.println(str2);
		str2.insert(1, "Java");
		System.out.println(str2);
		System.out.println("---------------------------");
		
		StringBuffer str3 = new StringBuffer("Hello");
		System.out.println(str3);
		str3.replace(0, 5, "pranav");
		System.out.println(str3);
		str3.replace(3, 6, "tik");
		System.out.println(str3);
		System.out.println("---------------------------");
		
		str3.delete(0, 3);
		System.out.println(str3);
		System.out.println("---------------------------");
		
		StringBuffer str4 = new StringBuffer("Hello");
		System.out.println(str4);
		str4.reverse();
		System.out.println("Reverse String: "+str4);
		System.out.println("---------------------------");
		
		StringBuffer str5 = new StringBuffer();
		System.out.println(str5.capacity()); //16  (old size *2)+2
		str5.append("pranav");
		int cap = str5.capacity();
		System.out.println(cap);  //16
		str5.append("Java is the Best Programming Language in world");
		System.out.println(str5.capacity());//52
		System.out.println("---------------------------");
	}

}
