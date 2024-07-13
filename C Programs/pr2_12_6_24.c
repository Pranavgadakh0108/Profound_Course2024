//RECURSIVE FUNCTION
//WAP to find the factorial using recursion function
#include<stdio.h>
int fact(int n)
{
	if(n==0 || n==1)
		return 1;
	else
		return n*fact(n-1);
}
int main(){
	int a;
	printf("\n  ENTER THE NUM: ");
	scanf("%d",&a);
	printf("\n THE FACTORIAL IS %d",fact(a));
	return 0;
}
