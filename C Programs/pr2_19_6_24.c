//STRING PASS BY FUNCTION
#include<stdio.h>
#include<string.h>
//WAP TO REVERSE A ENTERING STRING USING FUNCTION
void reverse(char a[])
{
	int i;
	printf("\n REVERSE STRING: ");
	for(i=strlen(a)-1; i>=0; i--)
	{
		printf("%c",a[i]);
	}
	printf("\n--------------------------\n");
}

//WAP TO FIND THE LENGTH OF STRING USING FUNCTION
int length(char a[])
{
	int i, len=0;
	for(i=0; a[i]!='\0'; i++)
	{
		len++;
	}
	return len;
	printf("\n--------------------------\n");
}

//WAP TO SORTING THE ENTERING STRING USING FUNCTION

void sort(char a[])
{
	int i, j, temp;
	for(i=0; i<strlen(a); i++)
	{
		for(j=i+1; j<strlen(a); j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	printf("\n AFTER SORTING STRING:%s",a);
	printf("\n--------------------------\n");
}

int main()
{
	char a[]="pranav";
	reverse(a);
	sort(a);
	printf("\n LENGTH OF STRING:%d",length(a));
	return 0;
}
