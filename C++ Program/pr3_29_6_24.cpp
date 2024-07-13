//WAP to read and print the employee details
#include<iostream>
#include<iomanip>
using namespace std;
class Employee{
	int eid;
	char ename[10];
	float sal;
	public:
		void getdata()
		{
			cout<<"\n ENTER EMPLOYEE ID NAME SALARY: ";
			cin>>eid>>ename>>sal;
		}
		void show()
		{
			cout<<setw(10)<<eid<<setw(10)<<ename<<setw(10)<<sal<<endl;
		}
};
int main(){
	Employee e;
	e.getdata();
	cout<<"\n --->> DISPLAY EMPLOYEE DETAILS <<---"<<endl;
	cout<<setw(10)<<"ID"<<setw(10)<<"NAME"<<setw(10)<<"SALARY"<<endl;
	e.show();
	return 0;
}
