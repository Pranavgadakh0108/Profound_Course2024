//SINGLE LEVEL INHERITANCE
#include<iostream>
#define pi 3.14
using namespace std;

class circle{
	protected:
		int r;
		
	public:
		void getdata()
		{
			cout<<"\n ENTER THE RADIUS: ";
			cin>>r;
		}
		float area()
		{
			return pi*r*r;
		}
};
class cylinder:public circle{
	protected:
		int h;
	public:
		void getheight()
		{
			cout<<"\n ENTER HEIGHT OF CYLINDER: ";
			cin>>h;
		}
		float volume()
		{
			return area()*h;
		}
		void show()
		{
			cout<<" RADIUS= "<<r<<" AREA OF CIRCLE= "<<area()<<" HEIGHT= "<<h<<" VOLUME= "<<volume();
		}
};
int main()
{
	cylinder c;
	c.getdata();
	c.getheight();
	c.show();
	return 0;
}
