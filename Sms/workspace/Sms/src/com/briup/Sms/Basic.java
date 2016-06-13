package com.briup.Sms;

import java.sql.Connection;
import java.sql.DriverManager;

public class Basic {
	public static void main(String[] args) {
		new Basic().test1();
	}
	public void test1(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/supplier", "root", "root");
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
