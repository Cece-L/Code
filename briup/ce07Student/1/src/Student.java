package com.briup.ce07;

public class Student
{
	//˽������
	//��Ա���ԣ�ʵ�����ԣ���������
	private long id;
	private String name;
	private int age ;

	//������setter,getter ����
	public void setId(long id){ 
		this.id = id;
	}
	public long getId(){
		return this.id;
	}
	public void setName(String name){ 
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age ){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
}