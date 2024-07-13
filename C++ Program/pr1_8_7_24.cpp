//FILE HANDLING
//wap to write the data from file
#include<iostream>
#include<fstream>
using namespace std;

int main()
{
	char a[1000];
	ofstream obj;
	obj.open("pranav.txt"); //file created/open
	
	cout<<"\n ENTER ANY DATA: ";
	cin.getline(a,40);
	//obj.write(a,40);  // data written
	obj<<a;
	obj.close(); //file closed
	return 0;
}
