#include<stdio.h>
#include<math.h>	//All function return the result in floating.
#include<string.h>
#include<ctype.h>
#include<conio.h>
#include<stdlib.h>
int main(){
	
	printf("\n sqrt(49)=%f", sqrt(49));
	printf("\n sin(90)=%f", sin(90));
	printf("\n tan(45)=%f", tan(45));
	printf("\n pow(2,3)=%f", pow(2,3));
	printf("\n --------------------------- \n");
	
	char a[] = "pranav";
	char b[] = "gadakh";
	
	printf("\n string length is = %d", strlen(a));
	printf("\n Uppercase string = %s", strupr(a));
	printf("\n lowercase string = %s", strlwr(a));
	printf("\n Reverse string = %s", strrev(a));
	printf("\n Reverse string = %s", strrev(a));
	printf("\n Concat string = %s", strcat(a,b));
	printf("\n --------------------------- \n");
	
	char ch;
	printf("\n ENTER A CHARACTER: ");
	scanf("%c",&ch);
	
	if(isalpha(ch))
	{
		if(isupper(ch))
		{
			printf("\n %c is uppercase character", ch);
		}
		else if(islower(ch))
		{
			printf("\n %c is lowercase character", ch);
		}
	}
	else if (isdigit(ch))
	{
		printf("\n %c is a Digit", ch);
	}
	else if (isspace(ch))
	{
		printf("\n %c is a Space", ch);
	}
	else
	{
		printf("\n %c is a Special Character", ch);
	}
	
	printf("\n --------------------------- \n");
	
	
	return 0;
}
