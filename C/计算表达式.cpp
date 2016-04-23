#include <stdio.h>
#include<math.h>

int main ()
{
	float x,y,z;
	printf("请输入实型变量X和Y的值，X不等于Y；\n");
	scanf("%f%f",&x,&y);
	z=fabs(y)/(2*x+4*pow(y,x));
	printf("z=%f\n",z);
}
