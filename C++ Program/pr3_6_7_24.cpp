//FORMATED I/O OPERATORS/FUNCTION:
//IOS CLASS FUNCTION

#include<iostream>
using namespace std;
int main()
{
	int a=10, b=20;
	float c=45.5345653;
	
	cout.width(10);
	cout<<a;
	cout.width(10);
	cout<<b<<endl;
	cout.width(10);
	cout.fill('-');
	cout<<a;
	cout.width(10);
	cout.fill('-');
	cout<<b<<endl;
	
	cout.precision(4);
	cout<<c;
	
	return 0;
}
