//STRINGS

#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
	
////WAP TO FIND THE SIZE OF STRING VARIABLE (size of string =length os string+1)
//	char c[]="pranav";
//	printf("\n THE SIZE OF STRING=%d",sizeof(c));
//	printf("\n--------------------------------------\n");
//WA MENU DRIVEN PROGRAM FOR STRING FUNCTION
	char a[100],b[100];
	int ch;
	do
	{
		printf("\n\n-------->> MENU <<---------");
		printf("\n 1. STRING LENGTH");
		printf("\n 2. STRING UPPERCASE");
		printf("\n 3. STRING LOWERCASE");
		printf("\n 4. STRING REVERSE");
		printf("\n 5. STRING CONCATANATION");
		printf("\n 6. STRING COMPAIR");
		printf("\n 7. STRING COPY");
		printf("\n 8. EXIT <(-_-)>");
		printf("\n---------------------------------");
		printf("\n ENTER YOUR CHOICE:: ");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1: printf("\n ENTER STRING: ");
					scanf("%s",&a);
					printf("\n THE STRING LENGTH=%d",strlen(a));
					break;
			case 2: printf("\n ENTER STRING: ");
					scanf("%s",&a);
					printf("\n THE UPPERCSE STRING = %s",strupr(a));
					break;
			case 3: printf("\n ENTER STRING: ");
					scanf("%s",&a);
					printf("\n THE LOWERCASE STRING=%s",strlwr(a));
					break;
			case 4: printf("\n ENTER STRING: ");
					scanf("%s",&a);
					printf("\n REVERSE STRING=%s",strrev(a));
					break;
			case 5: printf("\n ENTER STRING1: ");
					scanf("%s",&a);
					printf("\n ENTER STRING2: ");
					scanf("%s",&b);
					strcat(a,b);
					printf("\n THE STRING CONCATANATION=%s",a);
					break;
			case 6: printf("\n ENTER STRING1: ");
					scanf("%s",&a);
					printf("\n ENTER STRING2: ");
					scanf("%s",&b);
					if(strcmp(a,b)==0)
					{
						printf("\n BOTH STRING EQUALS!!!");
					}
					else
					{
						printf("\n STRING UN-EQUALS!!!");
					}
					break;
			case 7: printf("\n ENTER STRING1: ");
					scanf("%s",&a);
					strcpy(b,a);
					printf("\n STRING COPY=%s",b);
					break;
			case 8: exit(0);
			default: printf("\n PLZ ENTER CORRECT CHOICE!!!!!");	
					 break;
		}
		
	}
	while(ch!=0);
	return 0;
}
