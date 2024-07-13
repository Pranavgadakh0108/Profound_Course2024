//PARAMETERISED CONSTRUCTOR
#include<iostream>
using namespace std;
class test{
	int a,b;
	public:
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
	test t(55,88);
	t.show();
	return 0;
}
