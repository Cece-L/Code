package com.briup.ce09;

public class Variables
{
	public int a;
	public void test1(){
		int b = 6; //test1的局部变量
		System.out.println(this+"test1:"+a);
		System.out.println(this+"test1:"+b);
		a++;
	}
	public void test2(){
		System.out.println(this+"test2:"+a);
	}

	//jvm调用main方法 Variables.main();
	public static void main(String[] args){

		//注意看运行结果的地址  test1
		Variables var = new Variables();
		var.test1();//0
		var.test2();//1
		
		//test2 = 0
		Variables var2 = new Variables();
		var.test2();

		
		
		/**
		 a在创建main方法时要经过一个初始化，所以var.a
		 原理：在静态方法中不允许调用非静态方法和非静态属性
		 */
		//System.out.println(var.a);
		
	}
}