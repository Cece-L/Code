package com.briup.ce08;

public class Teacher
{
	private long id;
	private String name;
	private double salary;
	private char gender;
	

	/**
	 限制性别
	 */
	public Teacher(){
		
	}

	public Teacher(long id,String name,double salary,char gender){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

	public void setId(long id){
		this.id = id ;

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
	public void setSalaru(double salary){
		this.salary = salary;
	}
	public double getSanlary()
	{
		return this.salary;
	}
	public void setgender(char gender){
		this.gender = gender;
	}
	public char getgender(){
		return this.gender;
	}

	public String toString(){
		return "Teacher[id:"+this.id+"，name:"+this.name+",salary:"+this.salary+",gender:"+this.gender+"]";

	}

}