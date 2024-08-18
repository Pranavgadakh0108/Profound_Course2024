package com.profound.java_day26;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class UserVector {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.println("Enter size of Vector: ");
		int size = sc.nextInt();
		
		Vector v = new Vector();
		
		System.out.println("------------------------------");
		System.out.println("Enter vector elements: ");
		for(int i=0; i<size; i++)
		{
			String s=sc.next();
			v.add(s);
		}
		
		System.out.println("------------------------------");
		System.out.println("Vector elements are: ");
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("------------------------------");
		System.out.println("Enter vector index to remove element: ");
		int index = sc.nextInt();
		v.remove(index);

		System.out.println("------------------------------");
		System.out.println("Vector elements are: ");
		Iterator it1 = v.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
