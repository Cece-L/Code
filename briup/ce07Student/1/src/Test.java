package com.briup.ce07;

public class Test
{
	public static void main(String[] agrs){
		//ʵ����
		Student stu1 = new Student();
		stu1.setId(1001);
		stu1.setName("����С��è");
		stu1.setAge(3);

		System.out.println("stu1.Id;"+stu1.getId());
		System.out.println("stu1.Name;"+stu1.getName());
		System.out.println("stu1.Age;"+stu1.getAge());

	}
}