package com.briup.Sms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sms {
	public void menu() {
		System.out.println("**********供应商信息管理系统**********");
		System.out.println("**1. 查询所有供应商信息");
		System.out.println("**2. 注册供应商信息");
		System.out.println("**3. 注销供应商信息");
		System.out.println("**4. 修改供应商信息");
		System.out.println("**5. 根据供应商号查询供应商信息");
		System.out.println("**exit. 退出系统");
		System.out.println("**help. 帮助");
		System.out.println("************************************");
	}
	// 保存供应商信息
	public void save(Supplier sup) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				//1注册驱动2获取连接
				conn = ConnectionFactory.getConn();
				//3预处理sql
				String sql = "insert into s_supplier(Sname,Saddress,Stel,Saccount) values(?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, sup.getSname());
				pstmt.setString(2, sup.getSaddress());
				pstmt.setLong(3, sup.getStel());
				pstmt.setLong(4, sup.getSaccount());
				//执行sql
				pstmt.executeUpdate();
			}finally{
				//释放资源
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//通过Snumber删除
	public void deleteById(long Snumber) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "delete from s_supplier where Snumber= ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, Snumber);
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//通过Snumber查找
	public Supplier findById(long Snumber) {
		Supplier sup = null;
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from s_supplier where Snumber = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, Snumber);
				rs = pstmt.executeQuery();
				while(rs.next()){
					String Sname= rs.getString("Sname");
					String Saddress = rs.getString("Saddress");
					long Stel = rs.getLong("Stel");
					long Saccount = rs.getLong("Saccount");
					sup = new Supplier(Snumber, Sname, Saddress,Stel,Saccount);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sup;
	}

	// 查询所有
	public List<Supplier> findAll() {
		List<Supplier> list = new ArrayList<Supplier>();
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from s_supplier";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					long Snumber = rs.getLong("Snumber");
					String Sname= rs.getString("Sname");
					String Saddress = rs.getString("Saddress");
					long Stel = rs.getLong("Stel");
					long Saccount = rs.getLong("Saccount");
					Supplier sup = new Supplier(Snumber,Sname,Saddress,Stel,Saccount);
					list.add(sup);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// 修改 供应商信息
	public void update(Supplier sup) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "update s_supplier set Sname=?,Saddress=?,Stel=?,Saccount=? where Snumber = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, sup.getSname());
				pstmt.setString(2, sup.getSaddress());
				pstmt.setLong(3, sup.getStel());
				pstmt.setLong(4, sup.getSaccount());
				pstmt.setLong(5, sup.getSnumber());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Sms sms = new Sms();
		sms.menu();
		// 创建扫描器对象
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("请输入功能编号：");
				// 监控标准输入，当用户输入回车，该方法可以将回车之前所有的用户输入返回
				String option = scanner.nextLine();
				switch (option) {
				case "1": // 查询所有供应商信息
					System.out.println("以下为所有供应商的信息：");
					List<Supplier> sups = sms.findAll();
					
					for (Supplier sup : sups) {
						System.out.println(sup);
					}
					System.out.println("总计"+sups.size()+"个");
					break;
				case "2": // 添加供应商信息
					while (true) {
						System.out
								.println("请输入要注册的供应商信息【Sname#Saddress#Stel#Saccount】或者输入break返回上一级目录");
						// 接受用户的输入
						String supStr = scanner.nextLine();
						if (supStr.equals("break")) {
							break;
						}
						// 分割字符串
						String[] supArr = supStr.split("#");
						String Sname = supArr[0];
						String Saddress = supArr[1];
						long Stel = Long.parseLong(supArr[2]);
						long Saccount = Long.parseLong(supArr[3]);
						// 封装对象
						Supplier sup = new Supplier(null, Sname, Saddress,Stel,Saccount);
						sms.save(sup);
						System.out.println("注册成功！");
					}
					break;
				case "3":
					while (true) {
						System.out.println("请输入要注销的供应商的Snumber或输入break返回上一级");

						String SnumberStr = scanner.nextLine();
						if (SnumberStr.equals("break")) {
							break;
						}
						// 将字符串转换为long
						long Snumber = Long.parseLong(SnumberStr);
						Supplier sup = sms.findById(Snumber);
						if (sup == null) {
							System.out.println("您要注销的供应商不存在！");
							continue;
						}
						sms.deleteById(Snumber);
						System.out.println("注销成功！");
					}
					break;
				case "4":
					while (true) {
						System.out.println("请输入您要修改供应商的Snumber或输入break返回上一级");
						String SnumberStr = scanner.nextLine();
						if (SnumberStr.equals("break")) {
							break;
						}
						// 将字符串转换为long
						long Snumber = Long.parseLong(SnumberStr);
						Supplier sup = sms.findById(Snumber);
						if (sup == null) {
							System.out.println("您要修改的供应商信息不存在");
							continue;
						}
						System.out.println("原来：" + sup);
						System.out.println("请输入修改后的信息【Sname#Saddredss#Stel#Saccount】:");
						String supStr = scanner.nextLine();

						String[] arr = supStr.split("#");
						String Sname = arr[0];
						String Saddress = arr[1];
						long Stel = Long.parseLong(arr[2]);
						long Saccount = Long.parseLong(arr[3]);
						// 包装用户输入的新对象的对象
						Supplier newSup = new Supplier(Snumber, Sname, Saddress,Stel,Saccount);
						sms.update(newSup);
						System.out.println("修改成功！");

					}
					break;
				case "5":
					while (true) {
						System.out.println("请输入要查询供应商的Snumber或输入break返回上一级");

						String SnumberStr = scanner.nextLine();
						if (SnumberStr.equals("break")) {
							break;
						}
						// 将字符串转换为long
						long Snumber = Long.parseLong(SnumberStr);
						Supplier sup = sms.findById(Snumber);
						System.out.println(sup == null ? "sorry not found!"
								: sup);
					}
					break;
				case "exit":
					System.out.println("欢迎再次使用系统");
					System.exit(0);
				case "help":
					sms.menu();
					break;
				default:
					System.out.println("输入出错！请重新输入。");
				}
			} catch (Exception e) {
				System.out.println("输入出错");
				continue;
			}
		}
	}
}