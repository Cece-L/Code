using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p97_7_5
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] arr = new int[5];
            Console.WriteLine("请输入一组数：");
            for (int i = 0; i < arr.Length; i++)
            {
                arr[i] = Convert.ToInt32(Console.ReadLine());
            }
            Console.WriteLine("显示输出后的数组：");
            foreach (int n in arr)
            {
                Console.Write("{0}" ,n + ",");

            }
            Console.ReadLine();
        }
        
    }
}
