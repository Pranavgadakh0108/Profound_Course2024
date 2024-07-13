//POINTERS : a variable that stores the memory address of another variable.
// * = value of address
// & = address of
#include<stdio.h>
int main()
{
	int age=22;
	int *p =&age;
	int _p =*p;
	
	printf("\n &age=%p",&age); //hexadecimal
	printf("\n &age=%u",&age); //unsigned int
	
	printf("\n *p=%u",*p);
	printf("\n _p=%u",_p);
	
	printf("\n--------------------------\n");
	printf("\n age=%d",age);
	printf("\n *p=%d",*p);
	printf("\n *(&age)=%d",*(&age));
	printf("\n--------------------------\n");
	
	float price=109.23;
	float *ptr=&price;
	float **pptr =&ptr;
	
	printf("\n %u",&price);
	printf("\n %u",*ptr);
	printf("\n %u",**pptr);
	printf("\n %d",ptr);
	printf("\n %d",**pptr);
	printf("\n--------------------------\n");
	
	
	int i=5;
	int *m=&i;
	int **mptr=&m;
	printf("\n %d",**mptr);
	
	return 0;
}
