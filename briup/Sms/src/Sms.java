package com.briup.Sms;
import java.util.Scanner;        //API高级代码

public class Sms
{
	private Student[] stus = new Student[3];
	private int index = 0;


	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		Scanner scanner = new Scanner(System.in); //标准输入
		while (true)
		{
			System.out.print("请输入功能编号：");
			String option = scanner.nextLine(); //（扫描器）屏幕阻塞
			switch (option)
			{
			case "1":
				System.out.println("以下为所有学生信息：");
			    Student []stus = sms.findAll();
				for (int i = 0;i < stus.length ;i++ )
				{
					System.out.println(stus[i]);
				}
				System.out.println("总计"+sms.index+"个");
				break;
			case "2":
				while (true)
				{
					System.out.println("请输入学生信息【id#name#age】或者输入break返回");
					String stuStr = scanner .nextLine();  //屏幕阻塞     
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
					System.out.println("添加成功");
				}
				break;
			case "3":
				while (true)
				{
				System.out.println("请输入要删除的学号或者输入break返回上一级：");
				String idStr = scanner.nextLine();
				if (idStr.equals("break"))
				{
					break;
				}
				long id  = Long.parseLong(idStr);
				Student stu = sms.findById(id);
				if (stu==null)
				{
					System.out.println("您要删除的学号不存在！");
					continue;
				}
				sms.deleteById(id);
				System.out.println("删除成功！");
				}
				break;
			case "4":
				while (true)
				{
				System.out.println("请输入你要修改的学生id或者输入break返回上一级界面：");
				String idStr = scanner.nextLine();
				if (idStr.equals("break"))
				{
					break;
				}
				long id = Long.parseLong(idStr);
				Student stu = sms.findById(id);
				if (stu ==null)
				{
					System.out.println("您要修改的信息不存在");
					continue;
				}
				System.out.println("原来:"+stu);
				System.out.println("请输入修改后的信息:【name#age】");
				String stuStr = scanner.nextLine();
				String [] arr = stuStr.split("#");
				String name = arr[0];
				int age = Integer .parseInt(arr[1]);
				Student newStu = new Student (id,name,age);
				sms.update(newStu);
				System.out.println("修改成功！");
				}
				break;
			case "5":
				while (true)
				{
				System.out.println("请输入要查找的学号或者输入break返回上一级：");
				String idStr = scanner.nextLine();
				if (idStr.equals("break"))
				{
					break;
				}
				long id  = Long.parseLong(idStr);
				Student stu = sms.findById(id);
				System.out.println(stu==null?"不好意思，没找到！":stu);
				}
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
		if (index >= stus.length)
		{
			Student[] demo = new Student[stus.length+5];
			System.arraycopy(stus,0,demo,0,index);
			stus = demo ;
		}
		stus[index++] = stu;

	}
	//{0,1,2,3,4,5}删除3后
	//{0,1,2,4,5,0}后面补上
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
		//通过id查找该id的对象在数组中的索引
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