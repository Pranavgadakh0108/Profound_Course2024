//SINGLE LEVEL INHERITANCE

#include<iostream>
using namespace std;

class rectangle{
	protected:
		int l,w;
	public:
		rectangle()
		{
			cout<<"\n ENTER THE LENGTH & WIDTH: ";
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
			cout<<"\n ENTER THE HEIGHT: ";
			cin>>h;
		}
		int volume()
		{
			return area()*h;
		}
		void show()
		{
			cout<<"length= "<<l<<" width= "<<w<<" Area of rectangle= "<<area()<<" height= "<<h<<" volume of box= "<<volume();
		}
};
int main(){
	box b;
	b.show();
	return 0;
}
