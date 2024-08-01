package com.profound.java_day18;

interface OddNum{
	void findOdd();
}

public class OddNumbers implements OddNum{
	
	@Override
	public void findOdd() 
	{
		System.out.println("Odd Number between 1 to 50: ");
		int num=1;
		while(num<=50)
		{
			if(num%2!=0)
			{
				System.out.println(num);
			}
			num++;
		}
	}

	public static void main(String[] args) {
		OddNumbers o = new OddNumbers();
		o.findOdd();
	}
}
