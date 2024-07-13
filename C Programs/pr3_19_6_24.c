//STRUCTURE & UNION
//WAP READ AND PRINT THE EMPLOYEE DETAILS

#include<stdio.h>
struct employee
{
	int id;
	char name[10];
	float sal;
};
int main()
{
	struct employee e;
	printf("\n ENTER THE EMPLOYEE ID NAME SALARY: ");
	scanf("%d%s%f",&e.id,&e.name,&e.sal);
	printf("\n DISPLAY EMPLOYEE DETAILS:: ");
	printf("\n ID \tNAME \tSALARY");
	printf("\n %d \t%s \t%f",e.id,e.name,e.sal);
	
	
	return 0;
}
