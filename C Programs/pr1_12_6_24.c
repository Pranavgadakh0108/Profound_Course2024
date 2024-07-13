//WAP Accept the 3 number to find the max value using user defined function
#include<stdio.h>

int max(int a, int b, int c)
{
	if(a>=b && a>=c)
	{
		return a;
	}
	else if (b>=a && b>=c)
	{
		return b;
	}
	else
	{
		return c;
	}
}

int main(){
	
	printf("\n THE MAX IS =%d",max(-2,-5,-7));
	printf("\n THE MAX IS =%d",max(2,5,7));
	return 0;
}
