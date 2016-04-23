package com.briup.ce11;

public class Test
{
	public static void main(String[] ars){
		Test test = new Test();
		test.test1();
	}
	public void test1(){

		int[][]arr = {{1,2,3},{0,0},{8}};

		for (int i = 0;i <arr.length ;i++ )
		{
			System.out.print("第"+(i+1)+"个数组为：");
			for ( int j = 0;j<arr[i].length ;j++ )
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}
} 
