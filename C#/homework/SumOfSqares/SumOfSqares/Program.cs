using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace SumOfSqares
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("请输入两个数：");
            double a = Convert.ToDouble(Console .ReadLine ());
            double b = Convert.ToDouble(Console.ReadLine());
            double c = a * a + b * b;
            Console.WriteLine("这两个数的平方和为："+c );
            Console.ReadLine();
        }
    }
}
