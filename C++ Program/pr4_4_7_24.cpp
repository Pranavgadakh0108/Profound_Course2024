//PURE VIRTUAL FUNCTION
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
		virtual int area()=0;
		virtual void show()=0;
};
class rectangle:public shape
{
	public:
		int area()
		{
			return l*w;
		}
		void show()
		{
			cout<<"\n length= "<<l<<" width= "<<w<<" Area= "<<area();
		}
};
int main()
{
	rectangle r;
	r.show();
	return 0;
}
