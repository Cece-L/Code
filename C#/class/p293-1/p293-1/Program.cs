using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace p293_1
{
    class Program
    {
        static void Main(string[] args)
        {
            int m = 2;
            byte n = 23;
            int result = m + n;
            Console.WriteLine("结果是:" + result);
            Console.WriteLine(byte.MaxValue);
            Console.WriteLine(byte.MinValue);
            Console.ReadLine();
        }
    }
}
