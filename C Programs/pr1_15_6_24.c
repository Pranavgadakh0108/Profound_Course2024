#include<stdio.h>
int main()
{
//WAP to find the SUM of diagonal of matrix element.
	int a[10][10], i,j,r,c,sum=0;
	
	printf("\n ENTER THE NO. OF ROWS & COLS: ");
	scanf("%d%d",&r,&c);
	if(r==c)
	{
		printf("\n ENTER THE MATRIX ELE: ");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				scanf("%d", &a[i][j]);
			}
		}
		printf("\n DISPLAY ARRAY ELE: \n");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				printf("%4d",a[i][j]);
			}
			printf("\n");
		}
		//SUM of DIAGONAL elements
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			} 
		}
		printf("\n SUM OF DIAGONAL ELE=%d",sum);
		
		//SUM of UPPER-DIAGONAL elements
		int up_sum=0;
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				if(i<j)
				{
					up_sum=up_sum+a[i][j];
				}
			} 
		}
		printf("\n SUM OF UPPER-DIAGONAL ELE=%d",up_sum);
		
		//SUM of LOWER-DIAGONAL elements
		int lo_sum=0;
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				if(i>j)
				{
					lo_sum=lo_sum+a[i][j];
				}
			} 
		}
		printf("\n SUM OF LOWER-DIAGONAL ELE=%d",lo_sum);
	}
	else
	{
		printf("\n ENTER THE SAME NO. OF ROWS AND COLS");
	}
	
	return 0;
}
