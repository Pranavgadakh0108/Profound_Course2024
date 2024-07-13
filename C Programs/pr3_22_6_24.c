//POINTER AND FUNCTION
#include<stdio.h>
//WAP Read and Print a employee details using pointer & structure
struct employee
{
	int id;
	char name[10];
	float sal;	
};
int main()
{
	struct employee e, *p;
	p=&e;
	printf("\n ENTER EMP ID NAME SALARY: ");
	scanf("%d%s%f",&p->id, &p->name, &p->sal);
	printf("\n DISPLAY EMPLOYEE DETAILS...: ");
	printf("\n ID \t NAME \t SALARY");
	printf("\n %d \t %s \t%f",p->id, p->name, p->sal);
	
	return 0;
}
