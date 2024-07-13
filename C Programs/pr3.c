//Q. write a program to find a Area & Circumfernce of a circle

#include<stdio.h>
#define pi 3.14

int main(){
	float r, area, cir;
	printf("\n enter a radius: ");
	scanf("%f",&r);
	area=pi*r*r;
	cir=2*pi*r;
	
	printf("\n Area is %.2f", area);
	printf("\n Cir. is %.2f", cir);
}
