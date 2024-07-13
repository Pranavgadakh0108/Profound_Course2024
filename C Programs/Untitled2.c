#include<stdio.h>
int square(int n);
int cube(int n);
int main(){
	int a;
	printf("\n ENTER A NUMBER: ");
	scanf("%d", &a);
	printf("\n Square is=%d", square(a));
	printf("\n Cube is=%d", cube(a));
	return 0;
}

int square(int n)
{
	return n*n;
}
int cube(int n)
{
	return n*n*n;
}
