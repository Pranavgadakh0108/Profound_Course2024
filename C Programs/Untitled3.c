#include<stdio.h>
int main()
{
	int a[100], i, n, j, temp;
	printf("\n ENTER THE HOW MANY ELEMENT: ");
	scanf("%d",&n);
	printf("\n ENTER ELEMENTS: ");
	for(i=0; i<n; i++)
	{
		scanf("%d",&a[i]);
	}
	printf("\n DISPLAY ELEMENTS: ");
	for(i=0; i<n; i++)
	{
		printf("%3d",a[i]);
	}
	
	if(n==0 || n==1)
	{
		printf("\n NO SECOND LARGEST AND SMALLEST ELEMENT IS PRESENT !!");
	}
	else
	{
		for(i=0; i<n; i++)
		{
			for(j=i+1; j<n; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		printf("\n SORTED ARRAY: ");
		for(i=0; i<n; i++)
		{
			printf("%3d",a[i]);
		}
		
		printf("\n--------------------------------------\n");
		//Second largest element
		printf("\n SECOND LARGEST ELEMENT:%d ",a[n-2]);
		
		//Second smallest element
		printf("\n SECOND SMALLEST ELEMENT:%d",a[1]);
	}
	
	
	return 0;
}
