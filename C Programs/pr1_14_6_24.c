//WAP to count even and odd no.of N numbers of array element
#include<stdio.h>
int main(){
	int a[100],i,n,even=0,odd=0;
	printf("\n ENTER THE HOW MANY ELEMENTS: ");
	scanf("%d",&n);
	printf("\n ENTER THE ARRAY ELEMENTS: ");
	for(i=0; i<n; i++){
		scanf("%d",&a[i]);
	}
	for(i=0; i<n; i++)
	{
		if(a[i]%2==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
	}
	printf("\n TOTAL NO EVEN=%d AND ODD=%d",even,odd);
	printf("\n--------------------------------------\n");
	
//WAP TO SORT THE ARRAY ELEMENT
	//sorting
	int j, temp, b[100];
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
	
	
	printf("\n--------------------------------------\n");
	
	//Find prime no.
	int count;
	
	for(i=0; i<n; i++){
		count=0;
		for(j=2; j<a[i]; j++){
			if(a[i]%j==0){
				count=1;
				break;
			}
		}
		if(count==0)
		{
			printf("%4d",a[i]);
		}

	}
	printf("\n--------------------------------------\n");
	
//WAP to searching a array element
	int find,k=0;
	
	printf("\n ENTER ANY NUMBER TO BE SEARCH: ");
	scanf("%d",&find);
	for(i=0; i<n; i++)
	{
		if(a[i]==find)
		{
			printf("\n a[%d]=%d",i,a[i]);
			k++;
		}
	}
	if(k==0)
	{
		printf("\n ELEMENT NOT FOUND!!!!");
	}

	printf("\n--------------------------------------\n");
	return 0;
}

