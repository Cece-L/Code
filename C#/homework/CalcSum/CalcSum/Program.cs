using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CalcSum
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("请输入一个数字：");
            int a = Convert.ToInt32(Console .ReadLine ());

            int Sum = 0;
            int i = 0;
            while (i <= a)
            {
                Sum += i;
                i++;
            }
            Console.WriteLine(Sum );
            Console.ReadLine();
        }
    }
}
