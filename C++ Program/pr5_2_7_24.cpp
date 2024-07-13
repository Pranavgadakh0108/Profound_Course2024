//MULTIPLE INHERITANCE

#include<iostream>
using namespace std;

class A{
	protected:
		int a;
	public:
		A()
		{
			a=3;
		}
};
class B{
	protected:
		int b;
	public:
		B()
		{
			b=4;
		}
};
class C:public A,public B{
	protected:
		int c;
	public:
		C()
		{
			c=5;
		}
		int mul()
		{
			return a*b*c;
		}
};
int main()
{
	C c1;
	cout<<"\n MULTIPLICATION= "<<c1.mul();
	return 0;
}
