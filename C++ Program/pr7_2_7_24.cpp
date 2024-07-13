//STATIC POLYMORPHISM
//FUNCTION/METHOD OVERLOADING
#include<iostream>
using namespace std;

class test{
	public:
		void show(int a)
		{
			cout<<"\n a= "<<a;
		}
		void show(char a)
		{
			cout<<"\n a= "<<a;
		}
		void show(double a)
		{
			cout<<"\n a= "<<a;
		}
};
int main(){
	test t;
	t.show(20);
	t.show('p');
	t.show(235.123);
	return 0;
}
