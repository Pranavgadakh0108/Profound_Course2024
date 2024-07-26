package com.profound.java_day13;

import java.util.Scanner;

class College{
	String collegeName;
	String collegeCity;
}
class Student extends College{
	int studentId;
	String studentName;
}
public class Exam extends Student{
	int pythonMarks,javaMarks, cppMarks;
	
	Scanner sc = new Scanner(System.in);
	Exam(){
		System.out.println("ENTER STUDENT ID: ");
		studentId = sc.nextInt();
		System.out.println("ENTER STUDENT NAME: ");
		studentName = sc.next();
		System.out.println("ENTER COLLEGE NAME: ");
		sc.nextLine();
		collegeName = sc.nextLine();
		System.out.println("ENTER COLLEGE CITY: ");
		collegeCity = sc.next();
		System.out.println("ENTER STUDENT MARKS(PYTHON,JAVA,CPP): ");
		pythonMarks = sc.nextInt();
		javaMarks = sc.nextInt();
		cppMarks = sc.nextInt();
	}
	
	void result()
	{
		System.out.println("--------------------------------------------------");
		System.out.println("STUDENT ID: "+studentId+" STUDENT NAME: "+studentName);
		System.out.println("COLLEGE: "+collegeName+","+collegeCity);
		System.out.println("STUDENT MARKS:: PYTHON:"+pythonMarks+" JAVA:"+javaMarks+" CPP:"+cppMarks);
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		Exam e = new Exam();
		e.result();
	}
}
