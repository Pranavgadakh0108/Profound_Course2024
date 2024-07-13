//WAP to calculate the Net salary emp details.
#include<stdio.h>
struct salary
{
	int BS;
	int HRA;
	int DA;
	int PF;
};
struct employee
{
	int id;
	char name[10];
	struct salary s;
};
int main()
{
	struct employee e;
	int netsal;
	printf("\n ENTER THE EMPLOYEE ID NAME: ");
	scanf("%d%s",&e.id, &e.name);
	printf("\n ENTER THE BS HRA DA PF: ");
	scanf("%d%d%d%d",&e.s.BS, &e.s.HRA, &e.s.DA, &e.s.PF);
	
	netsal=e.s.BS + e.s.HRA + (e.s.DA*24)-e.s.PF;
	
	printf("\n DISPLAY EMPLOYEE DETAILS: ");
	printf("\n ID \t NAME \t NETSALARY ");
	printf("\n %d \t %s \t%d",e.id,e.name,netsal);
	
	return 0;
}
