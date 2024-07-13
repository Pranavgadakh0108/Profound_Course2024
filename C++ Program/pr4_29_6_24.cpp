//ARRAY \OF OBJECT
//WAP to read and print N number of employee details

#include<iostream>
#include<iomanip>
using namespace std;
class Employee{
	int id;
	char name[10];
	float sal;
	
	public:
		void getdata()
		{
			cout<<"\n ENTER THE EMPLOYEE ID NAME SALARY: ";
			cin>>id>>name>>sal;
		}
		void show()
		{
			cout<<setw(10)<<id<<setw(10)<<name<<setw(10)<<sal<<endl;
		}
};
int main()
{
	Employee e[100];
	int i,n;
	cout<<"\n ENTER THE NUMBER OF EMPLYEES: ";
	cin>>n;
	for(i=0; i<n; i++)
	{
		e[i].getdata();
	}
	cout<<"\n --->> DISPLAY EMPLOYEE DETAILS <<--- \n";
	cout<<"\n--------------------------------------\n";
	cout<<setw(10)<<"ID"<<setw(10)<<"NAME"<<setw(10)<<"SALARY"<<endl;
	cout<<"\n--------------------------------------\n";
	for(i=0; i<n; i++)
	{
		e[i].show();
	}
	return 0;
}
