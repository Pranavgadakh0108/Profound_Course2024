//HIERARCHICAL INHERITANCE

#include<iostream>
using namespace std;

class shape{
	protected:
		int l,w;
	public:
		shape()
		{
			cout<<"\n ENTER THE LENGTH AND WIDTH: ";
			cin>>l>>w;
		}
};

class rectangle:public shape{
	public:
		int area()
		{
			return l*w;
		}
};
class triangle:public shape{
	public:
		float area()
		{
			return 0.5*l*w;
		}
};
int main()
{
	rectangle r;
	cout<<"\n AREA OF RECTANGLE: "<<r.area();
	triangle t;
	cout<<"\n AREA OF TRIANGLE: "<<t.area();
	return 0;
}
