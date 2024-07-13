//Assignment Operator
#include<stdio.h>

int main(){
	int a=-3, b=-5;
	printf("\n a=%d",a+=b);
	printf("\n a=%d",a-=b);
	printf("\n a=%d",a*=b);
	printf("\n a=%d",a/=b);
	printf("\n a=%d",a%=b);
	
	
	//unary operator
	int c=3;
	printf("\n ++c=%d", ++c);
	printf("\n --c=%d", --c);
	printf("\n c++=%d", c++);
	printf("\n c--=%d", c--);
	return 0;
}
