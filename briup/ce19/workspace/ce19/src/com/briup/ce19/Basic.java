package com.briup.ce19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.briup.ce20.ConnectionFactory;

public class Basic {
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://127.0.0.1:3306/Student";
	String user = "root";
	String password = "root";
	public static void main(String[] args) {
		new Basic().test4();
	}
	//查询
	public void test4(){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_student";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				//处理结果集
				while(rs.next()){
					long id = rs.getLong("id");
					String name = rs.getString("name");
					int age = rs.getInt("age");
					System.out.println(id+","+name+","+age);
				}
			}finally{
				ConnectionFactory.close(rs, pstmt, conn);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//删除
	public void test3(long id){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				//3.预处理sql
				String sql = "delete from t_student where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				//4.执行sql
				int num = pstmt.executeUpdate();
				System.out.println(num+"删除成功！");
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//修改
	public void test2(long id,String name){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				conn = ConnectionFactory.getConn();
				//3.预处理sql
				String sql = "update t_student set name=? where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,name);
				pstmt.setLong(2, id);
				//4.执行sql
				int num = pstmt.executeUpdate();
				System.out.println(num+"修改成功！");
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//插入
	public void test1(String name,int age){
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnectionFactory.getConn();
			//System.out.println(conn);
			//3.预处理sql
			String sql = "insert into t_student(name,age) values(?,?)";
			pstmt = conn.prepareStatement(sql);
			//替换占位符
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			//4.
			int num = pstmt.executeUpdate();
			System.out.println(num+"条数据插入成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				ConnectionFactory.close(null, pstmt, conn);
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

