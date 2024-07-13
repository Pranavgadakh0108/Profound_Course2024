//HYBRID INHERITANCE

#include<iostream>
#include<iomanip>
#include<string.h>
using namespace std;

class student{
	public:
		int rno;
		char name[20];
		void getdata()
		{
			cout<<"\n ENTER STUDENT ROLL AND NAME: ";
			cin>>rno>>name;
		}
};

class test:public student{
	public:
		int n,i,mark[10],total;
		void getmark()
		{
			total=0;
			cout<<"\n ENTER NO. OF SUBJECT: ";
			cin>>n;
			
			for(i=0; i<n; i++)
			{
				cout<<"\n ENTER SUBJECT "<<i<<" MARK: ";
				cin>>mark[i];
				total=total+mark[i];
			}
		}
};

class sport{
	public:
		int smark;
		void getsportmark()
		{
			cout<<"\n ENTER THE SPORT MARK: ";
			cin>>smark;
		}
};

class result:public test, public sport{
	int t;
	float per;
	char grade[10];
	public:
		void show()
		{
			t=total+smark;
			per=(float)t/(n+1);
			if(per>=70)
			strcpy(grade,"A");
			else if(per>=60)
			strcpy(grade,"B");
			else
			strcpy(grade,"C");
			
			cout<<setw(10)<<rno<<setw(10)<<name<<setw(10)<<t<<setw(10)<<per<<setw(10)<<grade<<endl;		
		}
};
int main(){
	result r;
	r.getdata();
	r.getmark();
	r.getsportmark();
	cout<<"\n -->> DISPLAY STUDENT RESULT <<-- \n";
	cout<<setw(10)<<"ROLL"<<setw(10)<<"NAME"<<setw(10)<<"TOTAL"<<setw(10)<<"PER"<<setw(10)<<"GRADE"<<endl;
	r.show();
	return 0;
}
