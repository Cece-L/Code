package com.briup.ce;

public class Student
{
	private long id;
	private String name;
	private int age;

	//����ӣ��޲ι��캯��
	public Student (long id,String name,int age){
		
		System.out.println("���ù��캯����������");
		this.name=name;
		this.id=id;
		this.age=age;
	}

	public void setId (long id)	{
		this.id = id ;
	}
	public long getId (){
		return this.id ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ; 
	}
	public void setAge(int age ){ 
		this.age = age ;
	}
	public int getAge (){
		return this.age ; 
	}

	public String toString (){
		return "[id:"+this.id+",name:"+this.name+",age:"+this.age+"]" ;
	}
}