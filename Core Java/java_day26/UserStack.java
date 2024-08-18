package com.profound.java_day26;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class UserStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------------------");
		System.out.println("Enter size of Stack: ");
		int size = sc.nextInt();
		Stack st = new Stack();
		
		System.out.println("------------------------------");
		System.out.println("Enter stack elements: ");
		for(int i=0; i<size; i++)
		{
			String s=sc.next();
			st.push(s);
		}
		
		System.out.println("------------------------------");
		System.out.println("Stack elements are: ");
		Iterator it = st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------------------------------");
		System.out.println("Enter Number of elements to pop: ");
		int noOfEle = sc.nextInt();
		for(int i=noOfEle; i<size; i++)
		{
			st.pop();
		}

		System.out.println("------------------------------");
		System.out.println("Stack elements are: ");
		Iterator it1 = st.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
