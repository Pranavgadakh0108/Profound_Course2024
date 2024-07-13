//wap to count the total o. of vowels, consonants, digit, space from text file.
#include<iostream>
#include<fstream>
#include<string.h>
using namespace std;

int main()
{
	char a[1000];
	ifstream obj;
	obj.open("file.txt", ios::in | ios::app);
	obj.getline(a,40);
	obj.close();
	cout<<a<<endl;
	int i, v=0, c=0, d=0, s=0;
	for(i=0; i<strlen(a); i++)
	{
		if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
		{
			v++;
		}
		else if(a[i]>=48 && a[i]<=57)
		{
			d++;
		}
		else if(a[i]==32)
		{
			s++;
		}
		else
		{
			c++;
		}
	}
	cout<<"Vowels = "<<v<<" Consonants = "<<c<<" Digits= "<<d<<" Spaces= "<<s;
	return 0;
}
