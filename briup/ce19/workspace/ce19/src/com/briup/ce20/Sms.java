package com.briup.ce20;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sms {

	// 保存学生信息
	public void save(Student stu) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_student(name,age) values(?,?)";
				pstmt= conn.prepareStatement(sql);
				pstmt.setString(1, stu.getName());
				pstmt.setInt(2, stu.getAge());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 删除
	public void deleteById(long id) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory .getConn();
				String sql = "delete from t_student where id = ?";
				pstmt = conn.prepareCall(sql);
				pstmt.setLong(1, id);
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 按照学号查询
	public Student findById(long id) {
		Student stu = null;
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_student where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				rs = pstmt.executeQuery();
				while (rs.next()){
					
					String name = rs.getString("name");
					int age  = rs.getInt("age");
					stu = new Student(id, name, age);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stu;
	}

	// 查询所有
	public List<Student> findAll() {
		List<Student> list = new ArrayList<Student>();
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_student";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()){
					long id = rs.getLong("id");
					String name = rs.getString("name");
					int age  = rs.getInt("age");
					Student stu = new Student(id, name, age);
					list.add(stu);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// 修改
	public void update(Student stu) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "update t_student set name=?,age=? where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, stu.getName());
				pstmt.setInt(2, stu.getAge());
				pstmt.setLong(3, stu.getId());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in); //标准输入
		while (true)
		{
			try {
				System.out.print("请输入功能编号：");
				String option = scanner.nextLine(); //（扫描器）屏幕阻塞
				switch (option)
				{
				case "1":
					System.out.println("以下为所有学生信息：");
				    List<Student> stus = sms.findAll();
					for(Student stu:stus){
						System.out.println(stu);
					}
					System.out.println("总计"+stus.size()+"个");
					break;
				case "2":
					while (true)
					{
						System.out.println("请输入学生信息【name#age】或者输入break返回");
						String stuStr = scanner .nextLine();  //屏幕阻塞     
						if (stuStr.equals("break"))
						{
							break;
						}
						String[] stuArr = stuStr.split("#");
						String name = stuArr[0];
						int age = Integer.parseInt(stuArr[1]);
						Student stu = new Student(null,name,age);
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
			} catch (Exception e) {
				System.out.println("输入有误！");
				continue;
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
	
}