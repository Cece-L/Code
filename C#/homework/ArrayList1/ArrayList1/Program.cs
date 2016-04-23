using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;

namespace ArrayList1
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[] { 0, 1, 2, 3, 4, 5, };
            ArrayList List = new ArrayList(arr);
            Console.WriteLine("原始数组为;");
            foreach (int n in List )
            {
                Console.Write(" "+n+" ");
            }
            Console.WriteLine();
            List.Insert(0, 9);
            Console.WriteLine("插入后的数组为：");
            foreach (int n in List )
            {
                Console.Write(" "+n+" ");
            }
            Console.WriteLine();
            List.RemoveAt (5);
            Console.WriteLine("删除后的数组为：");
            foreach (int n in List)
            {
                Console.Write(" " + n + " ");
            }
            Console.WriteLine();
            List.Sort();
            Console.WriteLine("排序后的数组为：");
            foreach (int n in List)
            {
                Console.Write(" " + n + " ");
            }
            Console.ReadLine();
        }
    }
}
