//open file using file mode
//wap to write a data from the file using file mode
#include<iostream>
#include<fstream>
using namespace std;

int main()
{
	char a[1000];
	ofstream obj;
	obj.open("file.txt", ios::out | ios::app);
	cout<<"\n ENTER THE DATA: ";
	cin.getline(a,20);
	obj<<a;
	obj.close();
	return 0;
}
