package com.briup.ce17.pset;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		new Test().test1();
	}
	public void test1(){
		//创建
		HashSet<String> set = new HashSet<String>();
		//添加
		set.add("12");
		set.add("Cece");
		set.add("Tom");
		set.add("456");
		//迭代器遍历
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}