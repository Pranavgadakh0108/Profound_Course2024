#include<stdio.h>

int main(){
	
//for loop
//	int a;
//	for(a=1; a<=10; a++)
//	{
//		printf("\n a=%d",a);
//	}
//	printf("\n ---------------------------------");
////WAP to find the sum of nth number
//	int b, i,sum=0;
//	printf("\n ENTER NUMBER: ");
//	scanf("%d",&b);
//	for(i=0; i<=b; i++)
//	{
//		sum=sum+i;
//	}
//	printf("\n THE SUM OF %d NUMBERS IS : %d", b, sum);
//	printf("\n ---------------------------------");

//break statement
//	int c=0;
//	while(c<=10)
//	{
//		if(c==5)
//		{
//			break;
//		}
//		printf("\n c=%d", c);
//		c++;
//	}
//	printf("\n ---------------------------------");
	
//continue statement
//	int d=1;
//	while(d<=10)
//	{
//		d++;    
//		if(d==5)
//		{
//			continue;
//		}
//		printf("\n d=%d", d);
//		
//	}
//	printf("\n ---------------------------------");
//	
//	int e=4, f=0;
//	while(e>=0){
//		e--;
//		f++;
//		if(e==f)
//		{
//			continue;
//		}
//		printf("\n e=%d f=%d",e);
//	}
//	printf("\n ---------------------------------");
	
//perfect number(6,28,496,8128)

//WAP to check the number is perfect or not

//	int g, sum=0, i=1;
//	printf("\n Enter Any Number: ");
//	scanf("%d",&g);
//	while(i<g)
//	{
//		if(g%i==0)
//		{
//			sum=sum+i;
//		}
//		i++;
//	}
//	if(g==sum)
//	{
//		printf("\n %d is perfect num",g);
//	}
//	else
//	{
//		printf("\n %d is Not perfect num",g);
//	}
//	printf("\n ---------------------------------");
//	
//	
//	int h , sum1, j;
//	for(h=1; h<=10000; h++)
//	{
//		sum1=0;
//		j=1;
//		while(j<h)
//		{
//			if(h%j==0)
//			{sum1=sum1+j;
//			}
//			j++;
//		}
//		if(h==sum1)
//		{
//			printf("\n %d is perfect num",h);
//		}
//	}
//	printf("\n ---------------------------------");
	
//Prime No

//WAP to check the number is prime or not
	
//	int n, i=2, flag=0;
//	printf("\n Enter the Number: ");
//	scanf("%d",&n);
//	while(i<n)
//	{
//		if(n%i==0)
//		{
//			flag=1;
//		}
//		i++;
//	}
//	if(flag==0)
//	{
//		printf("\n %d is a Prime Number", n);
//	}
//	else
//	{
//		printf("\n %d is a Not Prime Number", n);
//	}
//	printf("\n ---------------------------------");
//	

//print the prime no Range betn 1 to 20

	int n, i, flag;
	for(n=1; n<=20; n++){
		i=2;
		flag=0;
		while(i<n)
		{
			if(n%i==0)
			{
				flag=1;
			}
			i++;
		}
		if(flag==0)
		{
			printf("\n %d is a Prime Number", n);
		}
	}
	return 0;
}
