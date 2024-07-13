#include<stdio.h>
#include<string.h>
int main()
{
	
//WAP to count vowel, consonant, digit, space from the given string
	char a[100];
	int i, v=0,c=0,d=0,s=0;
	printf("\n ENTER ANY STRING: ");
	gets(a);
	for(i=0; i<strlen(a); i++)
	{
		if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
		{
			v++;
		}
		else if(a[i]>=48 && a[i]<=57)
		{
			d++;
		}
		else if(a[i]==32)
		{
			s++;
		}
		else
		{
			c++;
		}
	}
	printf("\n TOTAL NO OF VOWELS=%d CONSONANTS=%d DIGIT=%d SPACE=%d", v,c,d,s);
	printf("\n---------------------------\n");
	
//WAP program accept any string from user and print inital char from each word
	printf("\n inital char from each word: ");
	printf(" %c",a[0]);
	for(i=0; i<strlen(a); i++)
	{
		if(a[i]==32)
		{
			printf( "%c",a[i+1]);
		}
	}
	printf("\n---------------------------\n");
	
//WAP to convert initial char in uppercase
	printf("\n INITIAL CHAR IN UPPERCASE: ");
	printf("\n %c",a[0]-32);
	for(i=0; i<strlen(a); i++)
	{
		if(a[i]==32)
		{
			printf(" ");
			printf("%c",a[i+1]-32);
		}
		else
		{
			printf("%c",a[i+1]);
		}
	}
		
	return 0;
}
