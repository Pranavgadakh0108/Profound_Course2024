#include<iostream>
using namespace std;
int main()
{
	//getline()
	
	char a[50];
	cout<<"\n ENTER THE STRING: ";
	cin.getline(a, 50);
	cout<<"\n ENTERED TEXT: "<<a;
	return 0;
}
