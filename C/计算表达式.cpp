#include <stdio.h>
#include<math.h>

int main ()
{
	float x,y,z;
	printf("������ʵ�ͱ���X��Y��ֵ��X������Y��\n");
	scanf("%f%f",&x,&y);
	z=fabs(y)/(2*x+4*pow(y,x));
	printf("z=%f\n",z);
}
