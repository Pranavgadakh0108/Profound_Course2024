//operators in cpp

#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	int a=-3, b=5 ,c=-6, res;
	a*=b;
	cout<<"\n a="<<a;
	b-=a;
	cout<<"\n b="<<b;
	a+=b;
	cout<<"\n a="<<a;
	cout<<"\n-----------------\n";
	
	res=(a>c && a!=b)||(b<c)?100:200;
	cout<<"\n res="<<res;
	cout<<"\n-----------------\n";
	
	int d=5;
	cout<<--a<<"  "<<a--<<"  "<<a++<<"  "<<++a;
	cout<<"\n-----------------\n";
	
	int e=10, f=20;
	float g=56.34567467;
	
	cout<<setw(10)<<e<<setw(10)<<f<<endl;
	cout<<setw(10)<<setfill('-')<<e<<setw(10)<<setfill('-')<<f<<endl;
	cout<<setprecision(4)<<g;
	return 0;
}
