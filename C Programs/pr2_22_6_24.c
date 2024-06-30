//WAP to swapping the 2 no. using pointer and function
#include<stdio.h>
void swap(int *a, int *b)
{
	int temp=*a;
	*a=*b;
	*b=temp;
}
int main()
{
	int x=10, y=20;
	printf("\n x=%d y=%d",x,y);
	swap(&x,&y);
	printf("\n x=%d y=%d",x,y);
	
	return 0;
}
