//TWO DIMENSIONAL ARRAY

#include<stdio.h>
int main(){
	
//WAP TO READ ANF PRINT THE MATRIX ELEMENT

	int a[10][10],i,j,r,c;
	printf("\n ENTER THE NO. OF ROWS AND COLUMNS: ");
	scanf("%d%d",&r,&c);
	printf("\n ENTER THE MATRIX ELEMENTS: ");
	for(i=0; i<r; i++)
	{
		for(j=0; j<c; j++)
		{
			scanf("%d",&a[i][j]);
		}
	
	}
	printf("\n DISPLAY ARRAY ELEMENTS: \n");
	for(i=0; i<r; i++)
	{
		for(j=0; j<c; j++)
		{
			printf("%4d",a[i][j]);
		}
		printf("\n");
	
	}
	printf("\n--------------------------------------\n");
	
//WAP TO FIND THE TRANSPOSE OF MATRIX
	int t[10][10];
	for(i=0; i<r; i++)
	{
		for(j=0; j<c; j++)
		{
			t[i][j]=a[j][i];
		}
	
	}
	printf("\n DISPLAY TRANSPOSE OF MATRIX: \n");
	for(i=0; i<r; i++)
	{
		for(j=0; j<c; j++)
		{
			printf("%4d",t[i][j]);
		}
		printf("\n");
	
	}
	printf("\n--------------------------------------\n");
	
	
	
	return 0;
}
