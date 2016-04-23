#include <stdio.h>
main ()


{
	int fahr, celsius;                                                                              /* 定义华氏温度，摄氏温度储存变量*/ 
	int lower , upper , step ;                                                                      /* 定义华氏温度转换下限值，上限值，步长*/
	lower = 0;                                                                                      
	upper = 300;                                                                                   
	step = 20;                                                                                      
	printf("\t==华氏和摄氏的温度对照表==\n");                                                       /*输出标题*/
	printf ("\n\n华氏温度；             摄氏温度：\n--------------------------------\n");
	fahr = lower ;                                                                                   /*设置起始华氏温度*/
	while ( fahr<=upper ){
		celsius = 5* (fahr - 32)/9 ;
		printf("%d\t                 %d\n", fahr , celsius) ;
		fahr = fahr + step ; 
	}
} 
