package com.briup.ce19;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
			Class.forName("com.briup.ce19.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		}
	public void test1(){
		Scanner cs = new Scanner(System.in);
		while(true){
			System.out.println("--------begin--------------");
			try{
				System.out.println("请输入一个除数，被9除：");
				int a = 9 ; 
				String line = cs.nextLine();
				int b = Integer.parseInt(line);
				System.out.println(a+"/"+b+"="+(a/b));
				int arr[] = {1,2,3};
				System.out.println("arr["+b+"]="+arr[b]);
			}
			catch(NumberFormatException e){
				System.out.println("输入有误："+e.getMessage());
			}
			catch(ArithmeticException e){
				System.out.println("除数为0"+e.getMessage());
			}
			catch(Exception e){
				System.out.println("输入有误："+e.getMessage());
			}
			System.out.println("---------end---------------");
			 
	}
	}
}