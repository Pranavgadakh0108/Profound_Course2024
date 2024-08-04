package com.profound.java_day20;

public class StaticVariable1 {
	int roll;
	String name;
	static String collegeName = "MET BKC IOE";
	
	public StaticVariable1(int r, String n) {
		roll=r;
		name=n;
	}

	void studData()
	{
		System.out.println("Student roll= "+roll+" name= "+name+" College Name= "+collegeName);
	}
	public static void main(String[] args) {
		StaticVariable1 s1 = new StaticVariable1(1, "Pranav");
		StaticVariable1 s2 = new StaticVariable1(2, "Pratik");
		StaticVariable1 s3 = new StaticVariable1(3, "Swapnil");
		
		s1.studData();
		s2.studData();
		s3.studData();
	}
}
