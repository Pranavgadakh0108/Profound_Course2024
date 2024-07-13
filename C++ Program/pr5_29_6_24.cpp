#include<iostream>
#include<iomanip>
using namespace std;
class Student{
	int rno;
	char name[10];
	float marks;
	
	public:
		void getdata()
		{
			cout<<"\n ENTER STUDNENT ROLL NAME MARKS : ";
			cin>>rno>>name>>marks;
		}
		void display()
		{
			cout<<setw(10)<<rno<<setw(10)<<name<<setw(10)<<marks<<endl;
		}
};
int main(){
	Student s[100];
	int i,n;
	cout<<"\n ENTER THE NO. OF STUDENTS: ";
	cin>>n;
	for(i=0; i<n; i++)
	{
		s[i].getdata();
	}
	
	cout<<"\n --------------------------------"<<endl;
	cout<<"\n --->> DISPLAY STUDENT DATA <<---"<<endl;
	cout<<"\n --------------------------------"<<endl;
	cout<<setw(10)<<"ROLL"<<setw(10)<<"NAME"<<setw(10)<<"MARKS"<<endl;
	cout<<"\n --------------------------------"<<endl;
	for(i=0; i<n; i++)
	{
		s[i].display();
	}
	return 0;
	
}
