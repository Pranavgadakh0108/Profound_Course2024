//DYNAMIC POLYMORPHISM
//VIRTUAL FUNCTION

#include<iostream>
using namespace std;
class base{
	public:
		virtual void show()
		{
			cout<<"\n THIS IS BASE CLASS VIRTUAL FUNCTION..";
		}
};
class derived:public base{
	public:
		void show()
		{
			cout<<"\n THIS IS DERIVED VIRTUAL FUNCTION..";
		}
};
int main()
{
	base b,*p;
	derived d;
	p=&b;
	p->show();
	p=&d;
	p->show();
	return 0;
}
