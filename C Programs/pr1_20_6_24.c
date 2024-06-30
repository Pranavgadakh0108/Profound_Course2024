//WAP read & print the N number of Employee details
#include<stdio.h>
#include<string.h>
struct employee
{
	int id;
	char name[10];
	float sal;
	char city[10];
};
int main()
{
	struct employee e[100];
	int i, n;
	printf("\n ENTER THE NO. OF EMPLOYEES: ");
	scanf("%d",&n);
	for(i=0; i<n; i++)
	{
		printf("\n ENTER THE EMPLOYEE ID NAME SALARY CITY: ");
		scanf("%d%s%f",&e[i].id,&e[i].name,&e[i].sal, &e[i].city);
	}
	printf("\n -->> DISPLAY EMPLOYEE DETAILS <<--");
	printf("\n ID \tNAME \tSALARY \tCITY");
	for(i=0; i<n; i++)
	{
		printf("\n%d \t%s \t%f \t%s",e[i].id, e[i].name, e[i].sal, e[i].city);
	}
	printf("\n---------------------------------\n");
	
//FIND MAX SALARY EMPLOYEE DETAILS
	float maxsal=e[0].sal;
	int eid=e[0].id;
	char ename[10];
	strcpy(ename,e[0].name);
	for(i=0; i<n; i++)
	{
		if(e[i].sal>maxsal)  //for MinSal cond. is if(e[i].sal<minsal);
		{
			maxsal=e[i].sal;
			eid=e[i].id;
			strcpy(ename, e[i].name);
		}
	}
	printf("\n -->> DISPLAY MAXSAL EMPLOYEE DETAILS <<--");
	printf("\n ID \tNAME \tSALARY");
	printf("\n%d \t%s \t%f",eid, ename, maxsal);
	printf("\n---------------------------------\n");
	
//DISPLAY THE EMPLOYEE DETAILS WHOSE CITY="NASHIK"
	printf("\n -->> DISPLAY EMPLOYEE DETAILS {CITY=NASHIK} <<--");
	printf("\n ID \tNAME \tSALARY \tCITY");
	for(i=0; i<n; i++)
	{
		if(strcmp(e[i].city,"nashik")==0)
		{
			printf("\n%d \t%s \t%f \t%s",e[i].id, e[i].name, e[i].sal, e[i].city);
		}
	}

	
	return 0;
}
