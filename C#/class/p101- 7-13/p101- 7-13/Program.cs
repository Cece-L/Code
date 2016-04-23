using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p101__7_13
{
    class Program
    {
        static void Main(string[] args)
        {
            int a, b;
            Console.WriteLine("请输入数组的行数：");
            a = Convert.ToInt32(Console .ReadLine  ());
            Console.WriteLine("请输入数组的列数：");
            b = Convert.ToInt32(Console .ReadLine ());
            Console.WriteLine("请输入数组个元素的值：");
            int [,]arr = new int [a ,b ];
            for (int i = 0; i < a; i++)
            {
                for (int j = 0; j < b; j++)
                {
                    arr[i , j ] = Convert.ToInt32(Console .ReadLine());

                }
            }
            Console.WriteLine("显示数组为：");
            for (int n = 0 ;n < a ;n ++)
            {
                for (int m = 0 ; m <b ; m ++)
                {
                    Console .Write (arr [n ,m  ]+" ");
                }
                Console .WriteLine ();
            }
            Console .ReadLine ();
        }
    }
}
