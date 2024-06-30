#include<stdio.h>
int main()
{
//WAP TO PRINT THE ADDRESS OF THE VARIABLE
	int a=10, b=20;
	printf("\n a=%d address=%u",a,&a);
	printf("\n b=%d address=%u",b,&b);
	printf("\n----------------------------------\n");
	
//WAP POINTER POINT TO THE VARIABLE
	int c=10, *p;
	p=&c;
	printf("\n c=%d adddress=%u",c,&c);
	printf("\n *p=%d address=%u",*p,p);
	printf("\n----------------------------------\n");
	
	
	return 0;
}
