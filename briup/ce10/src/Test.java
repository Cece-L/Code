package com.briup.ce10;

public class Test
{
	public static void main(String[] args){
		Test test = new Test();
		test.test1();
	}
	public void test1(){
		
		/**
		��һ��
		*/
		//int[][] arr = new int [3][];
		//arr[0] = new int []{0,1,2};
		//arr[1] = new int [2];
		//arr[2] = new int []{1};
		
		
		/**
		�ڶ���
		*/
		//int[][] arr = new int [3][3];

		/**
		������
		*/
		//int [][]arr = new int[][]{
		//	new int []{1,2,3};
		//	new int [2];
		//	new int []{8};
		//}

		/**
		������
		*/
		int [][]arr ={{1,2,3},{0,0},{8}}; 



		for (int i = 0;i<arr.length ;i++ )
		{
			System.out.print("��"+(i+1)+"�����飺");
			for (int j = 0;j<arr[i].length ;j++ )
			{
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}
}