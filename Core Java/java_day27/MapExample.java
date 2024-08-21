package com.profound.java_day27;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "pranav");
		map.put(2, "pratik");
		map.put(3, "swapnil");
		map.put(null, null);
		
		System.out.println("Map= "+map);
		System.out.println("-----------------------------------");
		
		for(Map.Entry<Integer, String> m : map.entrySet())
		{
			System.out.println("key= "+m.getKey()+" value= "+m.getValue());
		}
		
		System.out.println("-----------------------------------");
		
		
	}

}
