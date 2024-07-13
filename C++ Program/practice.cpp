#include<iostream>
#include<iomanip>
#include<string.h>
#define pi 3.14
using namespace std;

class rectangle{
	protected:
		int l,w;
	public:
		rectangle()
		{
			cout<<"\n Enter l and w :";
			cin>>l>>w;
		}
		
		int area()
		{
			return l*w;
		}
};

class box:public rectangle{
	protected:
		int h;
	public:
		box()
		{
			cout<<"\n Enter h: ";
			cin>>h;
		}
		
		int volume()
		{
			return area()*h;
		}
		
		void show()
		{
			cout<<"\n l= "<<l<<" w= "<<w<<" area= "<<area()<<" h= "<<h<<" vol= "<<volume()<<endl;
		}
};

int main()
{
	box b;
	b.show();
	return 0;
}
