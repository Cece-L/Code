package com.briup.ce09;

public class Variables
{
	public int a;
	public void test1(){
		int b = 6; //test1�ľֲ�����
		System.out.println(this+"test1:"+a);
		System.out.println(this+"test1:"+b);
		a++;
	}
	public void test2(){
		System.out.println(this+"test2:"+a);
	}

	//jvm����main���� Variables.main();
	public static void main(String[] args){

		//ע�⿴���н���ĵ�ַ  test1
		Variables var = new Variables();
		var.test1();//0
		var.test2();//1
		
		//test2 = 0
		Variables var2 = new Variables();
		var.test2();

		
		
		/**
		 a�ڴ���main����ʱҪ����һ����ʼ��������var.a
		 ԭ���ھ�̬�����в�������÷Ǿ�̬�����ͷǾ�̬����
		 */
		//System.out.println(var.a);
		
	}
}