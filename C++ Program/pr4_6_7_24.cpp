//FORMATED I/O OPERATOR/FUNCTION
//MANIPULATORS 

#include<iostream>
#include<iomanip>
using namespace std;

int main()
{
	int a=10, b=20;
	float c=67.12345678;
	
	cout<<setw(10)<<a<<setw(10)<<b<<endl;
	cout<<setw(10)<<setfill('-')<<a<<setw(10)<<setfill('-')<<b<<endl;
	return 0;
}
