package com.profound.java_day27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
//		for(Integer i=1; i<6; i++)
//		{
//			set.add(i);
//		}	
//		System.out.println(set);
		
		set.add(1);
		set.add(2);
		set.add(null);
		set.add(2);
		set.add(null);
		set.add(4);
		set.add(3);
		
		System.out.println("set= "+set);
		
		set.remove(null);
		System.out.println("set= "+set);
		
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(5);
		list1.add(6);
		list1.add(4);
		System.out.println("list1= "+list1);
		
		System.out.println("set.addAll(list1)= "+set.addAll(list1));
		System.out.println("set= "+set);
		
		set.clear();
		System.out.println(set);
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(null);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(null);
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		System.out.println("set1= "+set1+" set2= "+set2);
		
		System.out.println("set1 contains 1= "+set1.contains(1));
		System.out.println("set1 contains set2= "+set1.containsAll(set2));
		System.out.println("set2 contains set1= "+set2.containsAll(set1));
			
	}

}
