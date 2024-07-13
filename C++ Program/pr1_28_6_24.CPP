#include<iostream>
using namespace std;
//WAP to find the square and cube of any number using user define function.
//Return type function
int square(int n)
{
	return n*n;
}
int cube(int n)
{
	return n*n*n;
}

//WAP to find the factorial using recursion function
//Recursion Function
int fact(int n)
{
	if(n==0 || n==1)
	{
		return 1;
	}
	else
	{
		return n*fact(n-1);
	}
}


//Default Argument Function
void show(char ch='@', int n=1)
{
	int i;
	for(i=1; i<=n; i++)
	{
		cout<<ch;
	}
}

//WAP to find the max value of 2 num using inline function
//Inline Fuction
inline int max(int a, int b)
{
	return a>b?a:b;
}
inline int min(int a, int b)
{
	return a<b?a:b;
}


int main()
{
	int a;
	cout<<"\n ENTER ANY NUMBER: ";
	cin>>a;
	cout<<"\n The Square="<<square(a);
	cout<<"\n The Cube="<<cube(a);
	cout<<"\n--------------------------\n";
	cout<<"\n The Factorial of "<<a<<" = "<<fact(a);
	cout<<"\n--------------------------\n";
	show();
	show('#');
	show('*',5);
	cout<<"\n--------------------------\n";
	cout<<"\n The Max="<<max(-2,-7);
	cout<<"\n The Max="<<max(2,7);
	cout<<"\n--------------------------\n";
	cout<<"\n The Min="<<min(-2,-7);
	cout<<"\n The Mix="<<min(2,7);
	cout<<"\n--------------------------\n";
	
	return 0;
}
