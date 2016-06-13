package com.briup.ce18;

public class Student implements Comparable<Student>{
	private long id;
	private String name;
	private int age;
	
	public Student (){
		
	}
	public void move(){
		System.out.println("直立行走");
	}
	public Student(long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Student o) {
		//按年龄进行排序
		if(this.age>o.age){
			return  1;
		}
		else if (this.age == o.age){
			return 0;
		}
		else{
		return -1;
		}
	}
		
}

