package com.briup.ce17.pinterface;

public class Person extends Children implements 
							Student,Teacher{

	@Override
	public void Study() {
		// TODO Auto-generated method stub
		System.out.println("学习");
	}

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("教书");
	}

	@Override
	public void sj() {
		// TODO Auto-generated method stub
		System.out.println("撒娇");
	}

}
