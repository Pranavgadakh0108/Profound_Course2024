#include<iostream>
using namespace std;
int main()
{
	char a;
	int b;
	float c;
	
	cout<<"\n ENTER ANY CHARACTER: ";
	cin>>a;
	cout<<"\n ENTER ANY INTEGER: ";
	cin>>b;
	cout<<"\n ENTER ANY FLOATING VALUE: ";
	cin>>c;
	
	cout<<"\n a="<<a;
	cout<<"\n b="<<b;
	cout<<"\n c="<<c;
	cout<<"\n-------------------------\n";
	
// wap to find the AREA and CIRCUMFERENCE of circle
	int r;
	const float pi=3.14;
	float area,circum;
	
	cout<<"\n ENTER THE RADIUS OF CIRCLE: ";
	cin>>r;
	
	area=pi*r*r;
	circum=2*pi*r;
	
	cout<<"\n AREA OF CIRCLE="<<area;
	cout<<"\n CIRCUMFERENCE OF CIRCLE="<<circum;
	
	return 0;
}
