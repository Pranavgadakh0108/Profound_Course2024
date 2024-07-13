//ARRAY ELEMENTS PASS BY THE FUNCTION


#include<stdio.h>
int main()
{
	int a[]={10,20,30,40,50};
	sum_avg(a,5);
	printf("\n THE MAX VALUE IS=%d",max(a,5));
	printf("\n THE MIN VALUE IS=%d",min(a,5));
	return 0;
}

//WAP to find the sum & avg of array elements using function
void sum_avg(int a[], int n)
{
	int i, sum=0;
	float avg;
	for(i=0; i<n; i++)
	{
		sum=sum+a[i];
	}
	avg=sum/n;
	printf("\n SUM=%d AVG=%f ",sum,avg);
	printf("\n --------------------\n ");
	
}

//WAP to find the min & max value of N nimbers of array element using function
int max(int a[], int n)
{
	int i, m;
	m=a[0];
	for(i=0; i<n; i++)
	{
		if(a[i]>m)
		{
			m=a[i];
		}
	}
	return m;
}
int min(int a[], int n)
{
	int i, m;
	m=a[0];
	for(i=0; i<n; i++)
	{
		if(a[i]<m)
		{
			m=a[i];
		}
	}
	return m;
}
