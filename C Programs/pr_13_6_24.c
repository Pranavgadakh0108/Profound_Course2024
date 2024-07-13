#include<stdio.h>
int main(){
	
//WAP to Access the Array element
	int a[]={-5,8,-6,-7,-3,-2,5,-1};
	
	printf("\n %d",a[4]);
	printf("\n %d",a[2]-5);
	printf("\n %d",a[5]+3);
	printf("\n %d",--a[6]-3);
	printf("\n-----------------------------\n");
	
//WAP Read & print the N numbers of Arrayelements.

	int b[100],i,n;
	printf("\n ENTER THE HOW MANY ELEMENT: ");
	scanf("%d", &n);
	for(i=0; i<n; i++)
	{
		printf("\n ENTER ARRAY ELEMENT a[%d]: ",i);
		scanf("%d",&b[i]);
	 } 
	 printf("\n DISPLAY ARRAY ELEMENTS...");
	 printf("\n INDEX=VALUE");
	 for(i=0; i<n; i++)
	 {
	 	printf("\n a[%d]=%d",i,b[i]);
	 }
	printf("\n-----------------------------\n");
	
//WAP to find the sum & avg of N numbers Array Element.

	int sum=0;
	float avg;
	for(i=0; i<n; i++)
	{
		sum=sum+b[i];
	}
	avg=(float)sum/n;
	printf("\n SUM=%d AVG=%.2f",sum,avg);
	printf("\n-----------------------------\n");
	
//WAP to find the MAX & MIN value from Array

	int max,min=b[0];
	for(i=0; i<n; i++)
	{
		if(b[i]>max)
		{
			max=b[i];
		}
	}
	for(i=0; i<n; i++)
	{
		if(b[i]<min)
		{
			min=b[i];
		}
	}
	printf("\n MAX VALUE=%d  MIN VALUE=%d",max,min);
	
	return 0;
}
