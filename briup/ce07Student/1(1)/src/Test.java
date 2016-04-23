package com.briup.ce;

public class Test
{
	public static void main(String[] args){


		Student stu1 = new Student() ;
		stu1.setId(1001);
		stu1.setName("ÐñÐñ") ;
		stu1.setAge(19) ;

		System.out.println(stu1) ;
		System.out.println("Id:"+stu1.getId());
		System.out.println("Name:"+stu1.getName());
		System.out.println("Age:"+stu1.getAge());
	}
}