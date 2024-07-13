//HW
//WAP TO FIND THE 2nd largest element of ARRAY
#include<stdio.h>
int main(){
	
	int a[10], i,n,j,temp;
	prinf("\n ENTER THE HOW MANY ELEMENT: ");
	scanf("%d",&n);
	prinf("\n ENTER THE ELEMENTS: ");
	for(i=0; i<n; i++)
	{
		scanf("%d",&a[i]);
	}
	printf("\n DISPLAY THE ARRAY: ");
	for(i=0; i<n; i++)
	{
		printf("%4d",a[i]);
	}
	return 0;
}
