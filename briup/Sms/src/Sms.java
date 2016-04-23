package com.briup.Sms;
import java.util.Scanner;        //API高级代码

public class Sms
{
	private Student[] stus = new Student[3];
	private int index = 0;


	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		Scanner scanner = new Scanner(System.in);
		while (true)
		{
			System.out.print("请输入功能编号：");
			String option = scanner.nextLine();
			switch (option)
			{
			case "1":
				System.out.println("以下为所有学生信息：");
			    Student []stus = sms.findAll();
				for (int i = 0;i < stus.length ;i++ )
				{
					System.out.println(stus[i]);
				}
				
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "help":
				sms.menu();
				break;
			case "exit":
				System.out.println("欢迎再次使用本系统！");
				System.exit(0);
			default:
				System.out.println("输入错误，请重新输入。");


			
			}
		}

	}
	public void menu(){
		System.out.println("**********学生信息管理系统***************");
		System.out.println("***1.查询所有学生信息");
		System.out.println("***2.添加学生信息");
		System.out.println("***3.删除学生信息");
		System.out.println("***4.修改学生信息");
		System.out.println("***5.根据学号查询学生信息");
		System.out.println("***Exit.退出系统");
		System.out.println("***Exit.帮助help");
		System.out.println("****************************************");

	}
	public void save (Student stu){

	}
	public void deleteById(long id){

	}
	public Student findById(long id){
		return null;
 	}
	public Student[] findAll(){
		return stus;
	}
	public Student update(Student stu){
		return null;
	}
}