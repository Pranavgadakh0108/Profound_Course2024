//WAP to find the sum of nth number using recursion function
#include<stdio.h>

int sum (int n)
{
	if (n==0)
		return 0;
	else if (n==1)
		return 1;
	else
		return n+sum(n-1);
}

int main(){
	int a;
	printf("\n ENTER NUMBER : ");
	scanf("%d",&a);
	printf("\n THE SUM=%d",sum(a));
	return a;
}

