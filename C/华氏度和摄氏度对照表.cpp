#include <stdio.h>
main ()


{
	int fahr, celsius;                                                                              /* ���廪���¶ȣ������¶ȴ������*/ 
	int lower , upper , step ;                                                                      /* ���廪���¶�ת������ֵ������ֵ������*/
	lower = 0;                                                                                      
	upper = 300;                                                                                   
	step = 20;                                                                                      
	printf("\t==���Ϻ����ϵ��¶ȶ��ձ�==\n");                                                       /*�������*/
	printf ("\n\n�����¶ȣ�             �����¶ȣ�\n--------------------------------\n");
	fahr = lower ;                                                                                   /*������ʼ�����¶�*/
	while ( fahr<=upper ){
		celsius = 5* (fahr - 32)/9 ;
		printf("%d\t                 %d\n", fahr , celsius) ;
		fahr = fahr + step ; 
	}
} 
