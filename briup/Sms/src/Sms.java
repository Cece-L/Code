package com.briup.Sms;
import java.util.Scanner;        //API�߼�����

public class Sms
{
	private Student[] stus = new Student[3];
	private int index = 0;


	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		Scanner scanner = new Scanner(System.in); //��׼����
		while (true)
		{
			System.out.print("�����빦�ܱ�ţ�");
			String option = scanner.nextLine(); //��ɨ��������Ļ����
			switch (option)
			{
			case "1":
				System.out.println("����Ϊ����ѧ����Ϣ��");
			    Student []stus = sms.findAll();
				for (int i = 0;i < stus.length ;i++ )
				{
					System.out.println(stus[i]);
				}
				System.out.println("�ܼ�"+sms.index+"��");
				break;
			case "2":
				while (true)
				{
					System.out.println("������ѧ����Ϣ��id#name#age����������break����");
					String stuStr = scanner .nextLine();  //��Ļ����     
					if (stuStr.equals("break"))
					{
						break;
					}
					String[] stuArr = stuStr.split("#");
					long id = Long.parseLong(stuArr[0]);
					String name = stuArr[1];
					int age = Integer.parseInt(stuArr[2]);
					Student stu = new Student (id,name,age);
					sms.save(stu);
					System.out.println("��ӳɹ�");
				}
				break;
			case "3":
				while (true)
				{
				System.out.println("������Ҫɾ����ѧ�Ż�������break������һ����");
				String idStr = scanner.nextLine();
				if (idStr.equals("break"))
				{
					break;
				}
				long id  = Long.parseLong(idStr);
				Student stu = sms.findById(id);
				if (stu==null)
				{
					System.out.println("��Ҫɾ����ѧ�Ų����ڣ�");
					continue;
				}
				sms.deleteById(id);
				System.out.println("ɾ���ɹ���");
				}
				break;
			case "4":
				while (true)
				{
				System.out.println("��������Ҫ�޸ĵ�ѧ��id��������break������һ�����棺");
				String idStr = scanner.nextLine();
				if (idStr.equals("break"))
				{
					break;
				}
				long id = Long.parseLong(idStr);
				Student stu = sms.findById(id);
				if (stu ==null)
				{
					System.out.println("��Ҫ�޸ĵ���Ϣ������");
					continue;
				}
				System.out.println("ԭ��:"+stu);
				System.out.println("�������޸ĺ����Ϣ:��name#age��");
				String stuStr = scanner.nextLine();
				String [] arr = stuStr.split("#");
				String name = arr[0];
				int age = Integer .parseInt(arr[1]);
				Student newStu = new Student (id,name,age);
				sms.update(newStu);
				System.out.println("�޸ĳɹ���");
				}
				break;
			case "5":
				while (true)
				{
				System.out.println("������Ҫ���ҵ�ѧ�Ż�������break������һ����");
				String idStr = scanner.nextLine();
				if (idStr.equals("break"))
				{
					break;
				}
				long id  = Long.parseLong(idStr);
				Student stu = sms.findById(id);
				System.out.println(stu==null?"������˼��û�ҵ���":stu);
				}
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
		if (index >= stus.length)
		{
			Student[] demo = new Student[stus.length+5];
			System.arraycopy(stus,0,demo,0,index);
			stus = demo ;
		}
		stus[index++] = stu;

	}
	//{0,1,2,3,4,5}ɾ��3��
	//{0,1,2,4,5,0}���油��
	public void deleteById(long id){
		int num = findIndexById(id);
		for (int i = num;i < index-1;i++ )
		{
			stus[i] = stus[i+1];
		}
		stus[--index] = null ;

	}
	public Student findById(long id){
		int num = findIndexById(id);
		return num == -1?null:stus[num];
		
 	}
	private int findIndexById(long id )
	{
		//ͨ��id���Ҹ�id�Ķ����������е�����
		//num = i
		int num = -1;
		for (int i = 0;i <index ;i++ )
		{
			if (id == stus[i].getId())
			{
				num = i ;
				break;
			}
		}
		return num;
	}
	public Student[] findAll(){
		Student[] stusDemo = new Student [index];
		System.arraycopy(stus,0,stusDemo,0,index);
		return stusDemo;
	}
	public void update(Student stu){
		for (int i = 0;i<index ;i++ )
		{
			if (stu.getId()==stus[i].getId())
			{
				stus[i].setName(stu.getName());
				stus[i].setAge(stu.getAge());
			}
		}
	}
}