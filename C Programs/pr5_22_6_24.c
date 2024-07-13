//WAP to find the SUM & AVG of n No. of elements using dynamic memory allocation function
#include<stdio.h>
#include<stdlib.h>
int main()
{
	int n, i, sum=0, *p;
	float avg;
	printf("\n ENTER THE NO. OF ELEMENTS: ");
	scanf("%d",&n);
	p=(int *)malloc(n*sizeof(int));
	if(p==NULL)
	{
		exit(0);
	}
	printf("\n ENTER THE ELEMENTS: ");
	for(i=0; i<n; i++)
	{
		scanf("%d",p+i);
		sum=sum+*(p+1);
	}
	int n1;
	printf("\n ENTER THE NEW SIZE: ");
	scanf("%d",&n1);
	p=(int *)realloc(p,n1);
	printf("\n ENTER THE ELEMENT: ");
	for(i=0; i<n; i++)
	{
		scanf("%d",p+i);
		sum=sum+*(p+i);
	}
	avg=(float)sum/(n+n1);
	printf("\n the sum=%d avg=%f",sum,avg);
	free(p);
	return 0;
}
