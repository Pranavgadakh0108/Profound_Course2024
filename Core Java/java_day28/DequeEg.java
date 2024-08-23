package com.profound.java_day28;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEg {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("ganesh");
		deque.add("pranav");
		deque.add("pratik");
		deque.add("mahesh");
		
		System.out.println("deque1= "+deque);
		System.out.println("---------------------------------------");
		
		//insert new element from top
		deque.addFirst("gorakh");
		System.out.println("deque2= "+deque);
		System.out.println("---------------------------------------");
		
		deque.offerFirst("ram");
		System.out.println("deque3= "+deque);
		System.out.println("---------------------------------------");
		
		//insert element from bottom
		
		deque.add("raj");
		System.out.println("deque4= "+deque);
		System.out.println("---------------------------------------");
		
		//delete element from top
		
		deque.remove();
		System.out.println("deque5= "+deque);
		System.out.println("---------------------------------------");
		
		deque.remove("mahesh");
		System.out.println("deque6= "+deque);
		System.out.println("---------------------------------------");
		
		//delete an element from bottom
		
		deque.pollLast();
		System.out.println("deque7= "+deque);
		System.out.println("---------------------------------------");
		
		deque.pop();
		System.out.println("deque8= "+deque);
		System.out.println("---------------------------------------");
	}

}
