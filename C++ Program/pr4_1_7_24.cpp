//COPY CONSTRUCTOR
#include<iostream>
using namespace std;
class test{
	int a,b;
	public:
		test()
		{
			a=10;
			b=20;
		}
		test(int x, int y)
		{
			a=x;
			b=y;
		}
		void show()
		{
			cout<<"\n a="<<a<<" b="<<b;
		}
};
int main()
{
	test t;
	test t1(33,55);
	test t2=t1;
	t2.show();
	return 0;
}
