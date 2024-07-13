#include<stdio.h>
//Return Type Function

//WAP to find the square and cube of any number using user defined function
void square (int n);
void cube (int n); //function declare


int main(){
	int a;
	printf("\n ENTER A NUMBER: ");
	scanf("%d",&a);
	square(a);
	cube(a); //Function calling
	
//	printf("\n Square of %d is =%d",a,square_of(a));
//	printf("\n Cube of %d is =%d",a,cube_of(a));
	return 0;
}

void square (int n)
{
	printf("\n THE SQUARE: %d", n*n);
}
void cube (int n)
{
	printf("\n THE CUBE : %d",n*n*n);
}
//int sqaure_of (int n)
//{
//	return n*n;
//}
//int cube_of (int n)
//{
//	return n*n*n;
//}
