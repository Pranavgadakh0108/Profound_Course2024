//wap copy the content of 1 file to another file
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
	
	ofstream obj1;
	obj1.open("pratik.txt");
	obj1<<a;
	obj1.close();
	return 0;
}
