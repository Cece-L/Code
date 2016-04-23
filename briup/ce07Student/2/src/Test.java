package com.briup.ce;

public class Test
{
	public static void main (String[] args){
		Student stu = new Student() ;
		
		stu.setId(1001);
		stu.setName("旭旭");
		stu.setAge(19);

		System.out.println(stu);


		//没有 tostring 的情况下
		/*
		 System.out.println(stu1) ;
		System.out.println("Id:"+stu1.getId());
		System.out.println("Name:"+stu1.getName());
		System.out.println("Age:"+stu1.getAge());
		*/
	}
}