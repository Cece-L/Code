package com.briup.ce07;

public class Student
{
	//私有属性
	//成员属性，实例属性，对象属性
	private long id;
	private String name;
	private int age ;

	//公共的setter,getter 方法
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