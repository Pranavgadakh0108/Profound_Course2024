package com.profound.java_day26;

import java.util.Iterator;
import java.util.Vector;

public class VectorEg1 {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.add(null);
		v1.add("pranav");
		v1.add(null);
		v1.add("pratik");
		v1.add("prisha");
		
		System.out.println(v1);
		System.out.println("------------------------");
		
		v1.remove(4);
		System.out.println(v1);
		System.out.println("------------------------");
		
		Iterator it = v1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("------------------------");

		
		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(null);
		v2.add(1);
		v2.add(2);
		v2.add(3);
		v2.add(null);
		
		System.out.println(v2);
		System.out.println("------------------------");
		
		v2.remove(0);
		
		System.out.println(v2);
		System.out.println("------------------------");
		
		Iterator it1 = v2.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println("------------------------");
		
		Vector<Float> v3 = new Vector<Float>();
		v3.add(null);
		v3.add(1, 123.2f);
		v3.add(121f);
		v3.add(3, 321.12f);
		
		System.out.println(v3);
		System.out.println("------------------------");
		
		v3.remove(2);
		System.out.println(v3);
		System.out.println("------------------------");
		
		Iterator it3 = v3.iterator();
		while(it3.hasNext())
		{
			System.out.println(it3.next());
		}
		System.out.println("------------------------");
	}

}
