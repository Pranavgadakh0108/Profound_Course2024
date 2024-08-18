package com.profound.java_day26;

import java.util.Iterator;
import java.util.Stack;

public class StackEg1 {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		
		System.out.println(s1);
		System.out.println("--------------------");
		
		s1.pop();
		
		System.out.println(s1);
		System.out.println("--------------------");
		
		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-------------------------------------------------");
		
		Stack<Float> s2 = new Stack<Float>();
		
		s2.push(10.21f);
		s2.push(127.21f);
		s2.push(127.32f);
		s2.push(123.5f);
		s2.push(2892.12f);
		
		System.out.println(s2);
		System.out.println("------------------------");
		
		s2.pop();
		System.out.println(s2);
		System.out.println("------------------------");
		
		Iterator it1 = s2.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("-------------------------------------------------");
		
		Stack<String> s3 = new Stack<String>();
		
		s3.push("pranav");
		s3.push("pratik");
		s3.push("swapnil");
		s3.push(null);
		s3.push("vishal");
		s3.push(null);
		
		System.out.println(s3);
		System.out.println("------------------------");
		
		s3.pop();
		System.out.println(s3);
		System.out.println("------------------------");
		
		Iterator it2 = s3.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		System.out.println("-------------------------------------------------");

	}

}
