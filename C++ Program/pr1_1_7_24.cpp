//WAP to read and print the n no. of employee details and find the employee having max salary.
#include<iostream>
#include<iomanip>
#include<string.h>
using namespace std;
class Employee{
	public:
		int id;
		char name[10];
		float sal;
		
		void getdata()
		{
			cout<<"\n ENTER EMPLOYEE ID NAME SALARY: ";
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
	cout<<"\n ENTER THE NUM. OF EMPLOYEE: ";
	cin>>n;
	for(i=0; i<n; i++)
	{
		e[i].getdata();
	}
	cout<<"\n --> DISPLAY EMPLYEE DETAILS <<--- \n";
	cout<<setw(10)<<"ID"<<setw(10)<<"NAME"<<setw(10)<<"SALARY"<<endl;
	
	for(i=0; i<n; i++)
	{
		e[i].show();
	}
	
	
//maxsal employee details

	float maxsal=e[0].sal;
	int eid = e[0].id;
	char ename[10];
	strcpy(ename, e[0].name);
	for(i=0; i<n; i++)
	{
		if(e[i].sal>maxsal)
		{
			maxsal=e[i].sal;
			eid=e[i].id;
			strcpy(ename,e[i].name);
		}
	}
	cout<<"\n\n -->> DISPLAY MAXSAL EMPLOYEE DETAILS <<--\n";
	cout<<setw(10)<<"ID"<<setw(10)<<"NAME"<<setw(10)<<"SALARY"<<endl;
	cout<<setw(10)<<eid<<setw(10)<<ename<<setw(10)<<maxsal<<endl;
	
//minsal employee details

	float minsal=e[0].sal;
	int e_id = e[0].id;
	char e_name[10];
	strcpy(e_name, e[0].name);
	for(i=0; i<n; i++)
	{
		if(e[i].sal<minsal)
		{
			minsal=e[i].sal;
			e_id=e[i].id;
			strcpy(e_name,e[i].name);
		}
	}
	cout<<"\n\n -->> DISPLAY MINSAL EMPLOYEE DETAILS <<--\n";
	cout<<setw(10)<<"ID"<<setw(10)<<"NAME"<<setw(10)<<"SALARY"<<endl;
	cout<<setw(10)<<e_id<<setw(10)<<e_name<<setw(10)<<minsal<<endl;

//INCREMENT THE 10% OF EACH EMPLOYEE

	cout<<"\n\n--> AFTER SALARY INCREMENT EMPLOYEE DETAILS <<--\n";
	cout<<setw(10)<<"ID"<<setw(10)<<"NAME"<<setw(10)<<"SALARY"<<endl;
	float s;
	for(i=0; i<n; i++)
	{
		s=e[i].sal+e[i].sal*10/100;
		cout<<setw(10)<<e[i].id<<setw(10)<<e[i].name<<setw(10)<<s<<endl;
	}
		
	return 0;
}
