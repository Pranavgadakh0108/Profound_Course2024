//Conditional/ternary operator
// exp ? exp1 : exp2;

#include<stdio.h>
int main(){
	int a=-3, b=-5, c=-7, res;
	
	res=(a>b && a!=c) ? 100 :200;
	printf("\n  res=%d", res);
	printf("\n--------------------------");
	
	int num=30, opt;
	opt=(num>5?(num<20?100:200):500);
	printf("\n opt=%d", opt);
	printf("\n--------------------------");
	
//control statements
//1)If Statements
//2)If-else statements
//3)Nested If-else statements
//4)switch case statement

////Q. WAP to check no. is +ve/-ve.
//
//	int n;
//	printf("\n Enter the Number: ");
//	scanf("%d",&n);
//	
//	if(n>=0){
//		printf("\n %d is Positive", n);
//	}else{
//		printf("\n %d is Negative", n);
//	}
//	printf("\n--------------------------");
//	
////Q. WAP to check the No. is ODD/EVEN
//	if(n%2==0){
//		printf("\n %d is Even", n);
//	}else{
//		printf("\n %d is Odd", n);
//	}
	
////Q. WAP to check year us Leap Year or Not
//	int year;
//	printf("\n Enter Year: ");
//	scanf("%d",&year);
//	if(year%4==0){
//		printf("%d is Leap Year",year);
//	}else{
//		printf("%d is Not a Leap Year",year);
//	}
//	printf("\n--------------------------");
	
//Q. WAP to check char. vowels or Not
//	char ch;
//	printf("\n ENTER A CHARACTER: ");
//	scanf("%c",&ch);
//	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
//		printf("%c is Vowel", ch);
//	}else{
//		printf("%c is Not a Vowel", ch);
//	}
//	printf("\n--------------------------");
	
//Q. WAP accept 3 numbers to find the MAX value.
//	int p,q,r;
//	printf("\n ENTER A 3 NUMBERS: ");
//	scanf("%d%d%d",&p,&q,&r);
//	if(p>=q && p>=r){
//		printf("\n %d is Max", p);
//	}else if(q>=p && q>=r){
//		printf("\n %d is Max", q);
//	}else{
//		printf("\n %d is Max", r);
//	}
//	printf("\n--------------------------");

//switch statements

	int x=3;
	switch(x){
		case 6-9:printf("\n Hello");
				 break;
		case 8%5:printf("\n Hey");
				 break;	
		default :printf("\n bye");
				 break;	 
	}
	
	
	return 0;
}

