#include<stdio.h>
int main(){
	
//WAP TO PRINT THE FIBONACCI SERIES
	
//	int i=0, j=1, r,k,f;
//	printf("\n ENTER A RANGE: ");
//	scanf("%d",&r);
//	printf("\n %5d %5d",i, j);
//	for(k=1; k<=r; k++)
//	{
//		f=i+j;
//		i=j;
//		j=f;
//		printf("%5d",j);
//	}
//	
//printf("\n --------------------------------");

//WAP TO CHECK THE NO. IS ARMSTRONG OR NOT?
//153=1^3+5^3+3^3=1+125+27=153 {370,371,407,1}
//
//	int n, sum=0, r, temp;
//	
//	printf("\n ENTER ANY NUMBER: ");
//	scanf("%d",&n);
//	temp=n;
//	
//	while(n>0)
//	{
//		r=n%10;				//r=153%10=3
//		sum=sum+(r*r*r);	//sum=0+(3*3*3)=27
//		n=n/10;				//n=153/10=15
//	}
//	if(temp==sum)
//	{
//		printf("\n %d is Armstrong Number",temp);
//	}
//	else
//	{
//		printf("\n %d is Not an Armstrong Number",temp);
//	}
//	

//pattern programming

printf("\n ---------------------------------------------\n");

	int i,j;
													// *
	for(i=1; i<=4; i++){							// * *
		for(j=1; j<=i; j++){						// * * * 
			printf(" * ");							// * * * *
		}
		printf("\n");
	}
printf("\n ---------------------------------------------\n");

	int k=1;
	for(i=1; i<=4; i++){
		for(j=1; j<=i; j++){						// 1
			printf("%4d",k);						// 2 3
			k++;									// 4 5 6
		}											// 7 8 9 10
		printf("\n");
	}
printf("\n ---------------------------------------------\n");	

	for(i=1; i<=4; i++){
		for(j=1; j<=i; j++){						// 1
			printf("%4d",j);						// 1 2
		}											// 1 2 3
		printf("\n");								// 1 2 3 4
	}
printf("\n ---------------------------------------------\n");

		for(i=1; i<=4; i++){
		for(j=1; j<=i; j++){						// 1
			printf("%4d",i);						// 2 2
		}											// 3 3 3
		printf("\n");								// 4 4 4 4
	}
printf("\n ---------------------------------------------\n");	

		char c= 'A';
		for(i=1; i<=4; i++){
		for(j=1; j<=i; j++){						// A
			printf("%4c",c);						// B C
			c++;									// D E F
		}											// H I J K
		printf("\n");
	}
printf("\n ---------------------------------------------\n");	
		
		char d;
		for(i=1; i<=4; i++){
			d='A';
			for(j=1; j<=i; j++){					// A
				printf("%4c",d);					// A B
				d++;								// A B C
			}										// A B C D
			printf("\n");
		}
printf("\n ---------------------------------------------\n");	
		
		char e='A';
		for(i=1; i<=4; i++){
		for(j=1; j<=i; j++){						// A
			printf("%4c",e);						// B B
													// C C C
		}											// D D D D 
		printf("\n");
		e++;
	}
printf("\n ---------------------------------------------\n");	
		
		
		for(i=4; i>0; i--){							// * * * *
			for(j=1; j<=i; j++){					// * * *
				printf(" * ");						// * *
			}										// *
			printf("\n");
		}
		
printf("\n ---------------------------------------------\n");

		int g=1;
		for(i=4; i>0; i--){							// 1 2 3 4
			for(j=1; j<=i; j++){					// 5 6 7
				printf("%4d",g);					// 8 9
				g++;								// 10
			}
			printf("\n");
		}
printf("\n ---------------------------------------------\n");	
		
		int h=10;
		for(i=4; i>0; i--){							// 10 9 8 7
			for(j=1; j<=i; j++){					// 6 5 4
				printf("%4d",h);					// 3 2
				h--;								// 1
			}
			printf("\n");
		}
printf("\n ---------------------------------------------\n");

		int m=1;
		for(i=4; i>0; i--){							// 1 2 3 4
			for(j=1; j<=i; j++){					// 1 2 3 
				printf("%4d",j);					// 1 2 
				m++;								// 1
			}
			printf("\n");
		}
printf("\n ---------------------------------------------\n");

		
		int n=1;
		for(i=4; i>0; i--){							// 1 1 1 1
			for(j=1; j<=i; j++){					// 2 2 2 
				printf("%4d",n);					// 3 3								
			}										// 4
			printf("\n");
			n++;
		}
printf("\n ---------------------------------------------\n");
		
	return 0;
}
