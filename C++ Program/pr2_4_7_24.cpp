//wap to print a fibonacci series overload the unary increment operator(++)
#include<iostream>
#include<iomanip>
using namespace std;
class fibo{
	int f1,f2,f3;
	public:
		fibo()
		{
			f1=0;
			f2=1;
			f3=f1+f2;
			cout<<setw(5)<<f1<<setw(5)<<f2;
		}
		void show()
		{
			cout<<setw(5)<<f3;
		}
		void operator ++()
		{
			f1=f2;
			f2=f3;
			f3=f1+f2;
		}
};
int main()
{
	cout<<"\n -->> FIBONACCI SERIES <<-- \n";
	fibo f;
	int i;
	for(i=1; i<10; i++)
	{
		f.show();
		++f;
	}
	return 0;
}
