package com.profound.java_day25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Eg {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		//System.out.println(list);
		
//		for(int i:list)
//		{
//			System.out.println(i);
//		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
