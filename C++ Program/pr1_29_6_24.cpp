//WAP TO FIND THE VOLUME OF THE BOX
#include<iostream>
using namespace std;
class box{
	
	public:
		int l,w,h;
		int volume()
		{
			return l*w*h;
		}
};
int main(){
	box b;
	cout<<"\n enter the length width height: ";
	cin>>b.l>>b.w>>b.h;
	cout<<"\n volume of box= "<<b.volume();
	return 0;
}
