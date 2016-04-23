using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p100_7_11
{
    class Program
    {
        static void Main(string[] args)
        {
            int [,] arr = new int [3,2]{ { 321, 432 }, { 546, 7658, }, { 8769, 987 } };
            Console.Write("数组的行数为：");
            Console.Write(arr.GetLength(0));
            Console.WriteLine();
            Console.Write("数组的列数为：");
            Console.Write(arr.GetLength(1));
            Console.WriteLine();
            for (int i = 0; i < arr.GetLength(0);i ++ )
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    Console.Write(arr[i ,j ] +" "); 
                }
                Console.WriteLine();
            }
            Console.ReadLine();
        }
    }
}
