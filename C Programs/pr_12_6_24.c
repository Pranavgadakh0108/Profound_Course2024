//WAP to find the factorial using user defined function
#include<stdio.h>

void fact(int n);

int main()
{
	int a;
	printf("\n ENTER THE NUMBER: ");
	scanf("%d",&a);
	fact(a);
	fact(10);
	return 0;
}

void fact(int n)
{
	int f=1;
	while(n>0)
	{
		f=f*n;
		n--;
	}
	printf("\n THE FACTORIAL IS: %d",f);
}
