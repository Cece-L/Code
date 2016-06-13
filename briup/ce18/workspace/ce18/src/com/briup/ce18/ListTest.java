package com.briup.ce18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		 new ListTest().test1();
	}
	public void test1(){
		//创建
		List<String>list = new ArrayList<String>();
		//添加
		list.add("Tom");
		list.add("Jane");
		list.add("Tom");
		System.out.println(list.size());
		//迭代器遍历
		Iterator<String> iter =  list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("-------------------------------");
		//for循环遍历
		for(int i = 0 ; i < list.size(); i ++){
			System.out.println(list.get(i));
		}
		System.out.println("-------------------------------");
		//foreach遍历
		for(String str:list){
			System.out.println(str);
		}
		
	}
}
