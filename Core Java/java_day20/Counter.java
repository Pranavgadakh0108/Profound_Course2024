package com.profound.java_day20;

public class Counter {

	static int count=0;
	Counter()
	{
		count++;
	}
	void display()
	{
		System.out.println("Count= "+count);
	}
	public static void main(String[] args) {
		Counter c = new Counter();
		c.display();
		Counter c1 = new Counter();
		c1.display();
		Counter c2 = new Counter();
		c2.display();
	}
}
