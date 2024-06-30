#include<stdio.h>
int main()
{
	
//POINTER AND ARRAY

	int a[]={4,-8,7,6,-1,8,-3};
	int *p;
	p=&a[3];
	printf("\n %d",*p);
	p=p-2;
	printf("\n %d",*p-5);
	p=a;
	printf("\n %d", *p+2);
	p=p+4;
	printf("\n %d",--*p-5);
	
	printf("\n--------------------------\n");
	
//C POINTERS & STRINGS
	
	char b[]="welcome friends";
	char *ptr;
	ptr=&b[3];
	printf("\n %c",*ptr);
	ptr=ptr-2;
	printf("\n %c",*ptr-1);
	ptr=b;
	printf("\n %c", *ptr+2);
	ptr=ptr+4;
	printf("\n %c",--*ptr-5);
		
	return 0;
}
