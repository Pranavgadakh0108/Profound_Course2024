//WAP to find the volume of the box(way-2)
#include<iostream>
using namespace std;

class box{
	int l,w,h;
	public:
		void getdata()
		{
			cout<<"\n ENTER LENGTH WIDTH HEIGHT: ";
			cin>>l>>w>>h;
		}
		int volume()
		{
			return l*w*h;
		}
};
int main()
{
	box b;
	b.getdata();
	cout<<"\n VOLUME OF THE BOX= "<<b.volume();
	return 0;
}
