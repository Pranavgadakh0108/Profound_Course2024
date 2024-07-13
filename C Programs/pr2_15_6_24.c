//WAP TO ADDITION , SUBTRACTION AND MULTIPLICATION OF 2 MATRICES...
#include<stdio.h>
int main()
{
	int a[3][3], b[3][3], c[3][3], d[3][3], e[3][3], i,j;
	
	printf("\n ENTER 1ST 3x3 MATRIX ELEMENTS: ");
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	
	printf("\n ENTER 2nd 3x3 MATRIX ELEMENTS: ");
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			scanf("%d",&b[i][j]);
		}
	}
	
	printf("\n DISPLAY 1ST 3x3 MATRIX ELEMENTS: \n");
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			printf("%4d",a[i][j]);
		}
		printf("\n");
	}
	
	printf("\n DISPLAY 2ND 3x3 MATRIX ELEMENTS: \n");
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			printf("%4d",b[i][j]);
		}
		printf("\n");
	}
	
	//ADDITION MATRIX 
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	printf("\n DISPLAY ADDITION OF TWO 3x3 MATRIX ELEMENTS: \n");
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			printf("%4d",c[i][j]);
		}
		printf("\n");
	}
	
	//SUBTRACTION MATRIX 
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			d[i][j]=a[i][j]-b[i][j];
		}
	}
	printf("\n DISPLAY SUBTRACTION OF TWO 3x3 MATRIX ELEMENTS: \n");
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			printf("%4d",d[i][j]);
		}
		printf("\n");
	}
	
	//MULTIPLICATION MATRIX 
	int k;
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			e[i][j]=0;
			for(k=0; k<3; k++)
			{
				e[i][j]+=a[i][k]*b[k][j];
			}	
		}
	}
	printf("\n DISPLAY MULTIPLICATION OF TWO 3x3 MATRIX ELEMENTS: \n");
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			printf("%5d",e[i][j]);
		}
		printf("\n");
	}
	
	
	return 0;
}
