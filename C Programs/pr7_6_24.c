//WAP to check the character is vowels or not using switch case 
#include<stdio.h>
#include<stdlib.h>
int main(){
//	char ch;
//	printf("\n ENTER ANY CHARACTER: ");
//	scanf("%c", &ch);
//	
//	switch(ch){
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':printf("\n %c is a vowel", ch);
//				 break;
//		default :printf("\n %c is not a vowel", ch);
//				 break;
//	}
//	

//looping statement
//1.. while loop

	
		int a=1;
		while(a<=10){
			printf("\n a=%d", a);
			a++;
		}
		printf("\n ---------------------------");
		
		int b=1;
		while(b<=100){
			printf("\n a=%d", b);
			b*=2;
		}
		printf("\n ---------------------------");
// WAP to find the factorial of any number

//		int num, fact=1;
//		printf("\n ENTER A NUMBER: ");
//		scanf("%d", &num);
//		
//		while(num>0){
//			fact=fact*num;
//			num--;
//		}	
//		printf("\n Factorial is %d",fact);
//		printf("\n ---------------------------");

//WAP to print the even num range betn 1 to 20
		
		int m=1;
		while (m<=20){
			if(m%2==0){
				printf("\n m=%d is even",m);
			}
			m++;
		}
		printf("\n ----------------------------------------------\n");
		
//WAP to print the multiplication table 

		int i,j,k;
		i=1;
		while(i<=10){
			j=1;
			while(j<=10){
				k=i*j;
				printf("%4d",k);
				j++;
			}
			printf("\n");
			i++;
		}
		printf("\n ----------------------------------------------\n");
		
//Do-while loop
	
		int p=10;
		do{
			printf("\n %d",p);
			p--;
		}while(p>=1);
		printf("\n ---------------------------\n");
		
//for loop
	int q;
	for(q=0; q<10; q++){
		printf("\n q=%d",q);
	}
	printf("\n ---------------------------\n");	
//WA Menu Driven Program to find add, sub, mul, div, mod of 2 numbers

	
	int x,y,z;
	do{
		printf("\n*************MENU***********");
		printf("\n 1.add");
		printf("\n 2.sub");
		printf("\n 3.mul");
		printf("\n 4.div");
		printf("\n 5.mod");
		printf("\n 6.exit");
		printf("\n****************************");
		printf("\n ENTER YOUR CHOICE: ");
		scanf("%d",&z);
		
		switch(z){
			case 1: printf("\n ENTER 2 NUMBERS: ");
					scanf("%d%d",&x,&y);
					printf("\n Addition of %d and %d is: %d ",x,y,x+y);
					break;
			case 2: printf("\n ENTER 2 NUMBERS: ");
					scanf("%d%d",&x,&y);
					printf("\n Subtraction of %d and %d is: %d ",x,y,x-y);
					break;
			case 3: printf("\n ENTER 2 NUMBERS: ");
					scanf("%d%d",&x,&y);
					printf("\n Multiplication of %d and %d is: %d ",x,y,x*y);
					break;
			case 4: printf("\n ENTER 2 NUMBERS: ");
					scanf("%d%d",&x,&y);
					printf("\n Division of %d and %d is: %f ",x,y,(float)x/y);
					break;
			case 5: printf("\n ENTER 2 NUMBERS: ");
					scanf("%d%d",&x,&y);
					printf("\n Mod of %d and %d is: %d ",x,y,x%y);
					break;
			case 6:exit(0);
			default:printf("\n ENTER CORRECT CHOICE !!!!!");
					break;
		}
	}while(z!=0);
	printf("\n***********************************************");
	
	
	return 0;
}

