//wap to read a data from file
#include<iostream>
#include<fstream>
using namespace std;
int main()
{
	char a[1000];
	ifstream obj;
	obj.open("pranav.txt");
	obj.getline(a,40);
	obj.close();
	cout<<a;
	return 0;
}
