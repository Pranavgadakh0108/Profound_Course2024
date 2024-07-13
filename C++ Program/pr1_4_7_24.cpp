//OPERATOR OVERLOADING
//WAP to overload unary minus(-) operator
#include<iostream>
using namespace std;
class test{
	int a,b,c;
	public:
		test(int x, int y, int z)
		{
			a=x;
			b=y;
			c=z;
		}
		void show()
		{
			cout<<"\n a="<<a<<" b="<<b<<" c="<<c;
		}
		void operator -()
		{
			a=-a;
			b=-b;
			c=-c;
		}
};
int main()
{
	test t(10,-20,30);
	t.show();
	-t; //activates unary minus
	t.show();
	return 0;
}
