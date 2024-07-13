//Arithmetic operations...
#include<stdio.h>

int main(){
//	int a, b;
//	printf("\n enter two values: ");
//	scanf("%d %d",&a,&b);
//	printf("\n Addition is= %d", a+b);
//	printf("\n Subtraction is= %d", a-b);
//	printf("\n Multiplication is= %d", a*b);
//	printf("\n Division is= %f", (float)a/b);
//	printf("\n Mod is= %d", a%b);
//	printf("\n-----------------------------");
	
	//WAP swapping 2 numbers using 3rd varible
	int p=10, q=20, temp;
	printf("\n p=%d q=%d", p, q);
	temp=p; 
	p=q;
	q=temp;
	printf("\n p=%d q=%d", p, q);
	printf("\n-----------------------------");
	
	//WAP swapping 2 numbers without using 3rd variable
	int i=10, j=20;
	printf("\n i=%d j=%d", i, j);
	i=i+j; //30
	j=i-j; //j=30-20=10
	i=i-j; //i=30-10=20
	printf("\n i=%d j=%d", i, j);
	printf("\n-----------------------------");
	
	//WAP to find the area and perimeter of rectangle.
	int l, w;
	printf("\n Enter a length and width of rectangle: ");
	scanf("\n %d %d",&l,&w);
	printf("\n Area of rectangle is : %d",l*w);
	printf("\n Permimeter of Rectangle is : %d", 2*(l+w));
	

	return 0;
}
