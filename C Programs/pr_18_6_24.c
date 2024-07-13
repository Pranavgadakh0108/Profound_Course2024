#include<stdio.h>
#include<string.h>
int main(){

//WAP accept any lowercase string convert uppercase string 
	char a[100];
	int i;
	printf("\n ENTER LOWERCASE STRING: ");
	gets(a);
	for(i=0; i<strlen(a); i++)
	{
		if(a[i]>=97 && a[i]<=122)
		{
			a[i]=a[i]-32;
		}
	}
	printf("\n UPPERCASE STRING: %s",a);
	printf("\n ------------------------------- \n");

//WAP accept any lowercase string convert uppercase string 
	char b[100];
	printf("\n ENTER UPPERCASE STRING: ");
	gets(b);
	for(i=0; i<strlen(b); i++)
	{
		if(b[i]>=65 && b[i]<=90)
		{
			b[i]=b[i]+32;
		}
	}
	printf("\n LOWERCASE STRING: %s",b);
	printf("\n ------------------------------- \n");
	
//WAP accept any string from user and delete vowel from that string
	char c[100];
	printf("\n ENTER ANY STRING: ");
	gets(c);
	for(i=0; i<strlen(c); i++)
	{
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
		{
			continue;
		}
		else
		{
			printf("%c",c[i]);
		}
	}	
	printf("\n ------------------------------- \n");

//WAP reverse the entering string without function
	char d[100];
	printf("\n ENTER ANY STRING: ");
	gets(d);
	for(i=strlen(d)-1; i>=0; i--)
	{
		printf("%c",d[i]);
	}
	printf("\n ------------------------------- \n");

//WAP to find the length of string without function
	char e[100];
	int len=0;
	printf("\n ENTER ANY STRING: ");
	gets(e);
	for(i=0; e[i]!='\0'; i++)
	{
		len++;
	}
	printf("\n LENGTH OF STRING:%d",len);
	printf("\n------------------------------------\n");	
	
//WAP TO SORTING THE STRING
	char f[100];
	int j, temp;
	printf("\n ENTER ANY STRING: ");
	gets(f);
	for(i=0; i<strlen(f); i++)
	{
		for(j=i+1; j<strlen(f); j++)
		{
			if(f[i]>f[j])
			{
				temp=f[i];
				f[i]=f[j];
				f[j]=temp;
			}
		}
	}
	printf("\n SORTED STRING: %s",f);
	printf("\n------------------------------------\n");	
//WAP to count the no. of uppercase and lowercase character from the given string

	char g[100];
	int u=0, l=0;
	printf("\n ENTER ANY STRING: ");
	gets(g);
	for(i=0; i<strlen(g); i++)
	{
		if(g[i]>=65 && g[i]<=90)
		{
			u++;
		}
		else if(g[i]>=97 && g[i]<=122)
		{
			l++;
		}
	}
	printf("\n TOTAL UPPERCASE=%d LOWERCASE=%d",u,l);	
	return 0;
}
