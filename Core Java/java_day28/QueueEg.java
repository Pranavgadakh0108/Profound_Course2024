package com.profound.java_day28;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEg {

	public static void main(String[] args) {
		
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		//inserting queue elements..
		
		q.add(3);
		q.add(2);
		q.add(1);
		
		q.offer(3);
		q.offer(10);
		
		System.out.print("Queue1:");
		Iterator it1 = q.iterator();
		while(it1.hasNext())
		{
			System.out.print(" "+it1.next());
		}
		
		System.out.println("\n---------------------");
		
		//remove head of the queue...
		q.remove();
		q.remove();
		
		System.out.print("Queue2:");
		Iterator it2 = q.iterator();
		while(it2.hasNext())
		{
			System.out.print(" "+it2.next());
		}
		
		System.out.println("\n---------------------");
		
		//retrives head of the queue
		
		System.out.println("head: "+q.element());
		System.out.println("\n---------------------");
		q.clear();
		
		//retrives head & if empty then return null...
		System.out.println("head: "+q.peek());
		System.out.println("\n---------------------");
		
		//retrives & removes the head or return null if empty.
		System.out.println("head: "+q.poll());
		
		
	}

}
