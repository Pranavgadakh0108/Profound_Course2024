package com.profound.java_day25;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * >> ArrayList is an implemented class of List interface which is present in java.util package.
 * >> Arraylist is created on the basis of growable or resizable array.
 * >> Arraylist are index based data structure & it can store values of different dtypes.
 * >> It also can store duplicate values also sores any number of null values. 
 */

public class Arraylist_operations {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(); //default capacity of arraylist is 10.
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		System.out.println(list1);
		System.out.println("----------------------------");
		ArrayList list2 = new ArrayList(4); //size=4
		
		list2.add(0, 10);
		list2.add(1, "pranav");
		list2.add(2, "x");
		list2.add(3, false);
		
		System.out.println(list2);
		System.out.println("----------------------------");
		
		list1.addAll(list2);
		
		System.out.println(list1);
		System.out.println("----------------------------");
		
		list1.remove(2);
		System.out.println(list1);
		System.out.println("----------------------------");
		
		list1.removeAll(list2);
		System.out.println(list1);
		System.out.println("----------------------------");
		
		list1.clear();
		System.out.println(list1);
		System.out.println("----------------------------");
		
		System.out.println(list2.contains("x"));
		System.out.println("----------------------------");
		
		System.out.println(list2.size());
		System.out.println(list1.size());
		System.out.println("----------------------------");
		
		System.out.println(list2.get(1));
		System.out.println("----------------------------");
		
		list2.set(2, 'a');
		System.out.println(list2);
		System.out.println("----------------------------");
		
		System.out.println(list2.indexOf(10));
		System.out.println("----------------------------");
		
		Iterator i = list2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("----------------------------");
	}

}
