package com.briup.ce18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		new MapTest().test1();
	}
	public void test1(){
		//创建
		Map<Integer, String> map = new HashMap<Integer, String>(); 
		//添加
		map.put(1001, "Tom");
		map.put(1002, "Jack");
		map.put(1003, "Jane");
		//获取
		String value = map.get(1001);
		System.out.println(value);
		//遍历两个
		Set<Integer> keys =  map.keySet();
		for(int key:keys){
			String val = map.get(key);
			System.out.println(key +"   "+val);
		}
		//遍历名字
		Collection<String>values = map.values();
		for(String val:values){
			System.out.println(val);
		}
	}
}