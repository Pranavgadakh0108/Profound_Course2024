#include<Stdio.h>
//WAP to print the address of the variable
int main()
{
	int a=10, b=20;
	printf("\n a=%d address=%u",a,&a);
	printf("\n b=%d address=%u",b,&b);
	printf("\n--------------------------\n");
	
//WAP POINTER POINT TO THE VARIABLE
	
	int c=10, *p;
	p=&c;
	printf("\n c=%d address=%u",c,&c);
	printf("\n *p=%d address=%u",*p,p);
	printf("\n--------------------------\n");
	
//NULL POINTER

	int d, *pt;
	pt=&d;
	printf("\n d=%d address=%u",d,&d);
	printf("\n *pt=%d",*pt);
	printf("\n--------------------------\n");
	
//POINTER TO POINTER

	int e=10, *f,*g;
	f=&e;
	g=f;
	printf("\n e=%d address=%u",e,&e);
	printf("\n *f=%d address=%u",*f,f);
	printf("\n *g=%d address=%u",*g,g);
	printf("\n--------------------------\n");
	
//POINTER ARITHMATIC 
	
	int i=10, j=20;
	int *k, *l;
	k=&i;
	l=&j;
	++*k;
	--*l;
	printf("\n *k=%d *l=%d", *k,*l);
	printf("\n Addition= %d", *k+*l);
	if(*k==*l)
	{
		printf("\n BOTH ARE SAME");
	}
	else
	{
		printf("\n BOTH ARE NOT SAME");
	}
	
	return 0;
}
