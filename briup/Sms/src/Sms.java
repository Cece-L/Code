package com.briup.Sms;
import java.util.Scanner;        //API�߼�����

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
			System.out.print("�����빦�ܱ�ţ�");
			String option = scanner.nextLine();
			switch (option)
			{
			case "1":
				System.out.println("����Ϊ����ѧ����Ϣ��");
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
				System.out.println("��ӭ�ٴ�ʹ�ñ�ϵͳ��");
				System.exit(0);
			default:
				System.out.println("����������������롣");


			
			}
		}

	}
	public void menu(){
		System.out.println("**********ѧ����Ϣ����ϵͳ***************");
		System.out.println("***1.��ѯ����ѧ����Ϣ");
		System.out.println("***2.���ѧ����Ϣ");
		System.out.println("***3.ɾ��ѧ����Ϣ");
		System.out.println("***4.�޸�ѧ����Ϣ");
		System.out.println("***5.����ѧ�Ų�ѯѧ����Ϣ");
		System.out.println("***Exit.�˳�ϵͳ");
		System.out.println("***Exit.����help");
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