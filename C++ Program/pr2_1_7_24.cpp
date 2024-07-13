//DEFAULT CONSTRUCTOR

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
		void show()
		{
			cout<<"\n a="<<a<<" b="<<b;
		}
};
int main()
{
	test t;
	t.show();
	return 0;
}
